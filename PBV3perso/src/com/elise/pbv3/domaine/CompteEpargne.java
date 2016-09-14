package com.elise.pbv3.domaine;

import javax.persistence.Entity;

@Entity
public class CompteEpargne extends Compte {

	// Constructeurs
	public CompteEpargne() {
		super();
	}
	public CompteEpargne(float solde) {
		super(solde);
	}

}
