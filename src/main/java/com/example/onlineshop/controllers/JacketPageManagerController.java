package com.example.onlineshop.controllers;

import com.example.onlineshop.Main;
import com.example.onlineshop.model.Item;
import com.example.onlineshop.model.ItemsList;
import com.example.onlineshop.services.AddItem;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.util.ArrayList;

public class JacketPageManagerController extends ManagerController {
    @Override
    protected String getCategoryName() {
        return "jacket";
    }

    @Override
    protected void refreshScene() throws IOException {
        Main m = new Main();
        m.changeScene("jacket-page-manager.fxml");
    }
}
