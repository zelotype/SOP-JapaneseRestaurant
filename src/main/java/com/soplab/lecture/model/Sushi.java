package com.soplab.lecture.model;

public class Sushi extends Menu{

    public Sushi(String name, double price, String foodId, int amount) {
        super(name, price, foodId, amount);
    }

    public Sushi() {}

    public void buyFood(String foodId){
        if(this.amount < 1) {
            System.out.println("Sorry, " + foodId + " sold out today.");
        }
        else {
            System.out.println("You have purchased " + foodId);
            this.amount -= 1;
        }
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
