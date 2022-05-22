package com.example.onlineshop.services;

import com.example.onlineshop.model.Item;
import com.example.onlineshop.model.ItemsList;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.scene.image.Image;

import java.io.File;
import java.io.IOException;

public class AddItem {
    public static void addItem(String name, String price, String imgPath, String category) throws IOException {
        ItemsList.addItem(new Item(name, price, imgPath, category));
        persistItems();
    }

    public static void persistItems() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("items.json"), ItemsList.getItems());
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
