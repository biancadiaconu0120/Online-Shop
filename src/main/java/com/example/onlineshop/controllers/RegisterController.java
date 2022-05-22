package com.example.onlineshop.controllers;

import com.example.onlineshop.Main;
import com.example.onlineshop.exceptions.UsernameAlreadyExistsException;
import com.example.onlineshop.services.Register;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import org.json.JSONObject;


public class RegisterController implements Initializable {

    public RegisterController() {

    }

    @FXML
    private Button becomeAMemberButton;

    @FXML
    private Button backToSignInButton;

    @FXML
    private Label wrongRegistrationLabel;

    @FXML
    private TextField usernameTextField;

    @FXML
    private PasswordField passwordPasswordField;

    @FXML
    private ChoiceBox<String> roleChoiceBox;

    private String[] roles = {"customer", "manager"};

    public void userRegister(ActionEvent event) throws IOException {
        checkRegister();
    }

    private void checkRegister() throws IOException {

        if (usernameTextField.getText().isEmpty()) {
            wrongRegistrationLabel.setText("Please fill in the username field");
        } else if (passwordPasswordField.getText().isEmpty()) {
            wrongRegistrationLabel.setText("Please fill in the password field");
        } else if (roleChoiceBox.getValue() == null) {
            wrongRegistrationLabel.setText("Please fill in the role field");
        } else {
            try {
                Register.addUser(usernameTextField.getText(), passwordPasswordField.getText(), (String) roleChoiceBox.getValue());
                wrongRegistrationLabel.setText("Account created successfully!");
            } catch (UsernameAlreadyExistsException e) {
                wrongRegistrationLabel.setText(e.getMessage());
            }
        }
    }

    public void goToSignIn(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("login-page.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        roleChoiceBox.getItems().addAll(roles);
    }
}
