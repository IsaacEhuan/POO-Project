package com.example.testeo.interfaceService;
import java.util.List;
import java.util.Optional;

import com.example.testeo.modelo.Anime;

public interface IAnimeservice {

    public List<Anime>listar();
    public Optional<Anime>listarId(int id);
    public int save (Anime p);
    public void delete(int id);
    
    

    
}
