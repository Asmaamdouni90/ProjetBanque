package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Admin implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Client> clients;
	
	private String NomAdmin;
	private String PrenomAdmin;
	private String UserName;
	private String password;
	
	

	public Admin() {
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



	public String getNomAdmin() {
		return NomAdmin;
	}



	public void setNomAdmin(String nomAdmin) {
		NomAdmin = nomAdmin;
	}



	public String getPrenomAdmin() {
		return PrenomAdmin;
	}



	public void setPrenomAdmin(String prenomAdmin) {
		PrenomAdmin = prenomAdmin;
	}



	public String getUserName() {
		return UserName;
	}



	public void setUserName(String userName) {
		UserName = userName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}

    




	
	

}
