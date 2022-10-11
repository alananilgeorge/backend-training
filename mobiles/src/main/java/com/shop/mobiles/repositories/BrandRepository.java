package com.shop.mobiles.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shop.mobiles.models.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, String> {

}
