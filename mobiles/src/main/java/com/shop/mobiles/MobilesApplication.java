package com.shop.mobiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import controllers.MobileController;

@SpringBootApplication
@ComponentScan(basePackageClasses=MobileController.class)
public class MobilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobilesApplication.class, args);
	}

}
