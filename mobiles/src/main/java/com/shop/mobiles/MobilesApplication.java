package com.shop.mobiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.shop.mobiles.controllers.BrandController;
import com.shop.mobiles.controllers.ModelController;
import com.shop.mobiles.models.Brand;
import com.shop.mobiles.models.Model;
import com.shop.mobiles.repositories.BrandRepository;
import com.shop.mobiles.repositories.ModelRepository;
import com.shop.mobiles.services.BrandService;
import com.shop.mobiles.services.ModelService;

@SpringBootApplication(scanBasePackages = { "controllers", "models", "Repositories", "Services" })
@EnableJpaRepositories("com.shop.mobiles.*")
@ComponentScan(basePackages = { "com.shop.mobiles.*" })
@ComponentScan(basePackageClasses=ModelController.class)
@ComponentScan(basePackageClasses= BrandController.class)
@ComponentScan(basePackageClasses= BrandService.class)
@ComponentScan(basePackageClasses=ModelService.class)
@ComponentScan(basePackageClasses= BrandRepository.class)
@ComponentScan(basePackageClasses=ModelRepository.class)
public class MobilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobilesApplication.class, args);
	}

}
