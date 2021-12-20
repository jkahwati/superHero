package com.in2.superHero.service;

import com.in2.superHero.model.SuperHero;
import com.in2.superHero.repository.SuperheroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SuperheroServiceImpl implements SuperheroService {

    private SuperheroRepository superheroRepository;

    @Autowired
    public SuperheroServiceImpl(SuperheroRepository superheroRepository) {
        this.superheroRepository = superheroRepository;
    }

    public List<SuperHero> getAllSuperheros(String name) {
        if (name == null) {
            return superheroRepository.findAll();
        } else {
            return superheroRepository.findAllByNameContainingIgnoreCase(name);
        }
    }

    public Optional<SuperHero> findById(Long id) {
        return superheroRepository.findById(id);
    }

}

