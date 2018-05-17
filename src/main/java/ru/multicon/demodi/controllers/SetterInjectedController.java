package ru.multicon.demodi.controllers;

import ru.multicon.demodi.services.GreetingService;

/**
 * Created by msamkov on 17.05.2018
 */
public class SetterInjectedController {
    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
