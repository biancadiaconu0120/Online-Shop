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
    private Button clearCartButton;

    @FXML
    private Button Checkout;

    @FXML
    private Button total;
    @FXML
    private Label ItemId1,ItemId2,ItemId3,ItemId4,ItemId5;
    @FXML
    private Label ItemDetail1,ItemDetail2,ItemDetail3,ItemDetail4,ItemDetail5;
    @FXML
    private Label totalPrice;
    @FXML
    private Label CheckoutMessage;

    private int totalsum;



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
            if(i==0) {
                ItemId1.setText(CartItemsList.getIdOfItem(0));
                ItemDetail1.setText(CartItemsList.getDetails1(0));
                totalsum=totalsum+CartItemsList.getPriceItems(0);

            }
            else if(i==1){
                ItemId2.setText(CartItemsList.getIdOfItem(1));
                ItemDetail2.setText(CartItemsList.getDetails1(1));
                totalsum=totalsum+CartItemsList.getPriceItems(1);

            }
            else if(i==2){
                ItemId3.setText(CartItemsList.getIdOfItem(2));
                ItemDetail3.setText(CartItemsList.getDetails1(2));
                totalsum=totalsum+CartItemsList.getPriceItems(2);

            }
            else if(i==3){
                ItemId4.setText(CartItemsList.getIdOfItem(3));
                ItemDetail4.setText(CartItemsList.getDetails1(3));
                totalsum=totalsum+CartItemsList.getPriceItems(3);
            }
            else if(i==4){
                ItemId5.setText(CartItemsList.getIdOfItem(4));
                ItemDetail5.setText(CartItemsList.getDetails1(4));
                totalsum=totalsum+CartItemsList.getPriceItems(4);

            }


        }
        totalPrice.setText(""+totalsum+" RON");


    }
   public void clearCart(ActionEvent event) throws IOException {
       CartItemsList.clear();
       goToCartPage(event);

   }
    public void goToCartPage(ActionEvent event) throws IOException {
        Main m= new Main();
        m.changeScene("cart-page.fxml");
    }
    public void Checkout(ActionEvent event) throws IOException {
            if(totalsum!=0) {
                CheckoutMessage.setVisible(true);
                CheckoutMessage.setText("Your order has been placed!");
            }
            else
            {
                CheckoutMessage.setVisible(true);
                CheckoutMessage.setText("Your order has NOT been placed!");

            }


    }











}
