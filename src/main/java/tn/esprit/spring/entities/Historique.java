package tn.esprit.spring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Historique implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	private String virement;
	private String  retrait;
	private String versement;

	public Historique(long id) {
		super();
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public String getVirement() {
		return virement;
	}

	public void setVirement(String virement) {
		this.virement = virement;
	}

	public String getRetrait() {
		return retrait;
	}

	public void setRetrait(String retrait) {
		this.retrait = retrait;
	}

	public String getVersement() {
		return versement;
	}

	public void setVersement(String versement) {
		this.versement = versement;
	}

	
	
	

}
