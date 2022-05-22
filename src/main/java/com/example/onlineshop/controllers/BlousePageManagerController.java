package com.example.onlineshop.controllers;

import com.example.onlineshop.Main;

import java.io.IOException;

public class BlousePageManagerController extends ManagerController {
    @Override
    protected String getCategoryName() {
        return "blouse";
    }

    @Override
    protected void refreshScene() throws IOException {
        Main m = new Main();
        m.changeScene("blouse-page-manager.fxml");
    }
}
