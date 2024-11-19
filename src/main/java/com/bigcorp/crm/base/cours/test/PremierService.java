package com.bigcorp.crm.base.cours.test;

public class PremierService {

	private SecondService secondService;

	public void setSecondService(SecondService secondService) {
		this.secondService = secondService;
	}

	public String afficheInfo(String nom) {
		if (this.secondService.isValid(nom)) {
			return "Un nom valide : " + nom;
		}
		// else...
		return "Un nom invalide : " + nom;
	}

}
