package com.in2.superHero.service;

import com.in2.superHero.model.SuperHero;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface SuperheroService {
    List<SuperHero>  getAllSuperheros(String name);
    ResponseEntity<SuperHero> addSuperhero (SuperHero superHero);
    Optional<SuperHero> findById(Long id);
    ResponseEntity<SuperHero> update(SuperHero superHero);

}
