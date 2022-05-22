package com.example.onlineshop.model;

import com.example.onlineshop.exceptions.UsernameAlreadyExistsException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Objects;

public class UsersList {
    private static ArrayList<User> users = new ArrayList<>();

    public static void addUser(User newUser) throws UsernameAlreadyExistsException {
        checkUserDoesNotAlreadyExist(newUser.getUsername());
        users.add(newUser);
    }

    private static void checkUserDoesNotAlreadyExist(String username) throws UsernameAlreadyExistsException {
        for (User user : users) {
            if (Objects.equals(username, user.getUsername()))
                throw new UsernameAlreadyExistsException(username);
        }
    }

    public static boolean checkUserCredentials(User user) {
        return users.contains(user);
    }

    @Override
    public String toString() {
        return users.toString();
    }

    public static void loadUsersFromFile() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            users = objectMapper.readValue(Paths.get("users.json").toFile(), new TypeReference<ArrayList<User>>() {
            });
        } catch (JsonParseException e) {

            e.printStackTrace();
        }
    }

    public static void persistUsers() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("users.json"), UsersList.getUsers());
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }


    public static ArrayList<User> getUsers() {
        return users;
    }
}
