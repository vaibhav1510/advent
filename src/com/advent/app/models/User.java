package com.advent.app.models;

import com.mysql.jdbc.StringUtils;

/**
 * Created by cb-vaibhav on 12/11/17.
 */
public class User {

    private String email;
    private String password;

    public String password() {
        return password;
    }

    public User password(String password) {
        this.password = password;
        return this;
    }

    public String email() {
        return email;
    }

    public User email(String email) {
        this.email = email;
        return this;
    }
}
