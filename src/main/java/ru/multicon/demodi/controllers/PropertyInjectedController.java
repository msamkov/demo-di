package ru.multicon.demodi.controllers;

import ru.multicon.demodi.services.GreetingServiceImpl;

/**
 * Created by msamkov on 17.05.2018
 */
public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }

}
