package com.shop.mobiles.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Brand {
	private String name;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
