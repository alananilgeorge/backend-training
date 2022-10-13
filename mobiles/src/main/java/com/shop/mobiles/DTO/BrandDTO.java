package com.shop.mobiles.DTO;

import com.shop.mobiles.models.Brand;
import com.shop.mobiles.models.Model;

public class BrandDTO {
	private String name;
	private Long id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public BrandDTO convert(Brand brand) {
		BrandDTO brandDTO = new BrandDTO();
		brandDTO.setName(brand.getname());
		return brandDTO;
	}

}
