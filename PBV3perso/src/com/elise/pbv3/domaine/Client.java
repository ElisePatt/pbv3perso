package com.elise.pbv3.domaine;

import javax.persistence.Entity;

@Entity
public class Client extends Personne {
	
	private Adresse adresse;
	private CompteCourant ccourant;
	private CompteEpargne cepargne;

	// Constructeurs
	public Client(long id, String nom, String prenom, String email, Adresse adresse, CompteCourant ccourant,
			CompteEpargne cepargne) {
		super(id, nom, prenom, email);
		this.adresse = adresse;
		this.ccourant = ccourant;
		this.cepargne = cepargne;
	}
	public Client() {
		super();
	}

	// Getters et setters
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public CompteCourant getCcourant() {
		return ccourant;
	}
	public void setCcourant(CompteCourant ccourant) {
		this.ccourant = ccourant;
	}
	public CompteEpargne getCepargne() {
		return cepargne;
	}
	public void setCepargne(CompteEpargne cepargne) {
		this.cepargne = cepargne;
	}
	
	

}
