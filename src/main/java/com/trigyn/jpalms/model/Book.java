package com.trigyn.jpalms.model;

public class Book {

    private Long id;
    private String bookTitle;
    private String bookAuthor;
    private String userIssued;
    private String issueDate;
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
        return "Book{" +
                "id=" + id +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", userIssued='" + userIssued + '\'' +
                ", issueDate='" + issueDate + '\'' +
                ", returnDate='" + returnDate + '\'' +
                '}';
    }
}
