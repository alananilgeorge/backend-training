package com.shop.mobiles.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mobiles.models.Brand;
import com.shop.mobiles.models.Model;
import com.shop.mobiles.repositories.ModelRepository;

@Service
public class ModelService {

	@Autowired
	private ModelRepository modelRepository;

	public Model getModel(Long id) {
		return modelRepository.findById(id).orElse(null);
	}

	public void setModel(Model model) {
		modelRepository.save(model);
	}

	public List<Model> getModels() {
		List<Model> models = modelRepository.findAll();
		return models;
	}

	public void update(Model model) {
		modelRepository.save(model);

	}

	public void delete(Model model) {
		modelRepository.delete(model);
	}
	public List<Model> getModels(String name){
		return modelRepository.findAllByBrandBrandName(name);
	}
}
