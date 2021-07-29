package tn.esprit.spring.service;

import java.util.List;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.Intervention;

@Service
public interface IInterventionService {
	
	List<Intervention> retrieveAllIntervention();  
	Intervention addIntervention(Intervention i); 
	void deleteIntervention(int id); 
	Intervention retrieveIntervention(int id); 
	void updateById (int id, String description);
	void affectation( int id ,long idclient);


}

