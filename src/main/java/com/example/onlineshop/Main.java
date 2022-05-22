package com.example.onlineshop;

import com.example.onlineshop.model.ItemsList;
import com.example.onlineshop.model.UsersList;
import com.example.onlineshop.services.Register;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Main extends Application {

    private static Stage stg;

    @Override
    public void start(Stage primaryStage) throws IOException {
        UsersList.loadUsersFromFile();
        ItemsList.loadItemsFromFile();
        stg = primaryStage;
        primaryStage.setResizable(false);
        Parent root = FXMLLoader.load(getClass().getResource("login-page.fxml"));
        primaryStage.setTitle("OnlineShop");
        primaryStage.setScene(new Scene(root, 856, 601));
        primaryStage.show();
    }

    public void changeScene(String fxml) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stg.getScene().setRoot(pane);
    }

    public static void main(String[] args) {
        launch(args);
    }
}