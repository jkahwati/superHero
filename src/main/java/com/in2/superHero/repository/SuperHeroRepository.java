package com.in2.superHero.repository;

import com.in2.superHero.model.SuperHero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuperHeroRepository extends JpaRepository<SuperHero, Long> {
}
