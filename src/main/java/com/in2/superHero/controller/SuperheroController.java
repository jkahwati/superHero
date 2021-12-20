package com.in2.superHero.controller;

import com.in2.superHero.model.SuperHero;
import com.in2.superHero.repository.SuperheroRepository;
import com.in2.superHero.service.SuperheroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/superheros")
public class SuperheroController {

    @Autowired
    SuperheroRepository superHeroRepository;
    @Autowired
    SuperheroService superheroService;

    @PostMapping
    public SuperHero addSuperHero(@RequestBody SuperHero superHero) {
        System.out.println(superHero.toString());
        return superHeroRepository.save(superHero);
    }

    @GetMapping
    public List<SuperHero> getAllSuperHeros(@RequestParam(required = false) String name) {
        return superheroService.getAllSuperheros(name);
    }

    @GetMapping("/{id}")
    public Optional<SuperHero> findAllByNameContaining(@PathVariable Long id) {
        return superheroService.findById(id);
    }

//    @PutMapping("/{id}")
//    public Optional<SuperHero> updateSuperhero(@PathVariable String id) {
//        return
//    }

}
