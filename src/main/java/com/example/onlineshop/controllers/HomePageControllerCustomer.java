package com.example.onlineshop.controllers;

import com.example.onlineshop.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class HomePageControllerCustomer {
    @FXML
    private Button goToCart;

    @FXML
    private Button viewPreviousOrders;

    @FXML
    private Button SignOut;

    @FXML
    private Button blouseCategory;

    @FXML
    private Button dressCategory;

    @FXML
    private Button trousersCategory;

    @FXML
    private Button jacketCategory;

    public void goToJacketPage(ActionEvent event) throws IOException {
        Main m= new Main();
        m.changeScene("jacket-page-customer.fxml");
    }

    public void goToTrousersPage(ActionEvent event) throws IOException {
        Main m= new Main();
        m.changeScene("trousers-page-customer.fxml");
    }

    public void goToDressPage(ActionEvent event) throws IOException {
        Main m= new Main();
        m.changeScene("dress-page-customer.fxml");
    }

    public void goToBlousePage(ActionEvent event) throws IOException {
        Main m= new Main();
        m.changeScene("blouse-page-customer.fxml");
    }

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



}
