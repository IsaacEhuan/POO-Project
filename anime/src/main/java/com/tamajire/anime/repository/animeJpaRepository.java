package com.tamajire.anime.repository;

import com.tamajire.anime.model.animes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface animeJpaRepository extends JpaRepository <animes,Long>{
    animes findByanimesid(String animeid);
}
    

