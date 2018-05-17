package ru.multicon.demodi.controllers;

import org.springframework.stereotype.Controller;

/**
 *  Created by msamkov on 04.05.2018
 */
@Controller
public class MyController {

    public String hello() {
        System.out.println("Hello!!!");
        return "foo";
    }
}
