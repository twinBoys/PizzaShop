package com.example.PizzaShop.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping(value = "/pizzas")
    public String getPizzas() {
        return "Pizzas are good! \nThis is my second pizza!";
    }

}
