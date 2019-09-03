package com.soplab.lecture;

public class GetMenuType {
    String menuType;

    public Menu getType(String menuType) {
        if (menuType.equalsIgnoreCase("Menu")) {
            return new Menu();
        }
        else if (menuType.equalsIgnoreCase("Sashimi")) {
            return new Sashimi();
        }
        else if (menuType.equalsIgnoreCase("Sushi")) {
            return new Sushi();
        }
        return null;
    }
}
