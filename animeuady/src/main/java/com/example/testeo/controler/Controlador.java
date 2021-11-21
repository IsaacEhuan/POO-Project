package com.example.testeo.controler;

import java.util.List;

import com.example.testeo.interfaceService.IAnimeservice;
import com.example.testeo.modelo.Anime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping
public class Controlador {
    @Autowired
    private IAnimeservice service;
    @GetMapping("/listar")
    public String listar(Model model){
        List<Anime>animes=service.listar();
        model.addAttribute("animes", animes);
        return "index";
    }
    
}
