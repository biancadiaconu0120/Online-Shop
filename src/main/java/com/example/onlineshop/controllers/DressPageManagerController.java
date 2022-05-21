package com.example.onlineshop.controllers;

import com.example.onlineshop.Main;
import com.example.onlineshop.model.Item;
import com.example.onlineshop.model.ItemsList;
import com.example.onlineshop.services.AddItem;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.util.ArrayList;

public class DressPageManagerController {

    @FXML
    private Button viewNewOrders;

    @FXML
    private Button SignOut;

    @FXML
    private Button goToHome;

    @FXML
    private Button edit1,edit2,edit3,edit4,edit5,edit6,edit7,edit8,edit9;

    @FXML
    private Button delete1,delete2,delete3,delete4,delete5,delete6,delete7,delete8,delete9;

    @FXML
    private ImageView image1;

    @FXML
    private ImageView image2;
    @FXML
    private ImageView image3;
    @FXML
    private ImageView image4;
    @FXML
    private ImageView image5;
    @FXML
    private ImageView image6;
    @FXML
    private ImageView image7;
    @FXML
    private ImageView image8;
    @FXML
    private ImageView image9;

    ArrayList<Item> dresses= new ArrayList<Item>(9);
    private int dressesNb=0;


    public DressPageManagerController() {

    }

    public void goToHomePage(ActionEvent event) throws IOException {
        Main m= new Main();
        m.changeScene("home-page-manager.fxml");
    }

    public void goToNewOrdersPage(ActionEvent event) throws IOException {
        Main m= new Main();
        m.changeScene("new-orders-page.fxml");
    }

    public void goToSignPage(ActionEvent event) throws IOException {
        Main m= new Main();
        m.changeScene("login-page.fxml");
    }

    public void goToAddItemPage(ActionEvent event) throws IOException {
        Main m= new Main();
        m.changeScene("add-item-page.fxml");
    }

    public void deleteItem1() throws IOException {
            ItemsList.getItems().remove(dresses.get(0));
            ItemsList.getImages().remove(0);
            dresses.remove(0);
            dressesNb=0;
            Main m= new Main();
            m.changeScene("dress-page-manager.fxml");
            loadImages();
            AddItem.persistItems();
    }

    public void deleteItem2() throws IOException {
        ItemsList.getItems().remove(dresses.get(1));
        ItemsList.getImages().remove(1);
        dresses.remove(1);
        dressesNb=0;
        Main m= new Main();
        m.changeScene("dress-page-manager.fxml");
        loadImages();
        AddItem.persistItems();
    }

    public void deleteItem3() throws IOException {
        ItemsList.getItems().remove(dresses.get(2));
        ItemsList.getImages().remove(2);
        dresses.remove(2);
        dressesNb=0;
        Main m= new Main();
        m.changeScene("dress-page-manager.fxml");
        loadImages();
        AddItem.persistItems();
    }

    public void deleteItem4() throws IOException {
        ItemsList.getItems().remove(dresses.get(3));
        ItemsList.getImages().remove(3);
        dresses.remove(3);
        dressesNb=0;
        Main m= new Main();
        m.changeScene("dress-page-manager.fxml");
        loadImages();
        AddItem.persistItems();
    }

    public void deleteItem5() throws IOException {
        ItemsList.getItems().remove(dresses.get(4));
        ItemsList.getImages().remove(4);
        dresses.remove(4);
        dressesNb=0;
        Main m= new Main();
        m.changeScene("dress-page-manager.fxml");
        loadImages();
        AddItem.persistItems();
    }

    public void deleteItem6() throws IOException {
        ItemsList.getItems().remove(dresses.get(5));
        ItemsList.getImages().remove(5);
        dresses.remove(5);
        dressesNb=0;
        Main m= new Main();
        m.changeScene("dress-page-manager.fxml");
        loadImages();
        AddItem.persistItems();
    }

    public void deleteItem7() throws IOException {
        ItemsList.getItems().remove(dresses.get(6));
        ItemsList.getImages().remove(6);
        dresses.remove(6);
        dressesNb=0;
        Main m= new Main();
        m.changeScene("dress-page-manager.fxml");
        loadImages();
        AddItem.persistItems();
    }

    public void deleteItem8() throws IOException {
        ItemsList.getItems().remove(dresses.get(7));
        ItemsList.getImages().remove(7);
        dresses.remove(7);
        dressesNb=0;
        Main m= new Main();
        m.changeScene("dress-page-manager.fxml");
        loadImages();
        AddItem.persistItems();
    }

    public void deleteItem9() throws IOException {
        ItemsList.getItems().remove(dresses.get(8));
        ItemsList.getImages().remove(8);
        dresses.remove(8);
        dressesNb=0;
        Main m= new Main();
        m.changeScene("dress-page-manager.fxml");
        loadImages();
        AddItem.persistItems();
    }

    public void editItem(){

    }


    public void initialize(){
        loadImages();
    }


    private void loadImages(){
        int l = ItemsList.getImages().size();
        for (int i = 0; i < l; i++)
            loadImage(ItemsList.getItems().get(i), ItemsList.getImages().get(i));
    }

    public void loadImage(Item item, Image img){
        if(item.getCategory().equals("dress")) {
            dressesNb++;
            switch(dressesNb){
                case 1: image1.setImage(img);
                        delete1.setVisible(true);
                        dresses.add(0,item);
                    break;
                case 2: image2.setImage(img);
                        delete2.setVisible(true);
                        dresses.add(1,item);
                    break;
                case 3: image3.setImage(img);
                        delete3.setVisible(true);
                        dresses.add(2,item);
                    break;
                case 4: image4.setImage(img);
                        delete4.setVisible(true);
                        dresses.add(3,item);
                    break;
                case 5: image5.setImage(img);
                        delete5.setVisible(true);
                        dresses.add(4,item);
                    break;
                case 6: image6.setImage(img);
                        delete6.setVisible(true);
                        dresses.add(5,item);
                    break;
                case 7: image7.setImage(img);
                        delete7.setVisible(true);
                        dresses.add(6,item);
                    break;
                case 8: image8.setImage(img);
                        delete8.setVisible(true);
                        dresses.add(7,item);
                    break;
                case 9: image9.setImage(img);
                        delete9.setVisible(true);
                        dresses.add(8,item);
                    break;
                default: throw new NullPointerException();
            }
        }
    }

}
