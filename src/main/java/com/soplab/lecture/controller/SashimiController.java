package com.soplab.lecture.controller;

import com.soplab.lecture.model.Sashimi;
import com.soplab.lecture.service.SashimiService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "sashimi")
public class SashimiController {

    private final SashimiService sashimiService;

    public SashimiController(SashimiService sashimiService) {
        this.sashimiService = sashimiService;
    }

    @GetMapping(value = "/menu")
    public List<Sashimi> getAllMenu(){
        return sashimiService.getAllMenu();
    }

    @PostMapping(value = "/menu/{sashimiType}")
    public Sashimi create(@RequestBody Sashimi sashimi, @PathVariable String sashimiType) {
        return sashimiService.addMenu(sashimi, sashimiType);
    }

    @GetMapping(value = "/menu/{id}")
    public Sashimi getFood(@PathVariable int id) {
        return sashimiService.getMenu(id);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<List<Sashimi>> deleteFood(@PathVariable int id) {
        sashimiService.deleteMenu(id);
        return new ResponseEntity<List<Sashimi>>(sashimiService.getAllMenu(),HttpStatus.OK);
    }

    @PostMapping(value = "/buy/{id}")
    public Sashimi buyFoods(@PathVariable int id, @RequestBody Map<String, Integer> body) {
        // TODO If there is no "amount" in request body?
        return sashimiService.buyFoods(sashimiService.getMenu(id), body.get("amount"));
    }
}
