package com.example.demo;

import java.util.Date;
import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {
    public static UUID id;
    public static void main(String[] args) {
        id = UUID.randomUUID();
        SpringApplication.run(DemoApplication.class, args);
    }
}

@RestController
class HomeController{

    @GetMapping(path = "/")
    public String home() {
        return "V2: " + DemoApplication.id.toString();
    }
}
