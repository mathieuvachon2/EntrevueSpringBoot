package com.example.entrevueSpringBoot.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.entrevueSpringBoot.model.Film;

public interface FilmRepository extends CrudRepository<Film, Long> {

}
