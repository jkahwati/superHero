package com.in2.superHero.controller;

import com.in2.superHero.model.SuperHero;
import com.in2.superHero.repository.SuperHeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/superheros")
public class SuperheroController {

    @Autowired
    SuperHeroRepository superHeroRepository;

    @PostMapping
    public SuperHero addSuperHero(@RequestBody SuperHero superHero) {
        return superHeroRepository.save(superHero);
    }

    @GetMapping
    public List<SuperHero> getAllSuperHeros() {
        return superHeroRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<SuperHero> findSuperheroById(@PathVariable Long id) {
        return superHeroRepository.findById(id);
    }

}
