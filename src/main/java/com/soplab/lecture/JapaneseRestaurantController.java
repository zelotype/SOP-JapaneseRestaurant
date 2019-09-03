package com.soplab.lecture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController
//@EnableAutoConfiguration
public class JapaneseRestaurantController {
    List<Menu> jpMenu = new ArrayList<>(Arrays.asList(
            new Sashimi("Salmon sashimi", 119, "001", 70, 15, "Salmon"),
            new Sushi("Uni sushi", 1500, "002", 5),
            new Sashimi("Maguro sashimi", 119, "003", 55, 10, "Tuna"),
            new Sushi("Salmonia roll sushi", 179, "004", 25)
    ));
    public static void main(String[] args) {

        SpringApplication.run(JapaneseRestaurantController.class, args);

    }
    @RequestMapping(value="/menu", method = RequestMethod.GET)
    public List<Menu> getAllMenu() {
        return jpMenu;
    }

    @RequestMapping(value = "/getMenu/{id}", method = RequestMethod.GET)
    public Menu getFood(@PathVariable String id) {
        for (int i=0; i < jpMenu.size(); i++) {
            if (jpMenu.get(i).getFoodId().equalsIgnoreCase (id)) {
                return jpMenu.get(i);
            }
        }
        return null;
    }

    @RequestMapping(value = "/buyfood/{id}", method = RequestMethod.PUT)
    public String buyFood(@PathVariable String id) {
        for (int i=0; i < jpMenu.size(); i++) {
            if (jpMenu.get(i).getFoodId().equalsIgnoreCase (id)) {
                return jpMenu.get(i).buyFood();
            }
        }
        return "Sorry, We don't have this menu.";
    }


}
