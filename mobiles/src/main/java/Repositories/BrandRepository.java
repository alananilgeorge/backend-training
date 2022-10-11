package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import models.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {

}
