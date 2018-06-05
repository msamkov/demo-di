package ru.multicon.demodi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import ru.multicon.demodi.controllers.ConstructorInjectedController;
import ru.multicon.demodi.controllers.MyController;
import ru.multicon.demodi.controllers.PropertyInjectedController;
import ru.multicon.demodi.controllers.SetterInjectedController;

/**
 *  Created by msamkov on 04.05.2018
 */
@SpringBootApplication
@ComponentScan(basePackages = {"ru.multicon"})
public class DemoDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoDiApplication.class, args);
		MyController controller = (MyController) ctx.getBean("myController");

        System.out.println(controller.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
