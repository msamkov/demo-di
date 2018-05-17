package ru.multicon.demodi.controllers;

import org.junit.Before;
import org.junit.Test;
import ru.multicon.demodi.services.GreetingServiceImpl;

import static org.junit.Assert.*;

/**
 * Created by msamkov on 17.05.2018
 */
public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GREETING, propertyInjectedController.sayHello());
    }
}