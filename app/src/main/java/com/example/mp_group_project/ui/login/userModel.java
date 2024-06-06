package com.example.mp_group_project.ui.login;

public class userModel {

        public String username;
        public String email;


        public void UserModel() {
            // Default constructor required for calls to DataSnapshot.getValue(User.class)
        }

        public void UserModel(String username, String email) {
            this.username = username;
            this.email = email;
        }

    }
