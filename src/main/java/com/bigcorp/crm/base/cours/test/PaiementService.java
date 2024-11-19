package com.bigcorp.crm.base.cours.test;

/**
 * Gère les paiements
 */
public class PaiementService {
	
	public static final int PRIX_MAXIMUM = 100_000;

	public boolean paie(String emailClient, int prixTotal) {
		if(emailClient == null) {
			return true;
		}
		if(prixTotal < 0 || prixTotal > PRIX_MAXIMUM) {
			return false;
		}
		//Opérations bancaires ici ...
		return true;
	}

}
