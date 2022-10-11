package com.shop.mobiles.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.shop.mobiles.models.Brand;
import com.shop.mobiles.models.Model;
import com.shop.mobiles.services.BrandService;
import com.shop.mobiles.services.ModelService;

@RestController
@RequestMapping("/brands")
public class BrandController {

	@Autowired
	private BrandService brandService;

	@Autowired
	private ModelService modelService;

	@GetMapping()
	public List<Brand> listBrand() {
		return brandService.getBrands();
	}

	@GetMapping("/test")
	public String test() {
		return "aldnasdad";
	}

	@GetMapping("{name}")
	public Brand getBrand(@PathVariable("name") String name) {
		return brandService.getBrand(name);
	}

	@GetMapping("{name}/models")
	public List<Model> getModels(@PathVariable("name") String name){
		return modelService.getModels(name);
	}

	@PostMapping("")
	@ResponseStatus(HttpStatus.OK)
	public void createBrand(@RequestBody Brand brand) {
		brandService.setBrand(brand);
	}

	@PutMapping("{id}")
	public void update(@PathVariable("id") Long id, @Valid @RequestBody Brand brand) {
		brandService.update(brand);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Long id, @Valid @RequestBody Brand brand) {
		brandService.delete(brand);
	}
}