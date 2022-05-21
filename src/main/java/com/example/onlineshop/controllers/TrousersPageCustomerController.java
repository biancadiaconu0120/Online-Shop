package com.example.onlineshop.controllers;

import com.example.onlineshop.Main;
import com.example.onlineshop.model.CartItemsList;
import com.example.onlineshop.model.Item;
import com.example.onlineshop.model.ItemsList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.util.ArrayList;

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
    @FXML
    private Button add1,add2,add3,add4,add5,add6,add7,add8,add9;
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

    private String[] sizes={"XS","S","M","L"};

    ArrayList<Item> trousers= new ArrayList<Item>(9);


    public void addItemToCart1(){
            if(size1.getValue()!=null) {
                CartItemsList.add(trousers.get(0), size1.getValue());
                //label bravo ai adaugat
            }
            else{
                //label nu i ok selecteaza marimea
            }

    }
    public void addItemToCart2() {
        CartItemsList.add(trousers.get(1), size2.getValue());
    }
    public void addItemToCart3(){

            CartItemsList.add(trousers.get(2),size3.getValue());
    }
    public void addItemToCart4(){
            CartItemsList.add(trousers.get(3),size4.getValue());
    }
    public void addItemToCart5(){

            CartItemsList.add(trousers.get(4),size5.getValue());
    }
    public void addItemToCart6(){

            CartItemsList.add(trousers.get(5),size6.getValue());
    }
    public void addItemToCart7(){

            CartItemsList.add(trousers.get(6),size7.getValue());

    }
    public void addItemToCart8(){

            CartItemsList.add(trousers.get(7),size8.getValue());
    }
    public void addItemToCart9(){

            CartItemsList.add(trousers.get(8),size9.getValue());

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

    public void initialize(){
        //instance = this;
        loadImages();
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
                        add1.setVisible(true);
                        size1.setVisible(true);
                        trousers.add(0,item);
                    break;
                case 2: image2.setImage(img);
                        add2.setVisible(true);
                        size2.setVisible(true);
                        trousers.add(1,item);
                    break;
                case 3: image3.setImage(img);
                        add3.setVisible(true);
                        size3.setVisible(true);
                        trousers.add(2,item);
                    break;
                case 4: image4.setImage(img);
                        add4.setVisible(true);
                        size4.setVisible(true);
                        trousers.add(3,item);
                    break;
                case 5: image5.setImage(img);
                        add5.setVisible(true);
                        size5.setVisible(true);
                        trousers.add(4,item);
                    break;
                case 6: image6.setImage(img);
                        add6.setVisible(true);
                        size6.setVisible(true);
                        trousers.add(5,item);
                    break;
                case 7: image7.setImage(img);
                        add7.setVisible(true);
                        size7.setVisible(true);
                        trousers.add(6,item);
                    break;
                case 8: image8.setImage(img);
                        add8.setVisible(true);
                        size8.setVisible(true);
                        trousers.add(7,item);
                    break;
                case 9: image9.setImage(img);
                        add9.setVisible(true);
                        size9.setVisible(true);
                        trousers.add(8,item);
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
