package ru.multicon.demodi.services;

import org.springframework.stereotype.Service;

/**
 * Created by msamkov on 17.05.2018
 */
@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the constructor";
    }
}
