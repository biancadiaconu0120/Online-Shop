package com.example.onlineshop.controllers;

import com.example.onlineshop.Main;
import com.example.onlineshop.exceptions.UsernameAlreadyExistsException;
import com.example.onlineshop.model.CartItemsList;
import com.example.onlineshop.model.DataHolderForCurrentUser;
import com.example.onlineshop.model.User;
import com.example.onlineshop.model.UsersList;
import com.example.onlineshop.services.Register;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import org.json.JSONObject;

public class LoginController implements Initializable {
    public LoginController() {

    }

    @FXML
    private Button signInButton;

    @FXML
    private Button registerButton;

    @FXML
    private Label wrongLoginLabel;

    @FXML
    private TextField usernameTextField;

    @FXML
    private PasswordField passwordPasswordField;

    @FXML
    private ChoiceBox<String> roleChoiceBox;

    private String[] roles = {"customer", "manager"};

    public void userLogin(ActionEvent event) throws IOException {
        checkLogin();
    }

    @FXML
    private void checkLogin() throws IOException {
        if (usernameTextField.getText().isEmpty()) {
            wrongLoginLabel.setText("Please fill in the username field");
        } else if (passwordPasswordField.getText().isEmpty()) {
            wrongLoginLabel.setText("Please fill in the password field");
        } else if (roleChoiceBox.getValue() == null) {
            wrongLoginLabel.setText("Please fill in the role field");
        } else if (UsersList.checkUserCredentials(new User(username.getText(), password.getText(), role.getValue(),null))) {
            Main m = new Main();
            if (roleChoiceBox.getValue().equals("customer")) {
                DataHolderForCurrentUser.setCurrentUser(new User(username.getText(), password.getText(), role.getValue()));
                m.changeScene("home-page-customer.fxml");
            } else if (roleChoiceBox.getValue().equals("manager")) {
                m.changeScene("home-page-manager.fxml");
            }
        } else {
            wrongLoginLabel.setText("User credentials are introduced wrong!");
        }


    }

    public void goToRegisterPage(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("registration-page.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        roleChoiceBox.getItems().addAll(roles);
    }


}
