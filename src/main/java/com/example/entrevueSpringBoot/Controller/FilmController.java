package com.example.entrevueSpringBoot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.example.entrevueSpringBoot.model.Film;
import com.example.entrevueSpringBoot.service.FilmService;

@RestController
public class FilmController {
	
	@Autowired
    FilmService service;
	
	// POST pour ajouter un film dans la base de données, retourne le film ajouté et statut 201
	@PostMapping(value= "/api/film")
	@ResponseStatus(HttpStatus.CREATED)
	public Film addFilm(@RequestBody Film film) {
		service.createFilm(film);
		return film;
		
	}
	
	// GET pour obtenir un film par ID
	@GetMapping(value= "api/film/{id}")
	public Film getFilm(@PathVariable("id") Long id) {
		return service.getFilm(id);
	}

}
