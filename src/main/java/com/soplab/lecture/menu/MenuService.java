package com.soplab.lecture.menu;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
public class MenuService {

    private final MenuRepository menuRepository;

    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public Menu buyFoods(Menu menu, int amount) {
        // TODO Check if food is out of stock

        menu.setAmount(menu.getAmount() - amount);
        return menuRepository.save(menu);
    }

    public List<Menu> getAllMenus() {
        return menuRepository.findAll();
    }
    public Menu getMenu(long id) {
        return menuRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("No such food with id"));
    }

    public Menu addMenu(Menu menu) {
        return menuRepository.save(menu);
    }
}
