package com.example.onlineshop.controllers;

import com.example.onlineshop.Main;
import com.example.onlineshop.model.CartItemsList;
import com.example.onlineshop.model.Item;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;

import java.io.IOException;
import java.util.ArrayList;

public abstract class CustomerController extends UserController {
    @FXML
    private Button goToCart;

    @FXML
    private Button viewPreviousOrders;

    @FXML
    private Button add1, add2, add3, add4, add5, add6, add7, add8, add9;

    @FXML
    private Label AddMessage1, AddMessage2, AddMessage3, AddMessage4, AddMessage5, AddMessage6, AddMessage7, AddMessage8, AddMessage9;

    @FXML
    private ChoiceBox<String> size1;
    @FXML
    private ChoiceBox<String> size2;
    @FXML
    private ChoiceBox<String> size3;
    @FXML
    private ChoiceBox<String> size4;
    @FXML
    private ChoiceBox<String> size5;
    @FXML
    private ChoiceBox<String> size6;
    @FXML
    private ChoiceBox<String> size7;
    @FXML
    private ChoiceBox<String> size8;
    @FXML
    private ChoiceBox<String> size9;

    private String[] sizes = {"XS", "S", "M", "L"};

    public void initialize() {
        imageViewArrayList = new ArrayList<>() {{
            add(image1);
            add(image2);
            add(image3);
            add(image4);
            add(image5);
            add(image6);
            add(image7);
            add(image8);
            add(image9);
        }};
        button1ArrayList = new ArrayList<>() {{
            add(add1);
            add(add2);
            add(add3);
            add(add4);
            add(add5);
            add(add6);
            add(add7);
            add(add8);
            add(add9);
        }};
        button2ArrayList = new ArrayList<>() {{
            add(null);
            add(null);
            add(null);
            add(null);
            add(null);
            add(null);
            add(null);
            add(null);
            add(null);
        }};
        choiceBoxArrayList = new ArrayList<>() {{
            add(size1);
            add(size2);
            add(size3);
            add(size4);
            add(size5);
            add(size6);
            add(size7);
            add(size8);
            add(size9);
        }};
        size1.getItems().addAll(sizes);
        size2.getItems().addAll(sizes);
        size3.getItems().addAll(sizes);
        size4.getItems().addAll(sizes);
        size5.getItems().addAll(sizes);
        size6.getItems().addAll(sizes);
        size7.getItems().addAll(sizes);
        size8.getItems().addAll(sizes);
        size9.getItems().addAll(sizes);
        loadImages();
    }

    public void goToHomePage() throws IOException {
        Main m = new Main();
        m.changeScene("home-page-customer.fxml");
    }

    public void goToCartPage(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("cart-page.fxml");
    }

    public void goToPreviousOrdersPage(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("previous-orders-page.fxml");
    }


    public void addItemToCart1() {
        if (size1.getValue() != null) {
            AddMessage1.setVisible(true);
            AddMessage1.setText("Added successfully");
            CartItemsList.add(items.get(0), size1.getValue());
        } else {
            AddMessage1.setVisible(true);
            AddMessage1.setText("Please select a size!");
        }


    }

    public void addItemToCart2() {
        if (size2.getValue() != null) {
            AddMessage2.setVisible(true);
            AddMessage2.setText("Added successfully");
            CartItemsList.add(items.get(1), size2.getValue());
        } else {
            AddMessage2.setVisible(true);
            AddMessage2.setText("Please select a size!");
        }

    }

    public void addItemToCart3() {
        if (size3.getValue() != null) {
            AddMessage3.setVisible(true);
            AddMessage3.setText("Added successfully");
            CartItemsList.add(items.get(2), size3.getValue());
        } else {
            AddMessage3.setVisible(true);
            AddMessage3.setText("Please select a size!");
        }

    }

    public void addItemToCart4() {
        if (size4.getValue() != null) {
            AddMessage4.setVisible(true);
            AddMessage4.setText("Added successfully");
            CartItemsList.add(items.get(3), size4.getValue());
        } else {
            AddMessage4.setVisible(true);
            AddMessage4.setText("Please select a size!");
        }

    }

    public void addItemToCart5() {
        if (size5.getValue() != null) {
            AddMessage5.setVisible(true);
            AddMessage5.setText("Added successfully");
            CartItemsList.add(items.get(4), size5.getValue());
        } else {
            AddMessage4.setVisible(true);
            AddMessage4.setText("Please select a size!");
        }

    }

    public void addItemToCart6() {
        if (size6.getValue() != null) {
            AddMessage6.setVisible(true);
            AddMessage6.setText("Added successfully");
            CartItemsList.add(items.get(5), size6.getValue());
        } else {
            AddMessage6.setVisible(true);
            AddMessage6.setText("Please select a size!");
        }

    }

    public void addItemToCart7() {
        if (size7.getValue() != null) {
            AddMessage7.setVisible(true);
            AddMessage7.setText("Added successfully");
            CartItemsList.add(items.get(6), size7.getValue());
        } else {
            AddMessage7.setVisible(true);
            AddMessage7.setText("Please select a size!");
        }


    }

    public void addItemToCart8() {
        if (size8.getValue() != null) {
            AddMessage8.setVisible(true);
            AddMessage8.setText("Added successfully");
            CartItemsList.add(items.get(7), size8.getValue());
        } else {
            AddMessage8.setVisible(true);
            AddMessage8.setText("Please select a size!");
        }

    }

    public void addItemToCart9() {
        if (size9.getValue() != null) {
            AddMessage9.setVisible(true);
            AddMessage9.setText("Added successfully");
            CartItemsList.add(items.get(8), size9.getValue());
        } else {
            AddMessage9.setVisible(true);
            AddMessage9.setText("Please select a size!");
        }


    }

}
