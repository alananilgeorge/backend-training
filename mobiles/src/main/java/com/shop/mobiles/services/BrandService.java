package com.shop.mobiles.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mobiles.models.Brand;
import com.shop.mobiles.models.Model;
import com.shop.mobiles.repositories.BrandRepository;

@Service
public class BrandService {

	@Autowired
	private BrandRepository brandRepository;

	public Brand getBrand(String name) {
		return brandRepository.findById(name).orElse(null);
	}

	public void setBrand(Brand brand) {
		brandRepository.save(brand);
	}

	public List<Brand> getBrands() {
		List<Brand> brands = brandRepository.findAll();
		return brands;
	}

	public void update(Brand brand) {
		brandRepository.save(brand);

	}
	
	public void delete(Brand brand) {
		brandRepository.delete(brand);
	}
//	public List<Model> getModels(long id){
//		return modelRepository.findAll().forEach(arg0);
//	}
}
