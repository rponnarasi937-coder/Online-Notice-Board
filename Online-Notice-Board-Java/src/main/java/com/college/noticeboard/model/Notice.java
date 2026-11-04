package com.college.noticeboard.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Notice {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(length = 4000)
    private String content;
    private String category;
    private String postedBy;
    private LocalDate postedDate;
    private LocalDate expiryDate;
    private boolean important;

    public Notice() {}
    public Notice(String title, String content, String category, String postedBy,
                  LocalDate postedDate, LocalDate expiryDate, boolean important) {
        this.title = title; this.content = content; this.category = category;
        this.postedBy = postedBy; this.postedDate = postedDate;
        this.expiryDate = expiryDate; this.important = important;
    }
    public Long getId(){return id;} public void setId(Long id){this.id=id;}
    public String getTitle(){return title;} public void setTitle(String v){title=v;}
    public String getContent(){return content;} public void setContent(String v){content=v;}
    public String getCategory(){return category;} public void setCategory(String v){category=v;}
    public String getPostedBy(){return postedBy;} public void setPostedBy(String v){postedBy=v;}
    public LocalDate getPostedDate(){return postedDate;} public void setPostedDate(LocalDate v){postedDate=v;}
    public LocalDate getExpiryDate(){return expiryDate;} public void setExpiryDate(LocalDate v){expiryDate=v;}
    public boolean isImportant(){return important;} public void setImportant(boolean v){important=v;}
}
