package com.example.onlineshop.controllers;

import com.example.onlineshop.Main;
import com.example.onlineshop.model.CartItemsList;
import com.example.onlineshop.model.Item;
import com.example.onlineshop.model.ItemsList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.util.ArrayList;

public class JacketPageCustomerController {
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
    @FXML
    private Button add1, add2, add3, add4, add5, add6, add7, add8, add9;
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
    @FXML
    private Label AddMessage1, AddMessage2, AddMessage3, AddMessage4, AddMessage5, AddMessage6, AddMessage7, AddMessage8, AddMessage9;

    ArrayList<Item> jackets = new ArrayList<Item>(9);


    public void addItemToCart1() {
        if (size1.getValue() != null) {
            AddMessage1.setVisible(true);
            AddMessage1.setText("Added successfully");
            CartItemsList.add(jackets.get(0), size1.getValue());
        } else {
            AddMessage1.setVisible(true);
            AddMessage1.setText("Please select a size!");
        }


    }

    public void addItemToCart2() {
        if (size2.getValue() != null) {
            AddMessage2.setVisible(true);
            AddMessage2.setText("Added successfully");
            CartItemsList.add(jackets.get(1), size2.getValue());
        } else {
            AddMessage2.setVisible(true);
            AddMessage2.setText("Please select a size!");
        }

    }

    public void addItemToCart3() {
        if (size3.getValue() != null) {
            AddMessage3.setVisible(true);
            AddMessage3.setText("Added successfully");
            CartItemsList.add(jackets.get(2), size3.getValue());
        } else {
            AddMessage3.setVisible(true);
            AddMessage3.setText("Please select a size!");
        }

    }

    public void addItemToCart4() {
        if (size4.getValue() != null) {
            AddMessage4.setVisible(true);
            AddMessage4.setText("Added successfully");
            CartItemsList.add(jackets.get(3), size4.getValue());
        } else {
            AddMessage4.setVisible(true);
            AddMessage4.setText("Please select a size!");
        }

    }

    public void addItemToCart5() {
        if (size5.getValue() != null) {
            AddMessage5.setVisible(true);
            AddMessage5.setText("Added successfully");
            CartItemsList.add(jackets.get(4), size5.getValue());
        } else {
            AddMessage4.setVisible(true);
            AddMessage4.setText("Please select a size!");
        }

    }

    public void addItemToCart6() {
        if (size6.getValue() != null) {
            AddMessage6.setVisible(true);
            AddMessage6.setText("Added successfully");
            CartItemsList.add(jackets.get(5), size6.getValue());
        } else {
            AddMessage6.setVisible(true);
            AddMessage6.setText("Please select a size!");
        }

    }

    public void addItemToCart7() {
        if (size7.getValue() != null) {
            AddMessage7.setVisible(true);
            AddMessage7.setText("Added successfully");
            CartItemsList.add(jackets.get(6), size7.getValue());
        } else {
            AddMessage7.setVisible(true);
            AddMessage7.setText("Please select a size!");
        }


    }

    public void addItemToCart8() {
        if (size8.getValue() != null) {
            AddMessage8.setVisible(true);
            AddMessage8.setText("Added successfully");
            CartItemsList.add(jackets.get(7), size8.getValue());
        } else {
            AddMessage8.setVisible(true);
            AddMessage8.setText("Please select a size!");
        }

    }

    public void addItemToCart9() {
        if (size9.getValue() != null) {
            AddMessage9.setVisible(true);
            AddMessage9.setText("Added successfully");
            CartItemsList.add(jackets.get(8), size9.getValue());
        } else {
            AddMessage9.setVisible(true);
            AddMessage9.setText("Please select a size!");
        }


    }


    public void goToCartPage(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("cart-page.fxml");
    }

    public void goToPreviousOrdersPage(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("previous-orders-page.fxml");
    }

    public void goToSignPage(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("login-page.fxml");
    }

    private void hideItem(ImageView imageView, Button add, ChoiceBox<String> size) {
        imageView.setImage(null);
        add.setVisible(false);
        size.setVisible(false);
    }
    private void addItem(int i, Item item, ImageView imageView, Image image, Button add, ChoiceBox<String> size) {
        imageView.setImage(image);
        add.setVisible(true);
        size.setVisible(true);
        jackets.add(i, item);
    }

//    private void hideAllItems(){
//        hideItem(image1,add1,size1);
//        hideItem(image2,add2,size2);
//        hideItem(image3,add3,size3);
//        hideItem(image4,add4,size4);
//        hideItem(image5,add5,size5);
//        hideItem(image6,add6,size6);
//        hideItem(image7,add7,size7);
//        hideItem(image8,add8,size8);
//        hideItem(image9,add9,size9);
//    }

    public void initialize() {
        //instance = this;

        loadItems();

        size1.getItems().addAll(sizes);
        size2.getItems().addAll(sizes);
        size3.getItems().addAll(sizes);
        size4.getItems().addAll(sizes);
        size5.getItems().addAll(sizes);
        size6.getItems().addAll(sizes);
        size7.getItems().addAll(sizes);
        size8.getItems().addAll(sizes);
        size9.getItems().addAll(sizes);
    }

    private int jacketsNb = 0;

    private void loadItems() {
        int l = ItemsList.getImages().size();
        for (int i = 0; i < l; i++)
            loadItem(ItemsList.getItems().get(i), ItemsList.getImages().get(i));
        for (int i = jacketsNb+1; i <=9; i++)
            hideItems(i);
    }

    public void loadItem(Item item, Image img) {
        if (item.getCategory().equals("jacket")) {
            jacketsNb++;
            switch (jacketsNb) {
                case 1:
                    addItem(0, item, image1, img, add1, size1);
                    break;
                case 2:
                    addItem(1, item, image2, img, add2, size2);
                    break;
                case 3:
                    addItem(2, item, image3, img, add3, size3);
                    break;
                case 4:
                    addItem(3, item, image4, img, add4, size4);
                    break;
                case 5:
                    addItem(4, item, image5, img, add5, size5);
                    break;
                case 6:
                    addItem(5, item, image6, img, add6, size6);
                    break;
                case 7:
                    addItem(6, item, image7, img, add7, size7);
                    break;
                case 8:
                    addItem(7, item, image8, img, add8, size8);
                    break;
                case 9:
                    addItem(8, item, image9, img, add9, size9);
                    break;
                default:
                    throw new NullPointerException();
            }
        }
    }
    public void hideItems(int i) {
        switch (i) {
            case 1:
                hideItem(image1, add1, size1);
                break;
            case 2:
                hideItem(image2, add2, size2);
                break;
            case 3:
                hideItem(image3, add3, size3);
                break;
            case 4:
                hideItem(image4, add4, size4);
                break;
            case 5:
                hideItem(image5, add5, size5);
                break;
            case 6:
                hideItem(image6, add6, size6);
                break;
            case 7:
                hideItem(image7, add7, size7);
                break;
            case 8:
                hideItem(image8, add8, size8);
                break;
            case 9:
                hideItem(image9, add9, size9);
                break;
            default:
                throw new NullPointerException();
        }
    }

    public void goToHomePage(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("home-page-customer.fxml");
    }
}
