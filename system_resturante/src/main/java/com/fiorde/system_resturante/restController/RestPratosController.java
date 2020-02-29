package com.fiorde.system_resturante.restController;

import com.fiorde.system_resturante.model.Prato;
import com.fiorde.system_resturante.repository.PratoRepository;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestPratosController
 */
@RestController
public class RestPratosController {

    @Autowired
    PratoRepository repository;

    //================
    //=== CADASTRA ===
    //================
    @PostMapping("/cadastroPratos")
    @ResponseStatus(HttpStatus.CREATED)
    Prato newPrato(@RequestBody Prato newPrato){        
        return repository.save(newPrato);
    }


}