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

    public RegisterController(){

    }

    @FXML
    private Button becomeAMember;

    @FXML
    private Button backToSignIn;

    @FXML
    private Label wrongRegistration;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private ChoiceBox<String> role;

    private String[] roles={"customer","manager"};

    public void userRegister(ActionEvent event) throws IOException{
        checkRegister();
    }

    private void checkRegister() throws IOException{

        if(username.getText().isEmpty() ) {
            wrongRegistration.setText("Please fill in the username field");
        }
        else if(password.getText().isEmpty()) {
            wrongRegistration.setText("Please fill in the password field");
        }
        else if(role.getValue()==null) {
            wrongRegistration.setText("Please fill in the role field");
        }
        else{
                try {
                    Register.addUser(username.getText(), password.getText(), (String) role.getValue());
                    wrongRegistration.setText("Account created successfully!");
                } catch (UsernameAlreadyExistsException e) {
                    wrongRegistration.setText(e.getMessage());
                }
        }
    }

    public void goToSignIn(ActionEvent event) throws IOException{
        Main m= new Main();
        m.changeScene("login-page.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        role.getItems().addAll(roles);
    }
}
