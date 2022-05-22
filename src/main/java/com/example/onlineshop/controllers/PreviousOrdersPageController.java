package com.example.onlineshop.controllers;

import com.example.onlineshop.Main;
import com.example.onlineshop.model.DataHolderForCurrentUser;
import com.example.onlineshop.model.User;
import com.example.onlineshop.model.UsersList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;
import java.util.ArrayList;

public class PreviousOrdersPageController extends OrdersController{
    @FXML
    private Button goToCartButton;

    @FXML
    private Button viewPreviousOrdersButton;

    @FXML
    private Button getGoToCartButton;

    @FXML
    private Label order1Label,order2Label,order3Label,order4Label,order5Label;

    @FXML
    private Label orderDetails1Label,orderDetails2Label,orderDetails3Label,orderDetails4Label,orderDetails5Label;

    @FXML
    private Label status1Label,status2Label,status3Label,status4Label,status5Label;


    @Override
    public void initialize() {
        LabelUserList = new ArrayList<>() {{
            add(null);
            add(null);
            add(null);
            add(null);
            add(null);
        }};
        LabelOrderIdList = new ArrayList<>() {{
            add(order1Label);
            add(order2Label);
            add(order3Label);
            add(order4Label);
            add(order5Label);
        }};
        LabelOrderDetailsList = new ArrayList<>() {{
            add(orderDetails1Label);
            add(orderDetails2Label);
            add(orderDetails3Label);
            add(orderDetails4Label);
            add(orderDetails5Label);
        }};
        LabelStatusList = new ArrayList<>() {{
            add(status1Label);
            add(status2Label);
            add(status3Label);
            add(status4Label);
            add(status5Label);
        }};
        choiceBoxStatusList = new ArrayList<>() {{
            add(null);
            add(null);
            add(null);
            add(null);
            add(null);
        }};
        loadOrders();
    }

    @Override
    public void goToHomePage() throws IOException {
        Main m= new Main();
        m.changeScene("home-page-customer.fxml");
    }

    @Override
    public void loadOrders() {
        int numberOfOrdersPerPage=0;
        User currentUser=null;
        for(int i=0;i<UsersList.getUsers().size();i++){
            if(DataHolderForCurrentUser.getCurrentUser().equals(UsersList.getUsers().get(i)))
                currentUser=UsersList.getUsers().get(i);
        }
        for(int i=0;i<currentUser.getOrders().size() && numberOfOrdersPerPage<5;i++){
            numberOfOrdersPerPage++;
            loadOrder(currentUser.getOrders().get(i),currentUser ,i);
        }
    }

    @Override
    public String getRoleOfUser() {
        return "customer";
    }

    public void goToCartPage(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("cart-page.fxml");
    }
}
