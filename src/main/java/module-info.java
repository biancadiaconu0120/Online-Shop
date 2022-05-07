module com.example.onlineshop {
    requires javafx.controls;
    requires javafx.fxml;
    requires json;
    requires com.fasterxml.jackson.databind;


    opens com.example.onlineshop to javafx.fxml;
    exports com.example.onlineshop;
    exports com.example.onlineshop.controllers;
    exports com.example.onlineshop.model;
    opens com.example.onlineshop.controllers to javafx.fxml;
}