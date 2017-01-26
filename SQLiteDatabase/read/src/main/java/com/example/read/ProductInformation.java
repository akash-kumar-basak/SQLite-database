package com.example.read;

/**
 * Created by ENGINEER AKASH on 1/25/2017.
 */
public class ProductInformation {
    private int id;
    private String productName;
    private String productPrice;
    private String productQuantity;
    private String buyerName;
    private String advancePayment;
    private String due;

    public ProductInformation(int id, String productName, String productPrice, String productQuantity, String buyerName, String advancePayment, String due) {
        this.id = id;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.buyerName = buyerName;
        this.advancePayment = advancePayment;
        this.due = due;
    }

    public ProductInformation(String productName, String productPrice, String productQuantity, String buyerName, String advancePayment, String due) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.buyerName = buyerName;
        this.advancePayment = advancePayment;
        this.due = due;
    }

    public ProductInformation() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(String productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getAdvancePayment() {
        return advancePayment;
    }

    public void setAdvancePayment(String advancePayment) {
        this.advancePayment = advancePayment;
    }

    public String getDue() {
        return due;
    }

    public void setDue(String due) {
        this.due = due;
    }

    @Override
    public String toString() {
        return "ProductInformation{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productPrice='" + productPrice + '\'' +
                ", productQuantity='" + productQuantity + '\'' +
                ", buyerName='" + buyerName + '\'' +
                ", advancePayment='" + advancePayment + '\'' +
                ", due='" + due + '\'' +
                '}';
    }
}
