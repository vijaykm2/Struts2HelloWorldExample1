package com.vijay.user.action;

/**
 * Created by VMikkilineni on 5/20/2015.
 */
public class WelcomeUserAction {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // all struts logic here
    public String execute() {

        return "SUCCESS";

    }
}
