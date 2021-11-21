package com.example.testeo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="anime")
public class Anime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreAnime;
    private String nombreCapitulo;
    public Anime(int id, String nombreAnime, String nombreCapitulo) {
        this.id = id;
        this.nombreAnime = nombreAnime;
        this.nombreCapitulo = nombreCapitulo;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombreAnime() {
        return nombreAnime;
    }
    public void setNombreAnime(String nombreAnime) {
        this.nombreAnime = nombreAnime;
    }
    public String getNombreCapitulo() {
        return nombreCapitulo;
    }
    public void setNombreCapitulo(String nombreCapitulo) {
        this.nombreCapitulo = nombreCapitulo;
    }
    
}
