package com.tamajire.anime.repository;

import com.tamajire.anime.model.Animes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimesJpaRepository extends JpaRepository <Animes,Long>{
    Animes findByanimesid(String animeid);
}
    

