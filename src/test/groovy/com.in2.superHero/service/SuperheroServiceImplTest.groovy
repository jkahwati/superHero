package com.in2.superHero.service

import com.in2.superHero.model.SuperHero
import com.in2.superHero.repository.SuperheroRepository
import org.springframework.http.ResponseEntity
import spock.lang.Specification

class SuperheroServiceImplTest extends Specification {

    SuperheroServiceImpl superheroService;
    SuperheroRepository superheroRepository = Stub(SuperheroRepository);

    void setup() {
        superheroService = new SuperheroServiceImpl(superheroRepository);
    }

    void 'Should find a Superhero'() {
        given:
            SuperHero superHero = new SuperHero(1,"Superman", null, null, null,null);
            superheroRepository.findById(_ as Long) >> new Optional<SuperHero>(superHero)
        when:
            def response = superheroService.findById(1);
        then:
            System.out.println(response);
            response.get().getName() == superHero.getName()
    }

    void 'Should remove a Superhero'() {
        given:
            SuperHero superhero = new SuperHero();
            superheroRepository.existsById(_ as Long) >> true;
            superheroRepository.deleteById(_ as Long) >> null
        when:
            def response = superheroService.deleteSuperhero(1);
        then:
            System.out.println(response);
            response instanceof ResponseEntity
    }

}
