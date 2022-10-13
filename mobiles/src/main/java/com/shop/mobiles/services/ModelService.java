package com.shop.mobiles.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mobiles.DTO.ModelDTO;
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

	public void setModel(ModelDTO modelDTO) {
		Model model = new Model();
		model.setModelName(modelDTO.getModelName());
		model.setPrice(modelDTO.getPrice());
		model.setBrand(modelDTO.getBrand());
		model.setVersion(modelDTO.getVersion());
		modelRepository.save(model);
	}

	public List<Model> getModels() {
		List<Model> models = modelRepository.findAll();
		return models;
	}

	public void update(ModelDTO modelDTO, Long id) {
		Model model = modelRepository.getReferenceById(id);
		model.setModelName(modelDTO.getModelName());
		model.setPrice(modelDTO.getPrice());
		model.setBrand(modelDTO.getBrand());
		model.setVersion(modelDTO.getVersion());
		modelRepository.save(model);

	}

	public void delete(Long id) {
		modelRepository.deleteById(id);
	}

	public List<Model> getModels(Long id) {
		return modelRepository.findAllByBrandId(id);
	}
}
