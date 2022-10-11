package com.shop.mobiles.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shop.mobiles.models.Model;

@Repository
public interface ModelRepository extends JpaRepository<Model, Long> {
	public List<Model> findAllByBrandBrandName(String name);
}
