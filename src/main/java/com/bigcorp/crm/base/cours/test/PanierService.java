package com.bigcorp.crm.base.cours.test;


/**
 * Gère les paniers des clients
 */
public class PanierService {

	private PaiementService paiementService;

	public void setPaiementService(PaiementService paiementService) {
		this.paiementService = paiementService;
	}

	public boolean achetePanier(Panier panier) {
		if (panier.getArticles().isEmpty()) {
			return false;
		}
		int prixTotal = panier.calculePrix();
		boolean paiementEffectue = paiementService.paie(panier.getEmailClient(), prixTotal);
		if (paiementEffectue) {
			panier.setEtat(PanierEtat.VENDU);
			System.out.println("Panier vendu !");
		}else {
			System.out.println("Erreur paiement");
		}
		return paiementEffectue;
	}

}
