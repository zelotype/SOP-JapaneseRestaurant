package com.soplab.lecture.menu;

public class MenuFactory {

    public static Menu getType(String menuType) {
        if (menuType.equalsIgnoreCase("Sashimi")) {
            Menu m = new Menu();
            m.setType("Sashimi");
            return m;
        }
        else if (menuType.equalsIgnoreCase("Sushi")) {
            Menu m = new Menu();
            m.setType("Sushi");
            return m;
        }
        return new Menu();
    }
}
