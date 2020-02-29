package com.fiorde.system_resturante.controller;

import com.fiorde.system_resturante.repository.RestauranteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * RestauranteController
 */
@Controller
public class RestauranteController {

    @Autowired
    RestauranteRepository restauranteRepository;

    //=======================
    //=== PAGINA CADASTRO ===
    //=======================
    @GetMapping(value="/cad")
    public String setCadastroRestaurante() {
        return "cadastro_Restaurante";
    }
    
    //==========================
    //=== LISTA RESTAURANTES ===
    //==========================
    @GetMapping("/pesquisa")
    public String listRestaurantes(Model model){
        model.addAttribute("restaurantes", restauranteRepository.findAll());
        return "pesquisar_Restaurantes";
    }
}