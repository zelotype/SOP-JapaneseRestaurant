package com.soplab.lecture;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Product {
    double price;
    String name;
    String productId;
    int amount;

    public Product(double price, String name, String productId, int amount) {
        this.price = price;
        this.name = name;
        this.productId = productId;
        this.amount = amount;
    }

    public Product() {}

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int buyProduct(String name) {
        System.out.println("You have purchased " + name + "successful.");
        return this.amount -= 1;
    }
}
