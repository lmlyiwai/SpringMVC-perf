package com.jxust.svsh.controller;


/**
 * Created by mengleil on 4/14/2017.
 */
public class User {
    private String date;
    public User() {
        super();
    }

    public User(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
