package main.java.common;

import java.io.Serializable;

public class Language implements Serializable {
    private String language;
    private String dateCreated;
    private String dateUpdated;
    private Boolean status;

    public Language(String language, String dateCreated, String dateUpdated, Boolean status){
        this.language = language;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
        this.status = status;
    }

    public String getLanguage() {
        return language;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public String getDateUpdated() {
        return dateUpdated;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
