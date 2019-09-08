package com.soplab.lecture.menu;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class MenuController {

    private final MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @RequestMapping(value="/menus", method = RequestMethod.GET)
    public List<Menu> getAllMenu() {
        return menuService.getAllMenus();
    }

    @RequestMapping(value="/addMenu", method = RequestMethod.POST)
    public Menu addMenu(@RequestBody Menu menu) {
        return menuService.addMenu(menu);
    }

    @RequestMapping(value = "/getMenu/{id}", method = RequestMethod.GET)
    public Menu getFood(@PathVariable int id) {
        return menuService.getMenu(id);
    }

    @RequestMapping(value = "/buyFoods/{id}", method = RequestMethod.POST)
    public Menu buyFoods(@PathVariable int id, @RequestBody Map<String, Integer> body) {
        // TODO If there is no "amount" in request body?
        return menuService.buyFoods(menuService.getMenu(id), body.get("amount"));
    }
}
