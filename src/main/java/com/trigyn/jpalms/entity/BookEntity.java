package com.trigyn.jpalms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookEntity {

    @Id
    private Long id;
    @Column(name = "book_title")
    private String bookTitle;
    @Column(name = "book_author")
    private String bookAuthor;
    @Column(name = "user_issued")
    private String userIssued;
    @Column(name = "issue_date")
    private String issueDate;
    @Column(name = "return_date")
    private String returnDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getUserIssued() {
        return userIssued;
    }

    public void setUserIssued(String userIssued) {
        this.userIssued = userIssued;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "BookEntity{" +
                "id=" + id +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", userIssued='" + userIssued + '\'' +
                ", issueDate='" + issueDate + '\'' +
                ", returnDate='" + returnDate + '\'' +
                '}';
    }
}
