package ru.multicon.demodi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.multicon.demodi.controllers.ConstructorInjectedController;
import ru.multicon.demodi.controllers.MyController;
import ru.multicon.demodi.controllers.PropertyInjectedController;
import ru.multicon.demodi.controllers.SetterInjectedController;
import ru.multicon.demodi.datasource.FakeDataSource;

/**
 *  Created by msamkov on 04.05.2018
 */
@SpringBootApplication
public class DemoDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoDiApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

		System.out.println(fakeDataSource.getUser());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getUrl());

	}
}
