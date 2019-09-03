package com.soplab.lecture;

public class GetProductType {
    String type;
    public Product getType(String type){
        if (type.equalsIgnoreCase("Food")) {
            return new Food();
        }
        else if (type.equalsIgnoreCase("Drink")) {
            return new Drink();
        }
        else if (type.equalsIgnoreCase("Product")) {
            return new Product();
        }
        return null;
    }
}
