package com.example.onlineshop.model;

public class Item {
    private String name;
    private String path;
    private String imgPath;

    public Item(String name, String path, String imgPath) {
        this.name = name;
        this.path = path;
        this.imgPath = imgPath;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public String getImgPath() {
        return imgPath;
    }
}
