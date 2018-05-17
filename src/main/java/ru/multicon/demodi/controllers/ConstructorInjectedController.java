package ru.multicon.demodi.controllers;

import ru.multicon.demodi.services.GreetingService;

/**
 * Created by msamkov on 17.05.2018
 */
public class ConstructorInjectedController {
    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
