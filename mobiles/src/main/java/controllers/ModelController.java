package controllers;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import Repositories.ModelRepository;
import Services.ModelService;
import models.Model;

@RestController
@RequestMapping("/models")
public class ModelController {
	@Autowired
	private ModelService modelService;
	
	@GetMapping()
	public List<Model> listModels() {
		return modelService.getModels();
	}

	@GetMapping("{id}")
	public Model viewModel(@PathVariable("id") long id) {
		return modelService.getModel(id);
	}
	
	@PostMapping("new")
	@ResponseStatus(HttpStatus.OK)
	public void createModel(@RequestBody Model model) {
		modelService.setModel(model);
	}
	
//	@PutMapping("{id}")
//	public ResponseEntity<Model> update(@PathVariable("id") long id,@Valid @RequestBody Model ){
//		
//	}

}

