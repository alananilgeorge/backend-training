package com.shop.mobiles.services;

import java.util.ArrayList;
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

	public BrandDTO getBrand(Long id) {
		return convert(brandRepository.findById(id).orElse(null));
	}

	public void setBrand(BrandDTO brandDTO) {
		Brand brand = new Brand();
		brand.setname(brandDTO.getName());
		brandRepository.save(brand);
	}

	public List<BrandDTO> getBrands() {
		List<Brand> brands = brandRepository.findAll();
		List<BrandDTO> brandDTOs = new ArrayList();
		brands.forEach((brand) -> brandDTOs.add(convert(brand)));
		return brandDTOs;
	}

	public void update(BrandDTO brandDTO, Long id) {
		Brand br = brandRepository.getReferenceById(id);
		br.setname(brandDTO.getName());
		brandRepository.save(br);

	}

	public void delete(Long id) {
		brandRepository.deleteById(id);
	}

	public BrandDTO convert(Brand brand) {
		BrandDTO brandDTO = new BrandDTO();
		brandDTO.setName(brand.getname());
		return brandDTO;
	}

//	public List<Model> getModels(long id){
//		return modelRepository.findAll().forEach(arg0);
//	}
}
