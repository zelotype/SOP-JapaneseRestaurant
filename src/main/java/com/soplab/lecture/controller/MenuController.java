package com.soplab.lecture.controller;

import com.soplab.lecture.factory.GetMenuType;
import com.soplab.lecture.model.Menu;
import com.soplab.lecture.model.Sashimi;
import com.soplab.lecture.model.Sushi;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
public class MenuController {

    List<Menu> jpMenu = Arrays.asList(
            new Sashimi("Salmon sashimi", 119, "001", 70, 15, "Salmon"),
            new Sushi("Uni sushi", 1500, "002", 5),
            new Sashimi("Maguro sashimi", 119, "003", 55, 10, "Tuna"),
            new Sushi("Salmonia roll sushi", 179, "004", 25)
    );

    @RequestMapping(value="/menu", method = RequestMethod.GET)
    public List<Menu> getAllMenu() {
        return jpMenu;
    }

    @RequestMapping(value="/addmenu", method = RequestMethod.POST)
    public Menu addMenu(@RequestBody Map<String, String> body) {
        GetMenuType menuType = new GetMenuType();
        String newMenuType = body.get("type");
        Menu newMenu = menuType.getType(newMenuType);
        newMenu.setName(body.get("name"));
        newMenu.setPrice(Double.parseDouble(body.get("price")));
        newMenu.setAmount(Integer.parseInt(body.get("amount")));
        newMenu.setFoodId(body.get("foodId"));
        jpMenu.add(newMenu);
        return newMenu;
    }

    @RequestMapping(value = "/getMenu/{id}", method = RequestMethod.GET)
    public Menu getFood(@PathVariable final String id) {
        return jpMenu.stream().filter(menu -> menu.getFoodId().equalsIgnoreCase(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No such food with id"));
    }

    @RequestMapping(value = "/buyfood/{id}", method = RequestMethod.PUT)
    public String buyFood(@PathVariable String id) {
        return jpMenu.stream().filter(menu -> menu.getFoodId().equalsIgnoreCase(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Sorry, We don't have this menu."))
                .buyFood();
    }
}
