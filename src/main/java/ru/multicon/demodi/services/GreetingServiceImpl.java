package ru.multicon.demodi.services;

/**
 * Created by msamkov on 17.05.2018
 */
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GREETING = "Hello friends";

    @Override
    public String sayGreeting() {
        return HELLO_GREETING;
    }
}
