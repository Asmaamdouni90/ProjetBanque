package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PackProduit implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	@ManyToOne
	private Banque banque;
	
	private String nom_pack;
	private String service_pack;
	private float prix_pack;
	private Date datedebut;
	private Date datefin ;
	

	public PackProduit() {
		super();
	}

	public long getId() {
		return id;
	}

	

	public Banque getBanque() {
		return banque;
	}

	public void setBanque(Banque banque) {
		this.banque = banque;
	}

	public String getNom_pack() {
		return nom_pack;
	}

	public void setNom_pack(String nom_pack) {
		this.nom_pack = nom_pack;
	}

	public String getService_pack() {
		return service_pack;
	}

	public void setService_pack(String service_pack) {
		this.service_pack = service_pack;
	}

	public float getPrix_pack() {
		return prix_pack;
	}

	public void setPrix_pack(float prix_pack) {
		this.prix_pack = prix_pack;
	}

	public Date getDatedebut() {
		return datedebut;
	}

	public void setDatedebut(Date datedebut) {
		this.datedebut = datedebut;
	}

	public Date getDatefin() {
		return datefin;
	}

	public void setDatefin(Date datefin) {
		this.datefin = datefin;
	}
	
	

}
