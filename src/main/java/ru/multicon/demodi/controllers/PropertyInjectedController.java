package ru.multicon.demodi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.multicon.demodi.services.GreetingService;

/**
 * Created by msamkov on 17.05.2018
 */
@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
