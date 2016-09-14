package com.elise.pbv3.presentation;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class Listener implements PhaseListener {


	/**
	 * Generated serial version, n�cessaire � l'impl�mentation
	 */
	private static final long serialVersionUID = 1L;

	
	// M�thodes n�cessaires � l'h�ritage de PhaseListener
	// 1. Appel�e par JSF apres chacune des six phases
	@Override
	public void afterPhase(PhaseEvent event) {
		System.out.println("Phase after : ");
	}
	// 2. Appel�e par JSF avant chacune des phases
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
