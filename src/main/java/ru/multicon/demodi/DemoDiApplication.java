package ru.multicon.demodi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.multicon.demodi.controllers.MyController;
import sun.awt.AppContext;

/**
 *  Created by msamkov on 04.05.2018
 */
@SpringBootApplication
public class DemoDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoDiApplication.class, args);
		MyController controller = (MyController) ctx.getBean("myController");
		controller.hello();
	}
}
