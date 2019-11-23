package com.example.test.demo;

import com.example.test.demo.configuration.AppConfiguration;
import com.example.test.demo.vehicle.AlfaRomeo;
import com.example.test.demo.vehicle.Bmw;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		Bmw bmw = context.getBean(Bmw.class);
		AlfaRomeo alfaRomeo = context.getBean(AlfaRomeo.class);

		bmw.start();
		alfaRomeo.start();



		SpringApplication.run(DemoApplication.class, args);

		((AnnotationConfigApplicationContext) context).close();
	}

}
