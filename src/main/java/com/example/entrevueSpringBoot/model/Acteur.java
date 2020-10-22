package com.example.entrevueSpringBoot.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Acteur implements Serializable{

	@Id
    @GeneratedValue
    private long id; // Id de l'acteur est automatiquement généré
	private String nom;
	private String prénom;
	
//	public Acteur(String nom, String prénom) {
//		this.nom = nom;
//		this.prénom = prénom;
//	}
	
	public Acteur() {
		
	}

	public long getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public String getPrénom() {
		return prénom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrénom(String prénom) {
		this.prénom = prénom;
	}
}
