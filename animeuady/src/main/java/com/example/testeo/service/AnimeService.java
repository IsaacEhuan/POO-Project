package com.example.testeo.service;

import java.util.List;
import java.util.Optional;



import com.example.testeo.interfaceService.IAnimeservice;
import com.example.testeo.interfaces.IAnimes;
import com.example.testeo.modelo.Anime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AnimeService implements IAnimeservice {
    @Autowired
    private IAnimes data;
    
    @Override
    public List<Anime> listar() {
        // TODO Auto-generated method stub
        return (List<Anime>)data.findAll();
    }

    @Override
    public Optional<Anime> listarId(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int save(Anime p) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        
    }
   
    
}
