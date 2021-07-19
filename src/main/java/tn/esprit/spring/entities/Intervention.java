package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Intervention implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToMany
	private Set<Client> clients;
	private String type_interventtion;
	public Intervention() {
		super();
	}
	public long getId() {
		return id;
	}
	public Set<Client> getClients() {
		return clients;
	}
	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}
	public String getType_interventtion() {
		return type_interventtion;
	}
	public void setType_interventtion(String type_interventtion) {
		this.type_interventtion = type_interventtion;
	}
}
