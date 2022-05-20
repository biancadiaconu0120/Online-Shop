package com.example.onlineshop.model;

import com.example.onlineshop.Main;
import com.example.onlineshop.controllers.BlousePageManagerController;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.scene.image.Image;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;

import javafx.embed.swing.SwingFXUtils;

public class ItemsList {
    private static ArrayList<Item> items = new ArrayList<>(36);
    private static ArrayList<Image> images = new ArrayList<>(36);
    private static int blousesNo;
    private static int trousersNo;
    private static int jacketsNo;
    private static int dressesNo;

    public ItemsList() {
        blousesNo=0;
        trousersNo=0;
        jacketsNo=0;
        dressesNo=0;
    }

    private static Image readImage(String path) {
        BufferedImage bf = null;
        //Image img;
        try {
            bf = ImageIO.read(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return SwingFXUtils.toFXImage(bf, null);
    }

    public static void addItem(Item newItem) throws IOException {
        Image image = readImage(newItem.getImgPath());
        if (newItem.getCategory().equals("blouse")) {
            blousesNo = blousesNo + 1;
            items.add(newItem);
            images.add(image);
            BlousePageManagerController.getInstance().loadImage(newItem, image);
        }
    }


    public static void loadItemsFromFile() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            items = objectMapper.readValue(Paths.get("items.json").toFile(), new TypeReference<>() {});
        } catch (JsonParseException e) {

            e.printStackTrace();
        }

        for (Item auxItem : items) {
            Image image = readImage(auxItem.getImgPath());
            if (auxItem.getCategory().equals("blouse")) {
                if(blousesNo < 9) {
                    blousesNo = blousesNo + 1;
                    images.add(image);
                }
            }
        }
    }


    @Override
    public String toString() {
        return items.toString();
    }

    public static ArrayList<Item> getItems() {
        return items;
    }

    public static ArrayList<Image> getImages() {
        return images;
    }
}
