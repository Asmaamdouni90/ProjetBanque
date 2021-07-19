package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Credit implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	@OneToOne
	private Client client;
	
	private float montant;
	private float taux;
	private float remboresement;
	private float nbretranche;
	private Date datepaiement;
	
	private CreditType credittype;

	public Credit() {
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

	public CreditType getCredittype() {
		return credittype;
	}

	public void setCredittype(CreditType credittype) {
		this.credittype = credittype;
	}

	public float getMontant() {
		return montant;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}

	public float getTaux() {
		return taux;
	}

	public void setTaux(float taux) {
		this.taux = taux;
	}

	public float getNbretranche() {
		return nbretranche;
	}

	public void setNbretranche(float nbretranche) {
		this.nbretranche = nbretranche;
	}

	public Date getDatepaiement() {
		return datepaiement;
	}

	public void setDatepaiement(Date datepaiement) {
		this.datepaiement = datepaiement;
	}

	public float getRemboresement() {
		return remboresement;
	}

	public void setRemboresement(float remboresement) {
		this.remboresement = remboresement;
	}
	

    


	
	

}
