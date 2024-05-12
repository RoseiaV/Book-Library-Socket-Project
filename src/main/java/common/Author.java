package main.java.common;

import java.io.Serializable;

public class Author implements Serializable {

    private String Author;

    private String dateCreated;
    private String dateUpdated;
    private Boolean Status;
    public Author(String Author, String dateCreated, String dateUpdated, Boolean Status){
        this.Author = Author;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
        this.Status = Status;
    }

    //Getters
    public String getAuthor() {
        return Author;
    }

    public Boolean getStatus() {
        return Status;
    }

    public String getDateCreated() {
        return dateCreated;
    }
    public String getDateUpdated() {
        return dateUpdated;
    }

    //Setters
    public void setAuthor(String author) {
        Author = author;
    }

    public void setStatus(Boolean status) {
        Status = status;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
    public void setDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
}
