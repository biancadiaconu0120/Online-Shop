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
    private Button SignOutButton;

    @FXML
    private Button goToHomeButton;

    @FXML
    private Button clearCartButton;

    @FXML
    private Button CheckoutButton;

    @FXML
    private Button totalButton;
    @FXML
    private Label ItemId1Label, ItemId2Label, ItemId3Label, ItemId4Label, ItemId5Label;
    @FXML
    private Label ItemDetail1Label, ItemDetail2Label, ItemDetail3Label, ItemDetail4Label, ItemDetail5Label;
    @FXML
    private Label totalPriceLabel;
    @FXML
    private Label CheckoutMessageLabel;

    private int totalsum;


    public void goToSignPage(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("login-page.fxml");
    }

    public void goToHomePage(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("home-page-customer.fxml");
    }

    public void initialize() {
        for (int i = 0; i < CartItemsList.getItems().size(); i++) {
            if (i == 0) {
                ItemId1Label.setText(CartItemsList.getIdOfItem(0));
                ItemDetail1Label.setText(CartItemsList.getDetails1(0));
                totalsum = totalsum + CartItemsList.getPriceItems(0);

            } else if (i == 1) {
                ItemId2Label.setText(CartItemsList.getIdOfItem(1));
                ItemDetail2Label.setText(CartItemsList.getDetails1(1));
                totalsum = totalsum + CartItemsList.getPriceItems(1);

            } else if (i == 2) {
                ItemId3Label.setText(CartItemsList.getIdOfItem(2));
                ItemDetail3Label.setText(CartItemsList.getDetails1(2));
                totalsum = totalsum + CartItemsList.getPriceItems(2);

            } else if (i == 3) {
                ItemId4Label.setText(CartItemsList.getIdOfItem(3));
                ItemDetail4Label.setText(CartItemsList.getDetails1(3));
                totalsum = totalsum + CartItemsList.getPriceItems(3);
            } else if (i == 4) {
                ItemId5Label.setText(CartItemsList.getIdOfItem(4));
                ItemDetail5Label.setText(CartItemsList.getDetails1(4));
                totalsum = totalsum + CartItemsList.getPriceItems(4);

            }


        }
        totalPriceLabel.setText("" + totalsum + " RON");


    }

    public void clearCart(ActionEvent event) throws IOException {
        CartItemsList.clear();
        goToCartPage(event);

    }

    public void goToCartPage(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("cart-page.fxml");
    }

    public void Checkout(ActionEvent event) throws IOException {
        if (totalsum != 0) {
            CheckoutMessageLabel.setVisible(true);
            CheckoutMessageLabel.setText("Your order has been placed!");
        } else {
            CheckoutMessageLabel.setVisible(true);
            CheckoutMessageLabel.setText("Your order has NOT been placed!");

        }


    }


}
