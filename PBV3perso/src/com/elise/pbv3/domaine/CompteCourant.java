package com.elise.pbv3.domaine;

import javax.persistence.Entity;

@Entity
public class CompteCourant extends Compte {

	// Constructeurs
	public CompteCourant() {
		super();
	}
	public CompteCourant(float solde) {
		super(solde);
	}
	

}
