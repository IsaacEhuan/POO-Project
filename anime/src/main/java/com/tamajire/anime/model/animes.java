package com.tamajire.anime.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class animes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    // aqui vamos a generar la id 
    @Column(length = 25,nullable = false,unique=true)
    private String animeid;

    //titulo del anime
    @Column(length = 25,nullable = false)
    private String title;
    // autor
    @Column(length = 25,nullable = false)
    private String autor;
    //genero

    //capitulos
    @Column(length = 25,nullable = false)
    private int chapters;

    //premiere date ???

    //personajes could be array

    //estatus esta madre tiene una subclase 

    //duracion

    //lenguaje could be array

    //resumen
    @Column(length = 255,nullable = false)
    private String summary;
     // target audience



    //constructor 
    public animes(String animeid, String title, String autor, int chapters, String summary) {
        this.animeid = animeid;
        this.title = title;
        this.autor = autor;
        this.chapters = chapters;
        this.summary = summary;
    }



    public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
    }



    public String getAnimeid() {
        return animeid;
    }



    public void setAnimeid(String animeid) {
        this.animeid = animeid;
    }



    public String getTitle() {
        return title;
    }



    public void setTitle(String title) {
        this.title = title;
    }



    public String getAutor() {
        return autor;
    }



    public void setAutor(String autor) {
        this.autor = autor;
    }



    public int getChapters() {
        return chapters;
    }



    public void setChapters(int chapters) {
        this.chapters = chapters;
    }



    public String getSummary() {
        return summary;
    }



    public void setSummary(String summary) {
        this.summary = summary;
    }



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        animes other = (animes) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }



    @Override
    public String toString() {
        return "animes [animeid=" + animeid + ", autor=" + autor + ", chapters=" + chapters + ", id=" + id
                + ", summary=" + summary + ", title=" + title + "]";
    }

    
   



    
}
