package com.example.mp_group_project.ui.login;

public class User {

    private String fullName;
    private String studentId;
    private String batch;
    private String division;
    private String birthday;
    private String gender;
    private String email;

    public User(String fullName, String studentId, String batch, String division, String birthday, String gender, String email, String password) {
        // Empty constructor needed for Firestore
    }

    public User(String fullName, String studentId, String batch, String division, String birthday, String gender) {
        this.fullName = fullName;
        this.studentId = studentId;
        this.batch = batch;
        this.division = division;
        this.birthday = birthday;
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

