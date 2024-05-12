package main.java.common;

import java.io.Serializable;

public class Category implements Serializable {

    private String category;

    private String dateCreated;
    private String dateUpdated;
    private Boolean status;
    public Category(String category, String dateCreated, String dateUpdated, Boolean status){
        this.category = category;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
        this.status = status;
    }

    public String getCategory() {
        return category;
    }
    public Boolean getStatus() {
        return status;
    }
    public String getDateCreated() {
        return dateCreated;
    }
    public String getDateUpdated() {
        return dateUpdated;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
    public void setDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
}
