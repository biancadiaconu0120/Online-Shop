package com.example.onlineshop.model;

import javafx.scene.image.Image;

import java.util.ArrayList;

public class CartItemsList {
    //array list de item si sa aiba 5 itemuri, sa verifi mereu ca nr sa nu depaseasca 5 atunci cand adaugi
    //array de size care corespude la array de item
    private static ArrayList<Item>cartItemsList = new ArrayList<>(5);
    private static ArrayList<String> sizeList = new ArrayList<>(5);
    public static void add(Item newItem,String size){
        //aici verifici sa nu fie mai mult de 5
        if(cartItemsList.size()<5) {
            cartItemsList.add(newItem);
            sizeList.add(size);
        }

    }
    public static String getIdOfItem(int index){
        return cartItemsList.get(index).getName().toString();
    }


   @Override
    public  String toString() {
        return cartItemsList.toString();
    }
    public static ArrayList<Item> getItems() {
        return cartItemsList;
    }
}
