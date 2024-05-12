package main.java.common;

import java.io.Serializable;

public class Role implements Serializable {
    private String role;
    private String dateCreated;
    private String dateUpdated;
    private Boolean status;

    public Role(String role, String dateCreated, String dateUpdated, Boolean status){
        this.role = role;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
        this.status = status;
    }

    public String getRole() {
        return role;
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

    public void setRole(String role) {
        this.role = role;
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
