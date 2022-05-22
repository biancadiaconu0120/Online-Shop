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

public abstract class UserController {

    @FXML
    protected Button SignOut;

    @FXML
    protected Button goToHome;

    @FXML
    protected ImageView image1;

    @FXML
    protected ImageView image2;
    @FXML
    protected ImageView image3;
    @FXML
    protected ImageView image4;
    @FXML
    protected ImageView image5;
    @FXML
    protected ImageView image6;
    @FXML
    protected ImageView image7;
    @FXML
    protected ImageView image8;
    @FXML
    protected ImageView image9;

    protected ArrayList<Item> items = new ArrayList<>(9);
    protected int itemsNb = 0;

    public UserController() {

    }

    protected ArrayList<ImageView> imageViewArrayList;
    protected ArrayList<Button> button1ArrayList;
    protected ArrayList<Button> button2ArrayList;
    protected ArrayList<ChoiceBox<String>> choiceBoxArrayList;

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
                    button2ArrayList.get(i), choiceBoxArrayList.get(i));
        }
    }

    protected void activateStuff(int i, ImageView imageView, Image img, Item item,
                                 Button button1, Button button2, ChoiceBox<String> checkBox) {
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
        items.add(i, item);
    }
}
