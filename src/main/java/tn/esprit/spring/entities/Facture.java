package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Facture implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	@ManyToOne
	private Client client;
	private String num_fact;
	private double montant;
	private Date dat_fac;
	private boolean statut ;
	        
	

	public Facture() {
		super();
	}

	public long getId() {
		return id;
	}

	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public String getNum_fact() {
		return num_fact;
	}


	public void setNum_fact(String num_fact) {
		this.num_fact = num_fact;
	}


	public double getMontant() {
		return montant;
	}


	public void setMontant(double montant) {
		this.montant = montant;
	}


	public Date getDat_fac() {
		return dat_fac;
	}


	public void setDat_fac(Date dat_fac) {
		this.dat_fac = dat_fac;
	}


	public boolean isStatut() {
		return statut;
	}


	public void setStatut(boolean statut) {
		this.statut = statut;
	}


	
	

}
