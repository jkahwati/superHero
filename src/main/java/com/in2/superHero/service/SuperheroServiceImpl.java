package com.in2.superHero.service;

import com.in2.superHero.model.ErrorResponse;
import com.in2.superHero.model.RecordNotFoundException;
import com.in2.superHero.model.SuperHero;
import com.in2.superHero.repository.SuperheroRepository;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class SuperheroServiceImpl extends Throwable implements SuperheroService {

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
        if (superheroRepository.existsById(id)) {
            return superheroRepository.findById(id);
        } else {
            throw new RecordNotFoundException("Invalid Superhero id: " + id);
        }
    }

    public ResponseEntity<SuperHero>  update(SuperHero superHero)  {
        if (superheroRepository.existsById(superHero.getId())) {
            return ResponseEntity.status(200).body(superheroRepository.save(superHero));
        } else {
            throw new RecordNotFoundException("Invalid Superhero id: " + superHero.getId());
        }
    }

    public ResponseEntity<SuperHero> addSuperhero(SuperHero superHero) {
        return ResponseEntity.status(200).body(superheroRepository.save(superHero));
    }

    public ResponseEntity<String> deleteSuperhero(Long id) {
        if (superheroRepository.existsById(id)) {
            superheroRepository.deleteById(id);
            Map<String, String> messageMapper = new HashMap<String,String>();
            messageMapper.put("message","Superhero is removed");
            return ResponseEntity.ok().body("{\"message\":\"Superhero is removed\"}");
        } else {
            throw new RecordNotFoundException("Invalid Superhero id: " + id);
        }
    }

}

