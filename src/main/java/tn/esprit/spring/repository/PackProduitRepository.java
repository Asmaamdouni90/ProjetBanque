package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.PackProduit;

@Repository
public interface PackProduitRepository extends CrudRepository<PackProduit, Long>{

}
