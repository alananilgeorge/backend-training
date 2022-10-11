package Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repositories.BrandRepository;
import models.Brand;

@Service
public class BrandService {
	
	@Autowired
	private BrandRepository brandRepository;
	
	private List<Brand> brands =   brandRepository.findAll();
	
	
	public Brand getBrand(long id) {
		return brandRepository.findById(id).orElse(null);
	}
	public void setBrand(Brand brand) {
		brandRepository.save(brand);
	}
	public List<Brand> getBrands() {
		return brands;
	}

	
	

}
