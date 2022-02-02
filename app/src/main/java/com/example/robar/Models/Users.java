package com.example.robar.Models;

public class Users {
    String profilePic, mail, userName, userId, lastMessage, password, status;

    public Users() {

    }

    public Users(String profilePic, String mail, String userName, String userId, String lastMessage, String password, String status) {
        this.profilePic = profilePic;
        this.mail = mail;
        this.userName = userName;
        this.userId = userId;
        this.lastMessage = lastMessage;
        this.password = password;
        this.status = status;
    }

    public Users(String mail, String userName, String password) {
        this.mail = mail;
        this.userName = userName;
        this.password = password;

    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId(String key) {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
