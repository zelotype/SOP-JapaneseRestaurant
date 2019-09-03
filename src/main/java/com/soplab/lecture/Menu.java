package com.soplab.lecture;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Menu {
    String name;
    double price;
    String foodId;
    int amount;

    public Menu(String name, double price, String foodId, int amount) {
        this.name = name;
        this.price = price;
        this.foodId = foodId;
        this.amount = amount;
    }

    public Menu() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String buyFood() {
        String text;
        if (this.amount == 0) {
            text = "Sorry, this food is out of stock.";
        }
        else {
            text = "Buy food successfully! Thank you!";
            this.amount -= 1;
        }

        return text;
    }
}
