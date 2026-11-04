package com.college.noticeboard.repository;

import com.college.noticeboard.model.Notice;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface NoticeRepository extends JpaRepository<Notice, Long> {
    List<Notice> findByTitleContainingIgnoreCaseOrContentContainingIgnoreCase(String title, String content);
}
