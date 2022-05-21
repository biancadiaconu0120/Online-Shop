package com.example.onlineshop.controllers;

import com.example.onlineshop.Main;
import com.example.onlineshop.model.CartItemsList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class CartPageController {
    @FXML
    private Button SignOut;

    @FXML
    private Button goToHome;

    @FXML
    private Button removeAll;

    @FXML
    private Button Checkout;

    @FXML
    private Button total;
    @FXML
    private Label ItemId1,ItemId2,ItemId3,ItemId4,ItemId5;


    public void goToSignPage(ActionEvent event) throws IOException {
        Main m= new Main();
        m.changeScene("login-page.fxml");
    }
    public void goToHomePage(ActionEvent event) throws IOException {
        Main m= new Main();
        m.changeScene("home-page-customer.fxml");
    }
    public void initialize(){
        for(int i=0;i< CartItemsList.getItems().size();i++){
            if(i==0)
                ItemId1.setText(CartItemsList.getIdOfItem(0));
            else if(i==1)
                ItemId2.setText(CartItemsList.getIdOfItem(1));
            else if(i==2)
                ItemId3.setText(CartItemsList.getIdOfItem(2));
            else if(i==3)
                ItemId4.setText(CartItemsList.getIdOfItem(3));
            else if(i==4)
                ItemId5.setText(CartItemsList.getIdOfItem(4));
        }
    }







}
