package com.example.onlineshop.model;


import static com.example.onlineshop.services.Encoding.encodePassword;

public class User {

    public String username;
    public String password;
    public String role;

    public User() {
    }

    public User(String username, String password, String role) {
        this.username = username;
        this.password = encodePassword(username, password);
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!username.equals(user.username)) return false;
        if (!password.equals(user.password)) return false;
        return role.equals(user.role);
    }


}
