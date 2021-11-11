package com.tamajire.anime;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.tamajire.anime.model.Animes;
import com.tamajire.anime.repository.AnimesJpaRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class AnimesJpaRepositoryTest {
    @Autowired
    private AnimesJpaRepository repo;
    @Test
    public void saveAnime(){
        Animes prueba = new Animes("50", "yo", "yo", 4, "xd");
        repo.save(prueba);
        repo.flush();
        assertEquals(1, repo.findAll());
    }
    
}
