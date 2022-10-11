package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import models.Model;

@Repository
public interface ModelRepository extends JpaRepository<Model, Long> {

}
