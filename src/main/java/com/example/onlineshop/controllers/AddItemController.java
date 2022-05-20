package com.example.onlineshop.controllers;

import com.example.onlineshop.Main;
import com.example.onlineshop.model.ItemsList;
import com.example.onlineshop.services.AddItem;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.stage.FileChooser;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class AddItemController implements Initializable {

    public AddItemController(){

    }

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

    @FXML
    private Label wrongInput;

    @FXML
    private ChoiceBox<String> itemCategory;

    private String[] categories={"blouse","trousers","jacket","dress"};

    private boolean imageUploaded=false;


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


    @FXML
    void uploadChoosenImage(ActionEvent event) {
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Images", firstFile));
        File f = fc.showOpenDialog(null);


        //f.getAbsolutePath();

        File outputfile;
        try {
            BufferedImage bi = ImageIO.read(f);  // retrieve image
            outputfile = new File("savedImage"+ (ItemsList.getItems().size()+1)+".png");
            ImageIO.write(bi, "png", outputfile);
            imageUploaded=true;
        } catch (IOException e) {
            wrongInput.setText("Please give an image!");
        }
    }

    public void addItemInList() throws IOException {
        if(itemName.getText().isEmpty()){
            wrongInput.setText("Please give a Name!");
        }
        else if(itemPrice.getText().isEmpty()){
            wrongInput.setText("Please give a Price!");
        }
        else if(!imageUploaded){
            wrongInput.setText("Please give an image!");
        }
        else if(itemCategory.getValue()==null){
            wrongInput.setText("Please give a category!");
        }

        else {
            AddItem.addItem(itemName.getText(),itemPrice.getText(),"savedImage"+ (ItemsList.getItems().size()+1)+".png",itemCategory.getValue());
            wrongInput.setText("Item added successfully");
            if(itemCategory.getValue().equals("blouse")) {
                Main m = new Main();
                m.changeScene("blouse-page-manager.fxml");
            }
            else if(itemCategory.getValue().equals("dress")) {
                Main m = new Main();
                m.changeScene("dress-page-manager.fxml");
            }
            else if(itemCategory.getValue().equals("trousers")) {
                Main m = new Main();
                m.changeScene("trousers-page-manager.fxml");
            }
            else if(itemCategory.getValue().equals("jacket")) {
                Main m = new Main();
                m.changeScene("jacket-page-manager.fxml");
            }

        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        itemCategory.getItems().addAll(categories);
        firstFile = new ArrayList<>();
        firstFile.add("*.jpg");
        firstFile.add("*.png");
        firstFile.add("*.jpeg");
    }

}
