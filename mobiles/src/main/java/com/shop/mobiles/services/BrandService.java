package com.shop.mobiles.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mobiles.DTO.BrandDTO;
import com.shop.mobiles.models.Brand;
import com.shop.mobiles.models.Model;
import com.shop.mobiles.repositories.BrandRepository;

@Service
public class BrandService {

	@Autowired
	private BrandRepository brandRepository;

	public Brand getBrand(Long id) {
		return brandRepository.findById(id).orElse(null);
	}

	public void setBrand(BrandDTO brandDTO) {
		Brand brand = new Brand();
		brand.setname(brandDTO.getName());
		brandRepository.save(brand);
	}

	public List<Brand> getBrands() {
		List<Brand> brands = brandRepository.findAll();
		return brands;
	}

	public void update(BrandDTO brandDTO, Long id) {
		Brand br = brandRepository.getReferenceById(id);
		br.setname(brandDTO.getName());
		brandRepository.save(br);

	}

	public void delete(Long id) {
		brandRepository.deleteById(id);
	}
//	public List<Model> getModels(long id){
//		return modelRepository.findAll().forEach(arg0);
//	}
}
