package com.example.onlineshop.model;

public class Order {
    private String orderId;
    private String orderDetails;
    private String orderStatus;

    public Order(){

    }

    public Order(String orderId, String orderDetails, String orderStatus) {
        this.orderId = orderId;
        this.orderDetails = orderDetails;
        this.orderStatus = orderStatus;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(String orderDetails) {
        this.orderDetails = orderDetails;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
