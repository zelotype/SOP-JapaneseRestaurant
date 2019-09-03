package com.soplab.lecture;

public class Food extends Product{
    String expiredDate;
    Double volume;

    public Food(double price, String name, String productId, int amount) {
        super(price, name, productId, amount);
    }

    public Food() {}

    public String getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }
}
