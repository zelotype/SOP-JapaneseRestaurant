package com.soplab.lecture.menu;

public class PromotionSingleton {

    // TODO Define all of promotions for each menus

    private static PromotionSingleton instance;

    private PromotionSingleton () {}


    public static PromotionSingleton getInstance() {
        if (instance == null) {
            instance = new PromotionSingleton();
        }
        return instance;
    }
}
