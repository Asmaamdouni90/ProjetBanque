package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entities.Agence;

@Repository
public interface AgenceRepositoy extends CrudRepository<Agence, Long>{

}
