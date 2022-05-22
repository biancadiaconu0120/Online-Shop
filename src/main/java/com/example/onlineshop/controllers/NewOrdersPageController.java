package com.example.onlineshop.controllers;

import com.example.onlineshop.Main;
import com.example.onlineshop.model.Order;
import com.example.onlineshop.model.User;
import com.example.onlineshop.model.UsersList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class NewOrdersPageController extends OrdersController{
    @FXML
    private Button goToHomeButton;
    @FXML
    private Button statusButton;
    @FXML
    private Label UserId1Label,UserId2Label,UserId3Label,UserId4Label,UserId5Label;
    @FXML
    private Label OrderId1Label,OrderId2Label,OrderId3Label,OrderId4Label,OrderId5Label;
    @FXML
    private Label OrderDetails1Label,OrderDetails2Label,OrderDetails3Label,OrderDetails4Label,OrderDetails5Label;
    @FXML
    private ChoiceBox<String> status1ChoiceBox,status2ChoiceBox,status3ChoiceBox,status4ChoiceBox,status5ChoiceBox;
    private String[] statuses = {"unprocessed","processed"};

    public void initialize() {

        LabelUserList = new ArrayList<>() {{
            add(UserId1Label);
            add(UserId2Label);
            add(UserId3Label);
            add(UserId4Label);
            add(UserId5Label);
        }};

        LabelOrderIdList = new ArrayList<>() {{
            add(OrderId1Label);
            add(OrderId2Label);
            add(OrderId3Label);
            add(OrderId4Label);
            add(OrderId5Label);
        }};

        LabelOrderDetailsList = new ArrayList<>() {{
            add(OrderDetails1Label);
            add(OrderDetails2Label);
            add(OrderDetails3Label);
            add(OrderDetails4Label);
            add(OrderDetails5Label);
        }};

        LabelStatusList = new ArrayList<>() {{
            add(null);
            add(null);
            add(null);
            add(null);
            add(null);
        }};

        choiceBoxStatusList = new ArrayList<>() {{
            add(status1ChoiceBox);
            add(status2ChoiceBox);
            add(status3ChoiceBox);
            add(status4ChoiceBox);
            add(status5ChoiceBox);
        }};

        status1ChoiceBox.getItems().addAll(statuses);
        status2ChoiceBox.getItems().addAll(statuses);
        status3ChoiceBox.getItems().addAll(statuses);
        status4ChoiceBox.getItems().addAll(statuses);
        status5ChoiceBox.getItems().addAll(statuses);

        loadOrders();
    }

    @Override
    public void goToHomePage() throws IOException {
        Main m= new Main();
        m.changeScene("home-page-manager.fxml");
    }

    @Override
    public void loadOrders() {
        int numberOfOrdersPerPage=0;
        int m=UsersList.getUsers().size();

        for(int j=0;j< m && numberOfOrdersPerPage<5;j++) {
            User auxUser=UsersList.getUsers().get(j);
            int n= auxUser.getOrders().size();
            for (int i = 0; i < n && numberOfOrdersPerPage < 5; i++) {
                if(auxUser.getOrders().get(i).getOrderStatus().equals("unprocessed")) {

                    loadOrder(auxUser.getOrders().get(i), auxUser, numberOfOrdersPerPage);
                    numberOfOrdersPerPage++;
                }
            }
        }

    }

    public void saveStatus()throws IOException{
        for(int i=0;i<5;i++){
            if(choiceBoxStatusList.get(i).isVisible()){
                //System.out.println("s a fc schimbarea");
                String newStatus= choiceBoxStatusList.get(i).getValue();
                for(int j=0;j<UsersList.getUsers().size();j++){
                    User auxUser= UsersList.getUsers().get(j);
                    if(LabelUserList.get(i).getText().equals(auxUser.getUsername())){
                        for(int z=0;z<auxUser.getOrders().size();z++){
                            Order auxOrder= auxUser.getOrders().get(z);
                            if(auxOrder.getOrderId().equals(LabelOrderIdList.get(i).getText())){

                                auxOrder.setOrderStatus(newStatus);
                                UsersList.persistUsers();
                            }
                        }
                    }
                }
            }
        }
        Main m=new Main();
        m.changeScene("new-orders-page.fxml");
    }

    @Override
    public String getRoleOfUser() {
        return "manager";
    }

}
