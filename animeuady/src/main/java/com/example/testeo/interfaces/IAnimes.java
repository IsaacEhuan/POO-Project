package com.example.testeo.interfaces;

import com.example.testeo.modelo.Anime;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IAnimes extends CrudRepository<Anime,Integer> {
    
}
