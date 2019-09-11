package com.soplab.lecture.model;

public class FishSashimi extends Sashimi {
    String fishName;
    Double fishPrice;

    public String getFishName() {
        return fishName;
    }

    public void setFishName(String fishName) {
        this.fishName = fishName;
    }

    public Double getFishPrice() {
        return fishPrice;
    }

    public void setFishPrice(Double fishPrice) {
        this.fishPrice = fishPrice;
    }
}
