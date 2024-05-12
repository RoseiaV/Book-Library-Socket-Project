package main.java.common;

import java.io.Serializable;

public class Accounts implements Serializable {
    private String accountImageName;
    private byte[] imageByte;
    private String id;
    private String name;
    private String username;
    private String password;
    private String course;
    private String bio;
    private String role;
    private Boolean status;
    private String statusString;

    public Accounts(String accountImageName, byte[] imageByte, String id, String name, String username, String password, String course, String role, Boolean status){
        this.accountImageName = accountImageName;
        this.imageByte = imageByte;
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.course = course;
        this.bio = bio;
        this.role = role;
        this.status = status;
    }

    public Accounts(String accountImageName, String id, String name, String username, String password, String course, String role, Boolean status){
        this.accountImageName = accountImageName;
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.course = course;
        this.bio = bio;
        this.role = role;
        this.status = status;
    }

    public Accounts(String id, String username, String password){
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Accounts(String id, String username){
        this.id = id;
        this.username = username;
    }

    public String getAccountImageName() {
        return accountImageName;
    }
    public byte[] getImageByte() { return imageByte; }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getCourse() {
        return course;
    }
    public String getBio() {
        return bio;
    }
    public String getRole() {
        return role;
    }
    public Boolean getStatus() {
        return status;
    }

    public void setAccountImageName(String accountImageName) {this.accountImageName = accountImageName;}
    public void setImageByte(byte[] imageByte) {this.imageByte = imageByte;}
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public void setBio(String bio) {
        this.bio = bio;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }

}
