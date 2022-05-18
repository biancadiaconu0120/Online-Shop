package com.example.onlineshop.controllers;

import com.example.onlineshop.Main;
import com.example.onlineshop.exceptions.UsernameAlreadyExistsException;
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
        private Button signIn;

        @FXML
        private Button register;

        @FXML
        private Label wrongLogin;

        @FXML
        private TextField username;

        @FXML
        private PasswordField password;

        @FXML
        private ChoiceBox<String> role;

        private String[] roles={"customer","manager"};

        public void userLogin(ActionEvent event) throws IOException {
            checkLogin();
        }
        @FXML
        private void checkLogin() throws IOException{

            if(username.getText().isEmpty() ) {
                wrongLogin.setText("Please fill in the username field");
            }
            else if(password.getText().isEmpty()) {
                wrongLogin.setText("Please fill in the password field");
            }
            else if(role.getValue()==null) {
                wrongLogin.setText("Please fill in the role field");
            }
            else if(UsersList.checkUserCredentials(new User(username.getText(),password.getText(),role.getValue()))) {
                Main m= new Main();
                if(role.getValue().equals("customer")) {
                    m.changeScene("home-page-customer.fxml");
                }
                else if(role.getValue().equals("manager")){
                    m.changeScene("home-page-manager.fxml");
                }
            }
            else {
                wrongLogin.setText("User credentials are introduced wrong!");
            }


        }

        public void goToRegisterPage(ActionEvent event) throws IOException{
            Main m= new Main();
            m.changeScene("registration-page.fxml");
        }

        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {
            role.getItems().addAll(roles);
        }


}
