package com.soplab.lecture;

public class Sashimi extends Menu {
    int amountOfFish;
    String fishName;
    int order;

    public Sashimi (String name, double price, String foodId, int amount, int amountOfFish, String fishName) {
        super(name, price, foodId, amount);
        this.amountOfFish = amountOfFish;
        this.fishName = fishName;
        setOrder(amountOfFish);
    }

    public Sashimi() {}

    public int getAmountOfFish() {
        return amountOfFish;
    }

    public void setAmountOfFish(int amountOfFish) {
        this.amountOfFish = amountOfFish;
    }

    public String getFishName() {
        return fishName;
    }

    public void setFishName(String fishName) {
        this.fishName = fishName;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int amountOfFish) {
        this.order = amountOfFish * 5;
    }
}
