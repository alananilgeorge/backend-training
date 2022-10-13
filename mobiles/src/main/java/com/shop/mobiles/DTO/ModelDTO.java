package com.shop.mobiles.DTO;

import com.shop.mobiles.models.Brand;
import com.shop.mobiles.models.Model;

public class ModelDTO {
	String modelName;
	int price;
	int version;
	private Long id;
	Brand brand;

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public ModelDTO convert(Model model) {
		ModelDTO modelDTO = new ModelDTO();
		model.setModelName(modelDTO.getModelName());
		model.setPrice(modelDTO.getPrice());
		model.setBrand(modelDTO.getBrand());
		model.setVersion(modelDTO.getVersion());
		return modelDTO;
	}
}
