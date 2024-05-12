package main.java.common;

import java.io.Serializable;

public class Books implements Serializable {
    private String FileName;
    private byte[] pictureBytes;
    private String ISBN;
    private String BookName;
    private String Author;
    private String Category;
    private String Language;
    private String PublishedDate;
    private String Description;
    private Boolean Status;
    private String statusString;

    public Books(String FileName, byte[] pictureBytes, String ISBN, String BookName, String Author, String Category, String Language, String PublishedDate, String Description, Boolean Status){
        this.FileName = FileName;
        this.pictureBytes = pictureBytes;
        this.ISBN = ISBN;
        this.BookName = BookName;
        this.Author = Author;
        this.Category = Category;
        this.Language = Language;
        this.PublishedDate = PublishedDate;
        this.Description = Description;
        this.Status = Status;
    }

    public Books(String FileName, String ISBN, String BookName, String Author, String Category, String Language, String PublishedDate, String Description, Boolean Status){
        this.FileName = FileName;
        this.ISBN = ISBN;
        this.BookName = BookName;
        this.Author = Author;
        this.Category = Category;
        this.Language = Language;
        this.PublishedDate = PublishedDate;
        this.Description = Description;
        this.Status = Status;
    }

    //Getters

    public String getFileName() {
        return FileName;
    }

    public byte[] getPictureBytes() {
        return pictureBytes;
    }

    public String getISBN() {
        return ISBN;
    }
    public String getBookName() {
        return BookName;
    }
    public String getAuthor() {
        return Author;
    }
    public String getCategory() {
        return Category;
    }
    public String getLanguage() {
        return Language;
    }
    public String getPublishedDate() {
        return PublishedDate;
    }
    public String getDescription() {
        return Description;
    }
    public Boolean getStatus() {
        return Status;
    }

    //Setters

    public void setFileName(String fileName) {
        FileName = fileName;
    }
    public void setPictureBytes(byte[] pictureBytes) {
        this.pictureBytes = pictureBytes;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public void setBookName(String bookName) {
        BookName = bookName;
    }
    public void setAuthor(String author) {
        Author = author;
    }
    public void setCategory(String category) {
        Category = category;
    }
    public void setLanguage(String language) {
        Language = language;
    }
    public void setPublishedDate(String publishedDate) {
        PublishedDate = publishedDate;
    }
    public void setDescription(String description) {
        Description = description;
    }
    public void setStatus(Boolean status) {
        Status = status;
    }

    public void setStatusString(String statusString) {
    }
}
