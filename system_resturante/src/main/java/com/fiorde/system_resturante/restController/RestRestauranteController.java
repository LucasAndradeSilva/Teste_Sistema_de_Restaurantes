package com.fiorde.system_resturante.restController;

import com.fiorde.system_resturante.repository.RestauranteRepository;

import java.util.List;

import com.fiorde.system_resturante.error.RestauranteNotFoundException;
import com.fiorde.system_resturante.model.Restaurante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestRestauranteController
 */
@RestController
public class RestRestauranteController {

    @Autowired
    RestauranteRepository restauranteRepository;

    //==========================
    //=== LISTA RESTAURANTES ===
    //==========================
    @GetMapping("/restaurantes")
    List<Restaurante> findAll(){
        return restauranteRepository.findAll();
    }

    //================
    //=== CADASTRA ===
    //================
    @PostMapping("/cadastroRestaurante")
    @ResponseStatus(HttpStatus.CREATED)
    Restaurante newRestaurante(@RequestBody Restaurante newRestaurante){        
        return restauranteRepository.save(newRestaurante);
    }

    //========================
    //=== PESQUISA PELO ID ===
    //========================
    @GetMapping("/restaurantes/{id}")
    Restaurante findOne(@PathVariable Long id) {
        return restauranteRepository.findById(id)
                .orElseThrow(() -> new RestauranteNotFoundException(id));
    }

    //==========================
    //=== PESQUISA PELO NOME ===
    //==========================
    /*
    @GetMapping("/restaurantes/{nome}")
    Restaurante findOne(@PathVariable String nome) {
        return restauranteRepository.findAll();



        //        .orElseThrow(() -> new RestauranteNotFoundException(id));
    }
    */

}

