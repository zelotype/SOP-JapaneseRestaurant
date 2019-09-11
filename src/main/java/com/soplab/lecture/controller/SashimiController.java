package com.soplab.lecture.controller;

import com.soplab.lecture.model.Sashimi;
import com.soplab.lecture.service.SashimiService;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "Sashimi")
public class SashimiController {

    private final SashimiService SashimiService;

    public SashimiController(SashimiService sashimiService) {
        this.SashimiService = sashimiService;
    }

    @GetMapping(value = "/menu")
    public List<Sashimi> getAllMenu(){
        return SashimiService.getAllMenu();
    }

    @PostMapping(value = "/menu/{sashimiType}")
    public Sashimi create(@RequestBody Sashimi sashimi, @PathVariable String sashimiType) {
        return SashimiService.addMenu(sashimi, sashimiType);
    }

    @GetMapping(value = "/menu/{id}")
    public Sashimi getFood(@PathVariable String id) {
        return SashimiService.getMenu(id);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<List<Sashimi>> deleteFood(@PathVariable String id) {
        SashimiService.deleteMenu(id);
        return new ResponseEntity<List<Sashimi>>(SashimiService.getAllMenu(),HttpStatus.OK);
    }

    @PostMapping(value = "/update/{id}")
    public Sashimi update(@PathVariable String id, @RequestBody Sashimi sashimi) {
        return SashimiService.updateMenu(sashimi, id);
    }

    @PostMapping(value = "/buy/{id}")
    public Sashimi buyFoods(@PathVariable String id, @RequestBody Map<String, Integer> body) {
        // TODO If there is no "amount" in request body?
        return SashimiService.buyFoods(SashimiService.getMenu(id), body.get("amount"));
    }
}
