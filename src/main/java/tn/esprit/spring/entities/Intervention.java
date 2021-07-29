package tn.esprit.spring.entities;


import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity

public class Intervention implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String description;
	
@Enumerated(EnumType.STRING)
private TypeIntervention typeintervention;
	
@Temporal (TemporalType.DATE)
private Date date;

@ManyToMany(mappedBy="interventions")
private List<Client> clients;

	public Intervention() {
	super();
		// TODO Auto-generated constructor stub
	}

	public Intervention(int id, String description, TypeIntervention typeintervention, Date date) {
		super();
		this.id = id;
		this.description = description;
		this.typeintervention = typeintervention;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public TypeIntervention getTypeintervention() {
		return typeintervention;
	}

	public void setTypeintervention(TypeIntervention typeintervention) {
		this.typeintervention = typeintervention;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@JsonIgnore
	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	

	



}
