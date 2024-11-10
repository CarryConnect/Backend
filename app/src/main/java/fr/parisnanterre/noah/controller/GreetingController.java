package fr.parisnanterre.noah.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public String greet() {
        return "Hello from CarryConnect API!";
    }
}
