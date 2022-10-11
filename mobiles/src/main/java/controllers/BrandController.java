package controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import models.Brand;
import Repositories.BrandRepository;
import Services.BrandService;

@RestController
@RequestMapping("/brands")
public class BrandController {

	@Autowired
	private BrandService brandService;

	@GetMapping()
	public List<Brand> listBrand() {
		return brandService.getBrands();
	}

	@GetMapping("{id}")
	public Brand getBrand(@PathVariable("id") long id) {
		return brandService.getBrand(id);
	}

	@PostMapping("new")
	@ResponseStatus(HttpStatus.OK)
	public void createBrand(@RequestBody Brand brand) {
		brandService.setBrand(brand);
	}

}
