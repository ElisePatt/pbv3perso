package com.elise.pbv3.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public abstract class Compte {
	
	// Proprietes
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@OneToOne //TODO verifier s'il faut mettre compte ou client (mappedBy="client")
	private Client client;
	
	private float solde;
	
	
	// Constructeurs
	public Compte(float solde) {
		super();
		this.solde = solde;
	}
	public Compte() {
		super();
	}

	// Getters et setters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public float getSolde() {
		return solde;
	}
	public void setSolde(float solde) {
		this.solde = solde;
	}
	
	

}
