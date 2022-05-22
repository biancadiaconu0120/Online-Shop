package com.example.onlineshop.controllers;

import com.example.onlineshop.Main;
import com.example.onlineshop.model.ItemsList;
import com.example.onlineshop.services.AddItem;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;
import java.util.ArrayList;

abstract public class ManagerController extends UserController {
    @FXML
    protected Button edit1Button, edit2Button, edit3Button, edit4Button, edit5Button, edit6Button, edit7Button, edit8Button, edit9Button;

    @FXML
    protected Button delete1Button, delete2Button, delete3Button, delete4Button, delete5Button, delete6Button, delete7Button, delete8Button, delete9Button;

    @FXML
    protected Button viewNewOrdersButton;

    @FXML
    protected Button addItemButton;


    public ManagerController() {

    }

    @Override
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
            add(delete1Button);
            add(delete2Button);
            add(delete3Button);
            add(delete4Button);
            add(delete5Button);
            add(delete6Button);
            add(delete7Button);
            add(delete8Button);
            add(delete9Button);
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
        loadImages();
    }

    protected abstract void refreshScene() throws IOException;

    public void goToHomePage() throws IOException {
        Main m = new Main();
        m.changeScene("home-page-manager.fxml");
    }

    public void goToNewOrdersPage(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("new-orders-page.fxml");
    }

    public void goToAddItemPage(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("add-item-page.fxml");
    }

    protected void deleteItem(int index) throws IOException {
        ItemsList.getItems().remove(items.get(index));
        items.remove(index);
        itemsNb = 0;
        ItemsList.decreaseCategoryNo(getCategoryName());
        refreshScene();
        loadImages();
        AddItem.persistItems();
    }

    public void deleteItem1() throws IOException {
        ItemsList.getImages().remove(image1ImageView.getImage());
        deleteItem(0);
    }

    public void deleteItem2() throws IOException {
        ItemsList.getImages().remove(image2ImageView.getImage());
        deleteItem(1);
    }

    public void deleteItem3() throws IOException {
        ItemsList.getImages().remove(image3ImageView.getImage());
        deleteItem(2);
    }

    public void deleteItem4() throws IOException {
        ItemsList.getImages().remove(image4ImageView.getImage());
        deleteItem(3);
    }

    public void deleteItem5() throws IOException {
        ItemsList.getImages().remove(image5ImageView.getImage());
        deleteItem(4);
    }

    public void deleteItem6() throws IOException {
        ItemsList.getImages().remove(image6ImageView.getImage());
        deleteItem(5);
    }

    public void deleteItem7() throws IOException {
        ItemsList.getImages().remove(image7ImageView.getImage());
        deleteItem(6);
    }

    public void deleteItem8() throws IOException {
        ItemsList.getImages().remove(image8ImageView.getImage());
        deleteItem(7);
    }

    public void deleteItem9() throws IOException {
        ItemsList.getImages().remove(image9ImageView.getImage());
        deleteItem(8);
    }


    public void editItem() {

    }


}
