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
    private Button goToCartButton;

    @FXML
    private Button viewPreviousOrdersButton;

    @FXML
    private Button add1Button, add2Button, add3Button, add4Button, add5Button, add6Button, add7Button, add8Button, add9Button;

    @FXML
    private Label AddMessage1Label, AddMessage2Label, AddMessage3Label, AddMessage4Label, AddMessage5Label, AddMessage6Label, AddMessage7Label, AddMessage8Label, AddMessage9Label;

    @FXML
    private ChoiceBox<String> size1ChoiceBox;
    @FXML
    private ChoiceBox<String> size2ChoiceBox;
    @FXML
    private ChoiceBox<String> size3ChoiceBox;
    @FXML
    private ChoiceBox<String> size4ChoiceBox;
    @FXML
    private ChoiceBox<String> size5ChoiceBox;
    @FXML
    private ChoiceBox<String> size6ChoiceBox;
    @FXML
    private ChoiceBox<String> size7ChoiceBox;
    @FXML
    private ChoiceBox<String> size8ChoiceBox;
    @FXML
    private ChoiceBox<String> size9ChoiceBox;

    private String[] sizes = {"XS", "S", "M", "L"};

    public void initialize() {
        imageViewArrayList = new ArrayList<>() {{
            add(image1ImageView);
            add(image2ImageView);
            add(image3ImageView);
            add(image4ImageView);
            add(image5ImageView);
            add(image6ImageView);
            add(image7ImageView);
            add(image8ImageView);
            add(image9ImageView);
        }};
        button1ArrayList = new ArrayList<>() {{
            add(add1Button);
            add(add2Button);
            add(add3Button);
            add(add4Button);
            add(add5Button);
            add(add6Button);
            add(add7Button);
            add(add8Button);
            add(add9Button);
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
            add(size1ChoiceBox);
            add(size2ChoiceBox);
            add(size3ChoiceBox);
            add(size4ChoiceBox);
            add(size5ChoiceBox);
            add(size6ChoiceBox);
            add(size7ChoiceBox);
            add(size8ChoiceBox);
            add(size9ChoiceBox);
        }};
        priceArrayList = new ArrayList<>() {{
            add(price1Label);
            add(price2Label);
            add(price3Label);
            add(price4Label);
            add(price5Label);
            add(price6Label);
            add(price7Label);
            add(price8Label);
            add(price9Label);
        }};
        size1ChoiceBox.getItems().addAll(sizes);
        size2ChoiceBox.getItems().addAll(sizes);
        size3ChoiceBox.getItems().addAll(sizes);
        size4ChoiceBox.getItems().addAll(sizes);
        size5ChoiceBox.getItems().addAll(sizes);
        size6ChoiceBox.getItems().addAll(sizes);
        size7ChoiceBox.getItems().addAll(sizes);
        size8ChoiceBox.getItems().addAll(sizes);
        size9ChoiceBox.getItems().addAll(sizes);
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
        if (size1ChoiceBox.getValue() != null) {
            AddMessage1Label.setVisible(true);
            AddMessage1Label.setText("Added successfully");
            CartItemsList.add(items.get(0), size1ChoiceBox.getValue());
        } else {
            AddMessage1Label.setVisible(true);
            AddMessage1Label.setText("Please select a size!");
        }


    }

    public void addItemToCart2() {
        if (size2ChoiceBox.getValue() != null) {
            AddMessage2Label.setVisible(true);
            AddMessage2Label.setText("Added successfully");
            CartItemsList.add(items.get(1), size2ChoiceBox.getValue());
        } else {
            AddMessage2Label.setVisible(true);
            AddMessage2Label.setText("Please select a size!");
        }

    }

    public void addItemToCart3() {
        if (size3ChoiceBox.getValue() != null) {
            AddMessage3Label.setVisible(true);
            AddMessage3Label.setText("Added successfully");
            CartItemsList.add(items.get(2), size3ChoiceBox.getValue());
        } else {
            AddMessage3Label.setVisible(true);
            AddMessage3Label.setText("Please select a size!");
        }

    }

    public void addItemToCart4() {
        if (size4ChoiceBox.getValue() != null) {
            AddMessage4Label.setVisible(true);
            AddMessage4Label.setText("Added successfully");
            CartItemsList.add(items.get(3), size4ChoiceBox.getValue());
        } else {
            AddMessage4Label.setVisible(true);
            AddMessage4Label.setText("Please select a size!");
        }

    }

    public void addItemToCart5() {
        if (size5ChoiceBox.getValue() != null) {
            AddMessage5Label.setVisible(true);
            AddMessage5Label.setText("Added successfully");
            CartItemsList.add(items.get(4), size5ChoiceBox.getValue());
        } else {
            AddMessage4Label.setVisible(true);
            AddMessage4Label.setText("Please select a size!");
        }

    }

    public void addItemToCart6() {
        if (size6ChoiceBox.getValue() != null) {
            AddMessage6Label.setVisible(true);
            AddMessage6Label.setText("Added successfully");
            CartItemsList.add(items.get(5), size6ChoiceBox.getValue());
        } else {
            AddMessage6Label.setVisible(true);
            AddMessage6Label.setText("Please select a size!");
        }

    }

    public void addItemToCart7() {
        if (size7ChoiceBox.getValue() != null) {
            AddMessage7Label.setVisible(true);
            AddMessage7Label.setText("Added successfully");
            CartItemsList.add(items.get(6), size7ChoiceBox.getValue());
        } else {
            AddMessage7Label.setVisible(true);
            AddMessage7Label.setText("Please select a size!");
        }


    }

    public void addItemToCart8() {
        if (size8ChoiceBox.getValue() != null) {
            AddMessage8Label.setVisible(true);
            AddMessage8Label.setText("Added successfully");
            CartItemsList.add(items.get(7), size8ChoiceBox.getValue());
        } else {
            AddMessage8Label.setVisible(true);
            AddMessage8Label.setText("Please select a size!");
        }

    }

    public void addItemToCart9() {
        if (size9ChoiceBox.getValue() != null) {
            AddMessage9Label.setVisible(true);
            AddMessage9Label.setText("Added successfully");
            CartItemsList.add(items.get(8), size9ChoiceBox.getValue());
        } else {
            AddMessage9Label.setVisible(true);
            AddMessage9Label.setText("Please select a size!");
        }


    }

}
