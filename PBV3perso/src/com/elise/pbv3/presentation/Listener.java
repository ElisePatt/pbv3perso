package com.elise.pbv3.presentation;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class Listener implements PhaseListener {


	/**
	 * Generated serial version, nécessaire à l'implémentation
	 */
	private static final long serialVersionUID = 1L;

	
	// Méthodes nécessaires à l'héritage de PhaseListener
	// 1. Appelée par JSF apres chacune des six phases
	@Override
	public void afterPhase(PhaseEvent event) {
		System.out.println("Phase after : ");
	}
	// 2. Appelée par JSF avant chacune des phases
	@Override
	public void beforePhase(PhaseEvent arg0) {
		System.out.println("Phase before : ");
	}
	// 3. Pour retourner le numero de phase ? 
	@Override
	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}
	
	

}
