package com.soplab.lecture.factory;

import com.soplab.lecture.model.Menu;
import com.soplab.lecture.model.Sashimi;
import com.soplab.lecture.model.Sushi;

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
