package com.ddg.sgah.data.model;

/**
 * Created by Mostafa khedr on 16,يوليو,2019
 */
public class Users {
    private String userName;
    private String password;
    private String email;
    private String specializations;
    private String profileImage;

    public Users(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Users(String userName, String password, String email, String specializations, String profileImage) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.specializations = specializations;
        this.profileImage = profileImage;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public Users(String userName, String password, String email, String specializations) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.specializations = specializations;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSpecializations() {
        return specializations;
    }

    public void setSpecializations(String specializations) {
        this.specializations = specializations;
    }
}
