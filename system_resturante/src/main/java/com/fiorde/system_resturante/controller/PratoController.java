package com.fiorde.system_resturante.controller;

import com.fiorde.system_resturante.repository.PrRepository;
import com.fiorde.system_resturante.repository.PratoRepository;
import com.fiorde.system_resturante.repository.RestauranteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * PratoController
 */
@Controller
public class PratoController {

    @Autowired
    PratoRepository pratoRepository;

    @Autowired
    RestauranteRepository restauranteRepository;

    @Autowired
    PrRepository prRepository;

    @GetMapping("/cadPrato")
    public String setCadPrato(Model model)
    {
        model.addAttribute("restaurantes", restauranteRepository.findAll());
        return "cadastro_Pratos";
    }

    @GetMapping("/pesquisaPR")
    public String getPratos(Model model)
    {
        model.addAttribute("PratosRestaurante", prRepository.findAll());
        return "pesquisar_Pratos";
    }

}