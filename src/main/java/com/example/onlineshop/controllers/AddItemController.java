package com.example.onlineshop.controllers;

import com.example.onlineshop.Main;
import com.example.onlineshop.model.ItemsList;
import com.example.onlineshop.services.AddItem;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.FileChooser;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AddItemController {

    List<String> firstFile;

    @FXML
    private Button viewNewOrders;

    @FXML
    private Button SignOut;

    @FXML
    private Button goToHome;

    @FXML
    private Button uploadImage;

    @FXML
    private TextField itemName;

    @FXML
    private TextField itemPrice;

    @FXML
    private Button addItemButton;


    public void goToHomePage(ActionEvent event) throws IOException {
        Main m= new Main();
        m.changeScene("home-page-manager.fxml");
    }

    public void goToNewOrdersPage(ActionEvent event) throws IOException {
        Main m= new Main();
        m.changeScene("new-orders-page.fxml");
    }

    public void goToSignPage(ActionEvent event) throws IOException {
        Main m= new Main();
        m.changeScene("login-page.fxml");
    }

    public void initialize() {
        firstFile = new ArrayList<>();
        firstFile.add("*.jpg");
        firstFile.add("*.png");
        firstFile.add("*.jpeg");
    }

    @FXML
    void uploadChoosenImage(ActionEvent event) {
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Images", firstFile));
        File f = fc.showOpenDialog(null);


        //f.getAbsolutePath();

        File outputfile;
        try {
            BufferedImage bi = ImageIO.read(f);  // retrieve image
            outputfile = new File("savedImage"+ ItemsList.getItems().size()+1+".png");
            ImageIO.write(bi, "png", outputfile);
        } catch (IOException e) {
            // handle exception
        }
    }

    public void addItemInList(){
        if(itemName.getText().isEmpty()){
            System.out.println("Please give a Name!");
        }
        else if(itemPrice.getText().isEmpty()){
            System.out.println("Please give a Price!");
        }
        else
            AddItem.addItem(itemName.getText(),itemPrice.getText(),"savedImage"+ ItemsList.getItems().size()+1+".png");
    }

}
