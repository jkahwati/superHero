package com.in2.superHero.service;

import com.in2.superHero.model.SuperHero;
import com.in2.superHero.repository.SuperheroRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import java.util.Optional;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class SuperheroServiceImplTest {
    private SuperheroServiceImpl superheroService;

    @Mock
    private SuperheroRepository superheroRepositoryMock;

    @BeforeEach
    void init () {
        superheroService = new SuperheroServiceImpl(superheroRepositoryMock);
    }

    @Test
    public void shouldFindASuperHero() throws Exception{
        SuperHero superhero = new SuperHero(1L,"Superman", null, null, null,null);
        when(superheroRepositoryMock.findById(1L)).thenReturn(Optional.of(superhero));

        Optional<SuperHero> response = superheroService.findById(1L);

        assert(response.get().getName()).equals(superhero.getName());
    }

    @Test
    public void shouldRemoveASuperHero() throws Exception{
        SuperHero superhero = new SuperHero();
        when(superheroRepositoryMock.existsById(1L)).thenReturn(true);
        doNothing().when(superheroRepositoryMock).deleteById(1L);

        ResponseEntity<String> response = superheroService.deleteSuperhero(1L);
        assert(response.getBody()).contains("Superhero is removed");

    }

}
