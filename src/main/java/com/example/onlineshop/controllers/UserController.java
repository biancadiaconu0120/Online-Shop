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

public abstract class UserController {

    @FXML
    protected Button SignOutButton;

    @FXML
    protected Button goToHomeButton;

    @FXML
    protected ImageView image1ImageView;

    @FXML
    protected ImageView image2ImageView;
    @FXML
    protected ImageView image3ImageView;
    @FXML
    protected ImageView image4ImageView;
    @FXML
    protected ImageView image5ImageView;
    @FXML
    protected ImageView image6ImageView;
    @FXML
    protected ImageView image7ImageView;
    @FXML
    protected ImageView image8ImageView;
    @FXML
    protected ImageView image9ImageView;

    @FXML
    protected Label price1Label,price2Label,price3Label,price4Label,price5Label,price6Label,price7Label,price8Label,price9Label;

    protected ArrayList<Item> items = new ArrayList<>(9);
    protected int itemsNb = 0;

    public UserController() {

    }

    protected ArrayList<ImageView> imageViewArrayList;
    protected ArrayList<Button> button1ArrayList;
    protected ArrayList<Button> button2ArrayList;
    protected ArrayList<ChoiceBox<String>> choiceBoxArrayList;
    protected ArrayList<Label> priceArrayList;

    public abstract void initialize();

    public abstract void goToHomePage() throws IOException;

    public void goToSignPage(ActionEvent event) throws IOException {
        CartItemsList.removeAllItems();
        Main m = new Main();
        m.changeScene("login-page.fxml");
    }

    protected abstract String getCategoryName();


    protected void loadImages() {
        int l = ItemsList.getImages().size();
        for (int i = 0; i < l; i++)
            loadImage(ItemsList.getItems().get(i), ItemsList.getImages().get(i));
    }

    protected void loadImage(Item item, Image img) {
        if (item.getCategory().equals(getCategoryName())) {
            int i = itemsNb;
            itemsNb++;
            activateStuff(i, imageViewArrayList.get(i), img, item, button1ArrayList.get(i),
                    button2ArrayList.get(i), choiceBoxArrayList.get(i),priceArrayList.get(i));
        }
    }

    protected void activateStuff(int i, ImageView imageView, Image img, Item item,
                                 Button button1, Button button2, ChoiceBox<String> checkBox,Label price) {
        if (imageView != null) {
            imageView.setImage(img);
            imageView.setVisible(true);
        }
        if (button1 != null)
            button1.setVisible(true);
        if (button2 != null)
            button2.setVisible(true);
        if (checkBox != null)
            checkBox.setVisible(true);
        if(price!=null)
            price.setText("Pret:"+ item.getPrice() +"RON");
        items.add(i, item);
    }
}
