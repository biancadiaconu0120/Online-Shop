package com.example.onlineshop.model;

public class DataHolderForCurrentUser {
    private static User currentUser= new User();

    public DataHolderForCurrentUser(User currentUser) {
        this.currentUser=currentUser;
    }

    public DataHolderForCurrentUser(){

    }

    public static User getCurrentUser() {
        return currentUser;
    }

    public static void setCurrentUser(User currentUser) {
        DataHolderForCurrentUser.currentUser = currentUser;
    }
}
