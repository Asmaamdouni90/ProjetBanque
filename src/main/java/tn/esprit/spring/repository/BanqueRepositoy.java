package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Banque;

@Repository
public interface BanqueRepositoy extends CrudRepository<Banque, Long>{

}
