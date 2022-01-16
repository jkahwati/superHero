package com.in2.superHero.repository;

import com.in2.superHero.model.SuperHero;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SuperheroRepository extends JpaRepository<SuperHero, Long> {

    List<SuperHero> findAllByNameContainingIgnoreCase(String name);

}
