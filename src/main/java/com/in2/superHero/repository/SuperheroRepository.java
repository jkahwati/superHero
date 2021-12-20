package com.in2.superHero.repository;

import com.in2.superHero.model.SuperHero;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SuperheroRepository extends JpaRepository<SuperHero, Long> {

//    @Query(value = "SELECT * FROM BI_EMAIL_PERSONAS WHERE BEP_EMAIL = UPPER(:email) and BEP_FECHA_VALIDACION in (SELECT MAX(BEP_FECHA_VALIDACION) FROM BI_EMAIL_PERSONAS  WHERE BEP_EMAIL = UPPER(:email)) and ROWNUM = 1", nativeQuery = true)
//    Optional<Email> checkBi(@Param("email") String email);
    List<SuperHero> findAllByNameContainingIgnoreCase(String name);

}
