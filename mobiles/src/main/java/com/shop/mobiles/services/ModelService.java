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

	public void update(Model model, Long id) {
		model.setId(id);
		Brand brand = modelRepository.getReferenceById(id).getBrand();
		model.setBrand(brand);
		modelRepository.save(model);

	}

	public void delete(Long id) {
		modelRepository.deleteById(id);
	}

	public List<Model> getModels(Long id) {
		return modelRepository.findAllByBrandId(id);
	}
}
