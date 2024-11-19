package com.bigcorp.crm.base.cours.test;

public class Article {

	private String nom;
	private Integer prix;

	public Article(String nom, Integer prix) {
		this.nom = nom;
		this.prix = prix;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getPrix() {
		return prix;
	}

	public void setPrix(Integer prix) {
		this.prix = prix;
	}

}
