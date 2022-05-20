package com.example.onlineshop.controllers;

import com.example.onlineshop.Main;
import com.example.onlineshop.model.Item;
import com.example.onlineshop.model.ItemsList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class TrousersPageCustomerController {
    @FXML
    private Button goToCart;

    @FXML
    private Button viewPreviousOrders;

    @FXML
    private Button SignOut;

    @FXML
    private Button goToHome;

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


    public void goToCartPage(ActionEvent event) throws IOException {
        Main m= new Main();
        m.changeScene("cart-page.fxml");
    }

    public void goToPreviousOrdersPage(ActionEvent event) throws IOException {
        Main m= new Main();
        m.changeScene("previous-orders-page.fxml");
    }

    public void goToSignPage(ActionEvent event) throws IOException {
        Main m= new Main();
        m.changeScene("login-page.fxml");
    }

    public void initialize(){
        //instance = this;
        loadImages();
    }

    private int trousersNb=0;
    private void loadImages(){
        int l = ItemsList.getImages().size();
        for (int i = 0; i < l; i++)
            loadImage(ItemsList.getItems().get(i), ItemsList.getImages().get(i));
    }

    public void loadImage(Item item, Image img){
        if(item.getCategory().equals("trousers")) {
            trousersNb++;
            switch(trousersNb){
                case 1: image1.setImage(img);
                    break;
                case 2: image2.setImage(img);
                    break;
                case 3: image3.setImage(img);
                    break;
                case 4: image4.setImage(img);
                    break;
                case 5: image5.setImage(img);
                    break;
                case 6: image6.setImage(img);
                    break;
                case 7: image7.setImage(img);
                    break;
                case 8: image8.setImage(img);
                    break;
                case 9: image9.setImage(img);
                    break;
                default: throw new NullPointerException();
            }
        }
    }

    public void goToHomePage(ActionEvent event) throws IOException {
        Main m= new Main();
        m.changeScene("home-page-customer.fxml");
    }
}
