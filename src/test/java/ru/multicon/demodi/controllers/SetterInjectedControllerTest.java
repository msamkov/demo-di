package ru.multicon.demodi.controllers;

import org.junit.Before;
import org.junit.Test;
import ru.multicon.demodi.services.GreetingServiceImpl;

import static org.junit.Assert.*;

/**
 * Created by msamkov on 17.05.2018
 */
public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GREETING, setterInjectedController.sayHello());
    }
}