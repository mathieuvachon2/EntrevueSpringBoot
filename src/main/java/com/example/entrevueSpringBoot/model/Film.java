package com.example.entrevueSpringBoot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Film {

	@Id
    @GeneratedValue
    private long id; // Id du film est automatiquement généré
	private String titre;
	private String description;
	
	private ArrayList<Acteur> acteurs = new ArrayList<>();
	
//	public Film(String titre, String description, ArrayList<Acteur> acteurs) {
//		this.titre = titre;
//		this.description = description;
//		this.acteurs = acteurs;
//	}
	
	public Film() {
		
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setActeurs(ArrayList<Acteur> acteurs) {
		this.acteurs = acteurs;
	}

	public long getId() {
		return id;
	}

	public String getTitre() {
		return titre;
	}

	public String getDescription() {
		return description;
	}

	public ArrayList<Acteur> getActeurs() {
		return acteurs;
	}

}
