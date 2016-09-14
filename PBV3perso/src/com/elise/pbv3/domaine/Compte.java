package com.elise.pbv3.domaine;

public abstract class Compte {
	
	// Proprietes
	private long id;
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
