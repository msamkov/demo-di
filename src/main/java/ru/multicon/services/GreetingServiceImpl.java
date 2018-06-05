package ru.multicon.services;

import org.springframework.stereotype.Service;

/**
 * Created by msamkov on 17.05.2018
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GREETING = "Hello friends";

    @Override
    public String sayGreeting() {
        return HELLO_GREETING;
    }
}
