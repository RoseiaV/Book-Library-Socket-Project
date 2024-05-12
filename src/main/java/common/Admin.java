package main.java.common;

import java.io.Serializable;

public class Admin implements Serializable {
    private String username;
    private String password;
    private String dateCreated;
    private String dateUpdated;
    public Admin(String username, String password, String dateCreated, String dateUpdated){
        this.username = username;
        this.password = password;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
    }
    public Admin(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getDateCreated() {
        return dateCreated;
    }
    public String getDateUpdated() {
        return dateUpdated;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
    public void setDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
}
