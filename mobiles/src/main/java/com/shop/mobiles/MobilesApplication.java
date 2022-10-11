package com.shop.mobiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import controllers.BrandController;
import controllers.ModelController;

@SpringBootApplication
@ComponentScan(basePackageClasses= BrandController.class)
@ComponentScan(basePackageClasses=ModelController.class)
public class MobilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobilesApplication.class, args);
	}

}
