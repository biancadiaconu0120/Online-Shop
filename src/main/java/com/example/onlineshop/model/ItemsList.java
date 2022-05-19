package com.example.onlineshop.model;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ItemsList {
    private static ArrayList<Item> items= new ArrayList<Item>(9);

    public static void addItem(Item newItem) {
        items.add(newItem);
    }


    public static void loadItemsFromFile() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            items = objectMapper.readValue(Paths.get("items.json").toFile(), new TypeReference<ArrayList<Item>>() {
            });
        }catch(JsonParseException e){

            e.printStackTrace();
        }
    }


    @Override
    public String toString() {
        return items.toString();
    }

    public static ArrayList<Item> getItems() {
        return items;
    }
}
