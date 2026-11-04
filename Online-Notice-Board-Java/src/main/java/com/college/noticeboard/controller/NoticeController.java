package com.college.noticeboard.controller;

import com.college.noticeboard.model.Notice;
import com.college.noticeboard.repository.NoticeRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Controller
public class NoticeController {
    private final NoticeRepository repo;
    public NoticeController(NoticeRepository repo) { this.repo = repo; }

    private boolean loggedIn(HttpSession s) { return s.getAttribute("username") != null; }
    private boolean canPost(HttpSession s) {
        Object role=s.getAttribute("role"); return "ADMIN".equals(role) || "FACULTY".equals(role);
    }

    @GetMapping("/")
    public String home(@RequestParam(required=false) String q, Model model, HttpSession session) {
        List<Notice> notices = (q == null || q.isBlank()) ? repo.findAll() :
            repo.findByTitleContainingIgnoreCaseOrContentContainingIgnoreCase(q, q);
        notices.removeIf(n -> n.getExpiryDate()!=null && n.getExpiryDate().isBefore(LocalDate.now()));
        notices.sort((a,b) -> {
            int important = Boolean.compare(b.isImportant(), a.isImportant());
            if (important != 0) return important;
            return b.getPostedDate().compareTo(a.getPostedDate());
        });
        model.addAttribute("notices", notices);
        model.addAttribute("q", q == null ? "" : q);
        model.addAttribute("username", session.getAttribute("username"));
        model.addAttribute("role", session.getAttribute("role"));
        return "home";
    }

    @GetMapping("/login") public String login() { return "login"; }

    @PostMapping("/login")
    public String doLogin(@RequestParam String username, @RequestParam String password,
                          HttpSession session, Model model) {
        Map<String,String[]> users = Map.of(
            "admin", new String[]{"admin123","ADMIN"},
            "faculty", new String[]{"faculty123","FACULTY"},
            "student", new String[]{"student123","STUDENT"}
        );
        String[] account = users.get(username.toLowerCase());
        if (account != null && account[0].equals(password)) {
            session.setAttribute("username", username.toLowerCase());
            session.setAttribute("role", account[1]);
            return "redirect:/";
        }
        model.addAttribute("error", "Invalid username or password.");
        return "login";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) { session.invalidate(); return "redirect:/"; }

    @GetMapping("/notices/new")
    public String newNotice(HttpSession session, Model model) {
        if (!loggedIn(session)) return "redirect:/login";
        if (!canPost(session)) return "redirect:/";
        model.addAttribute("notice", new Notice());
        model.addAttribute("pageTitle", "Post a Notice");
        return "notice-form";
    }

    @PostMapping("/notices/save")
    public String save(@ModelAttribute Notice notice, HttpSession session) {
        if (!loggedIn(session) || !canPost(session)) return "redirect:/login";
        notice.setPostedBy((String)session.getAttribute("username"));
        notice.setPostedDate(LocalDate.now());
        repo.save(notice);
        return "redirect:/";
    }

    @GetMapping("/notices/edit/{id}")
    public String edit(@PathVariable Long id, HttpSession session, Model model) {
        if (!loggedIn(session) || !canPost(session)) return "redirect:/login";
        Notice notice = repo.findById(id).orElseThrow();
        model.addAttribute("notice", notice);
        model.addAttribute("pageTitle", "Edit Notice");
        return "notice-form";
    }

    @PostMapping("/notices/update/{id}")
    public String update(@PathVariable Long id, @ModelAttribute Notice form, HttpSession session) {
        if (!loggedIn(session) || !canPost(session)) return "redirect:/login";
        Notice n = repo.findById(id).orElseThrow();
        n.setTitle(form.getTitle()); n.setContent(form.getContent());
        n.setCategory(form.getCategory()); n.setExpiryDate(form.getExpiryDate());
        n.setImportant(form.isImportant()); repo.save(n);
        return "redirect:/";
    }

    @PostMapping("/notices/delete/{id}")
    public String delete(@PathVariable Long id, HttpSession session) {
        if (loggedIn(session) && "ADMIN".equals(session.getAttribute("role"))) repo.deleteById(id);
        return "redirect:/";
    }
}
