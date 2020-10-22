package com.example.entrevueSpringBoot.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.entrevueSpringBoot.dao.ActeursRepository;
import com.example.entrevueSpringBoot.dao.FilmRepository;
import com.example.entrevueSpringBoot.model.Acteur;
import com.example.entrevueSpringBoot.model.Film;

@Service
public class FilmService {

	@Autowired
    FilmRepository filmRepository;
	
	@Autowired
    ActeursRepository acteurRepository;
	
	// Crée le film et le sauve dans la base de données H2
	@Transactional
	public void createFilm(Film film) {
		filmRepository.save(film);
		createActeurs(film.getActeurs());
	}
	
	// Trouve le film recherché en utilisant l'ID
	@Transactional
	public Film getFilm(Long id) {
		Optional<Film> film = filmRepository.findById(id);
		if(film.isPresent()) {
			return film.get();
		}
		return null;
	}
	
	// Crée chaque Acteur et les sauve dans la base de données H2
	private void createActeurs(ArrayList<Acteur> acteurs) {
		for(Acteur acteur: acteurs) {
			acteurRepository.save(acteur);
		}
	}
	
}
