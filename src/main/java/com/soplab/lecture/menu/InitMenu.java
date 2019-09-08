package com.soplab.lecture.menu;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitMenu implements CommandLineRunner {

    private final MenuService menuService;

    public InitMenu(MenuService menuService) {
        this.menuService = menuService;
    }

    public void run(String... args) {
        // Do something...
    }

}