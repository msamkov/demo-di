package ru.multicon.demodi.controllers;

import ru.multicon.demodi.services.GreetingService;

/**
 * Created by msamkov on 17.05.2018
 */
public class PropertyInjectedController {

    public GreetingService greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }

}
