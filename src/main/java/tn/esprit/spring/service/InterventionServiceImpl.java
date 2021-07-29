package tn.esprit.spring.service;


import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.Intervention;
import tn.esprit.spring.repository.ClientRepository;
import tn.esprit.spring.repository.InterventionRepository;

@Service

public class InterventionServiceImpl implements IInterventionService {

	private static final Logger l = LogManager.getLogger(InterventionServiceImpl.class);

	@Autowired
   InterventionRepository interrep;
	@Autowired
	ClientRepository clrep;

	@Override
	public List<Intervention> retrieveAllIntervention() {
		return (List<Intervention>) interrep.findAll();
	}

	@Override
	public Intervention addIntervention(Intervention i) {
	
		return interrep.save(i);
	}

	@Override
	public void deleteIntervention(int id) {
	
		interrep.deleteById(id);
			
	}
	

	@Override
	public Intervention retrieveIntervention(int id) {
		return interrep.findById(id).orElse(null);
	}

	public static Logger getL() {
		return l;
	}

	@Override
	public void updateById(int id, String description) {
		
		Intervention i = interrep.findById(id).get();
		i.setDescription(description);
		interrep.save(i);

	}

	@Override
	public void affectation(int id,long idclient) {
        Client  c = clrep.findById(idclient).get();
		Intervention i = interrep.findById(id).get();

		if(c.getInterventions() == null){

			List<Intervention> interventions = new ArrayList<Intervention>();
			
			interventions.add(i);
			c.setInterventions(interventions);
		}else{

			c.getInterventions().add(i);

		}
		
	

	}
	}

	
