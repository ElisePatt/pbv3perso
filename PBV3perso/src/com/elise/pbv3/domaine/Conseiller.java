package com.elise.pbv3.domaine;

import javax.persistence.Entity;

@Entity
public class Conseiller extends Personne {
	
	private String login;
	private String password;

	// Constructeurs
	public Conseiller(long id, String nom, String prenom, String email, String login, String password) {
		super(id, nom, prenom, email);
		this.login = login;
		this.password = password;
	}
	public Conseiller() {
		super();
	}

	// Getters et setters
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
