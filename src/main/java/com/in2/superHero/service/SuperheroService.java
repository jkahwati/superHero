package com.in2.superHero.service;

import com.in2.superHero.model.SuperHero;

import java.util.List;
import java.util.Optional;

public interface SuperheroService {
    List<SuperHero>  getAllSuperheros(String name);
    Optional<SuperHero> findById(Long id);

}
