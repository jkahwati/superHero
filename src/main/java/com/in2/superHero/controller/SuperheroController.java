package com.in2.superHero.controller;

import com.in2.superHero.annotations.logExecutionTime.LogExecutionTime;
import com.in2.superHero.model.SuperHero;
import com.in2.superHero.repository.SuperheroRepository;
import com.in2.superHero.service.SuperheroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/superheros")
public class SuperheroController {

    @Autowired
    SuperheroService superheroService;

    @PostMapping
    @LogExecutionTime
    public ResponseEntity<SuperHero> addSuperHero(@RequestBody SuperHero superHero) {
        return superheroService.addSuperhero(superHero);
    }

    @GetMapping
    @LogExecutionTime
    public List<SuperHero> getAllSuperHeros(@RequestParam(required = false) String name) {
        return superheroService.getAllSuperheros(name);
    }

    @GetMapping("/{id}")
    @LogExecutionTime
    public Optional<SuperHero> findAllByNameContaining(@PathVariable Long id) {
        return superheroService.findById(id);
    }

    @PutMapping
    @LogExecutionTime
    public ResponseEntity<SuperHero> updateSuperhero(@RequestBody SuperHero superHero) {
        return superheroService.update(superHero);
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @LogExecutionTime
    public ResponseEntity<String> deleteSuperhero(@PathVariable Long id) {
        return superheroService.deleteSuperhero(id);
    }

}
