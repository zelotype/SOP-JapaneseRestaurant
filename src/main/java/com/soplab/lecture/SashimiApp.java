package com.soplab.lecture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@EnableJpaAuditing
public class SashimiApp {
    public static void main(String[] args) {

        SpringApplication.run(SashimiApp.class, args);

    }
}
