package com.model;

public class User {
    private String login;
    private String password;
    private String email;
    private boolean isMale;


    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", isMale=" + isMale +
                '}';
    }

    public User() {
    }

    public User(String login, String password, String email, boolean isMale) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.isMale = isMale;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }
}
