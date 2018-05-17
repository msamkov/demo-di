package ru.multicon.demodi.controllers;

import org.springframework.stereotype.Controller;
import ru.multicon.demodi.services.GreetingService;

/**
 *  Created by msamkov on 04.05.2018
 */
@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        return greetingService.sayGreeting();
    }
}
