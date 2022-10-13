package com.shop.mobiles.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mobiles.DTO.ModelDTO;
import com.shop.mobiles.models.Brand;
import com.shop.mobiles.models.Model;
import com.shop.mobiles.repositories.ModelRepository;
import com.shop.mobiles.repositories.BrandRepository;;
@Service
public class ModelService {

	@Autowired
	private ModelRepository modelRepository;

	@Autowired
	private BrandRepository brandRepository;
	
	public ModelDTO convert(Model model) {
		ModelDTO modelDTO = new ModelDTO();
		model.setModelName(modelDTO.getModelName());
		model.setPrice(modelDTO.getPrice());
		model.setBrand(modelDTO.getBrand());
		model.setVersion(modelDTO.getVersion());
		return modelDTO;
	}

	public ModelDTO getModel(Long id) {
		Model model = modelRepository.findById(id).orElse(null);
		ModelDTO modelDTO = new ModelDTO();
		modelDTO.setBrand(model.getBrand());
		modelDTO.setModelName(model.getModelName());
		modelDTO.setVersion(model.getVersion());
		modelDTO.setPrice(model.getPrice());
		return modelDTO;
	}

	public void setModel(ModelDTO modelDTO,Long brandId) {
		Model model = new Model();
		Brand brand = brandRepository.getReferenceById(brandId);
		model.setModelName(modelDTO.getModelName());
		model.setPrice(modelDTO.getPrice());
		model.setBrand(brand);
		model.setVersion(modelDTO.getVersion());
		modelRepository.save(model);
	}

	public List<ModelDTO> getModels() {
		List<Model> models = modelRepository.findAll();
		List<ModelDTO> modelDTOs = new ArrayList();
		models.forEach((model) -> {
			modelDTOs.add(convert(model));
		});
		return modelDTOs;
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

	public List<ModelDTO> getModels(Long id) {
		List<Model> models = modelRepository.findAllByBrandId(id);
		List<ModelDTO> modelDTOs = new ArrayList();
		models.forEach((model) -> {
			modelDTOs.add(convert(model));
		});
		return modelDTOs;
	}
}
