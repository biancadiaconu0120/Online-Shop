package com.example.onlineshop.controllers;

import com.example.onlineshop.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class HomePageControllerManager {


    @FXML
    private Button viewNewOrders;

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
        Main m = new Main();
        m.changeScene("jacket-page-manager.fxml");
    }

    public void goToTrousersPage(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("trousers-page-manager.fxml");
    }

    public void goToDressPage(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("dress-page-manager.fxml");
    }

    public void goToBlousePage(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("blouse-page-manager.fxml");
    }


    public void goToNewOrdersPage(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("new-orders-page.fxml");
    }

    public void goToSignPage(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("login-page.fxml");
    }


}
