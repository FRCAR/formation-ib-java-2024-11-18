package com.bigcorp.crm.base.cours.test;


import java.util.ArrayList;
import java.util.List;

/**
 * Un panier est un ensemble d'articles liés à un client, et avec un état.
 */
public class Panier {

	private PanierEtat etat = PanierEtat.PANIER;
	private String emailClient;
	private List<Article> articles = new ArrayList<>();

	public PanierEtat getEtat() {
		return etat;
	}

	public void setEtat(PanierEtat etat) {
		this.etat = etat;
	}

	public String getEmailClient() {
		return emailClient;
	}

	public void setEmailClient(String emailClient) {
		this.emailClient = emailClient;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public int calculePrix() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

}
