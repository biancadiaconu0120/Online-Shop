package com.example.onlineshop.controllers;

import com.example.onlineshop.Main;
import com.example.onlineshop.model.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.io.IOException;
import java.util.ArrayList;

public abstract class OrdersController {
    @FXML
    protected Button SignOutButton;

    protected ArrayList<Label> LabelUserList;
    protected ArrayList<Label> LabelOrderIdList;
    protected ArrayList<Label> LabelOrderDetailsList;
    protected ArrayList<Label> LabelStatusList;
    protected ArrayList<ChoiceBox<String>> choiceBoxStatusList;

    public void goToSignPage(ActionEvent event) throws IOException {
        CartItemsList.removeAllItems();
        Main m = new Main();
        m.changeScene("login-page.fxml");
    }

    public abstract void initialize();

    public abstract void goToHomePage() throws IOException;

    public abstract void loadOrders();

    public abstract String getRoleOfUser();

    protected void loadOrder(Order order,User user, int i) {
            activateStuff(order,user,
                    LabelUserList.get(i), LabelOrderIdList.get(i), LabelOrderDetailsList.get(i), LabelStatusList.get(i),
                    choiceBoxStatusList.get(i));
    }

    protected void activateStuff(Order order, User user,
                                 Label userId, Label orderId, Label orderDetails, Label statusLabel,
                                 ChoiceBox<String> statusChoiceBox) {
        if (userId!= null) {
            userId.setText(user.getUsername());
        }
        if (orderId!= null) {
            orderId.setText(order.getOrderId());
        }
        if (orderDetails!= null) {
            orderDetails.setText(order.getOrderDetails());
        }
        if(statusLabel!=null){
            statusLabel.setText(order.getOrderStatus());
        }
        if (statusChoiceBox != null) {
            statusChoiceBox.setVisible(true);
            statusChoiceBox.setValue(order.getOrderStatus());
        }
    }


}
