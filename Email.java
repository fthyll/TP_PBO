package TP_MOD_10_1301213389_MUHAMMADFATIHYUMNA;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class Email {
    private int id;
    private String sender;
    private String subject;
    private String content;
    private LocalDate date;
    private boolean starred;

    // Constructors
    public Email(int id, String sender, String subject, String content, LocalDate date, boolean starred) {
        this.id = id;
        this.sender = sender;
        this.subject = subject;
        this.content = content;
        this.date = date;
        this.starred = starred;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isStarred() {
        return starred;
    }

    public void setStarred(boolean starred) {
        this.starred = starred;
    }

    // Display method
    public void display() {
        System.out.println("Email ID: " + id);
        System.out.println("Sender: " + sender);
        System.out.println("Subject: " + subject);
        System.out.println("Content: " + content);
        System.out.println("Date: " + date);
        System.out.println("Starred: " + starred);
        System.out.println();
    }
}
