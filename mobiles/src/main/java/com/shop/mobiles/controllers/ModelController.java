package com.shop.mobiles.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
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
import com.shop.mobiles.repositories.BrandRepository;
import com.shop.mobiles.services.BrandService;
import com.shop.mobiles.services.ModelService;

@RestController
@RequestMapping("models")
public class ModelController {
	@Autowired
	private ModelService modelService;

	@Autowired
	private BrandService brandService;
	
	@GetMapping()
	public List<Model> listModels() {
		return modelService.getModels();
	}

	@GetMapping("{id}")
	public Model viewModel(@PathVariable("id") Long id) {
		return modelService.getModel(id);
	}
	
	@PostMapping("{name}")
	@ResponseStatus(HttpStatus.OK)
	public void createModel(@RequestBody Model model,@PathVariable("name") String name) throws NotFoundException {
		if(brandService.getBrand(name)!=null) {
			Brand brand = brandService.getBrand(name);
			model.setBrand(brand);
			modelService.setModel(model);
		}
		else {
			throw new NotFoundException();
		}
		
	}

	@PutMapping("{id}")
	public void update(@PathVariable("id") Long id, @Valid @RequestBody Model model) {
		modelService.update(model);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Long id, @Valid @RequestBody Model model) {
		modelService.delete(model);
	}
}