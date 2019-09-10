package com.soplab.lecture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class JapaneseRestaurantController {
    public static void main(String[] args) {

        SpringApplication.run(JapaneseRestaurantController.class, args);

    }
}