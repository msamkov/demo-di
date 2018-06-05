package ru.multicon.demodi.controllers;

import org.junit.Before;
import org.junit.Test;
import ru.multicon.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

/**
 * Created by msamkov on 17.05.2018
 */
public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GREETING, constructorInjectedController.sayHello());
    }
}