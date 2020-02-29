package com.fiorde.system_resturante.restController;

import java.util.List;

import com.fiorde.system_resturante.model.PratosOfRestaurante;
import com.fiorde.system_resturante.repository.PrRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestPRController
 */
@RestController
public class RestPRController {

    @Autowired
    PrRepository prRepository;
    
    @GetMapping("/PratosRestaurante")
    List<PratosOfRestaurante> findAll(){
        return prRepository.findAll();
    }
 
    @PostMapping("/cadPR")
    @ResponseStatus(HttpStatus.CREATED)
    PratosOfRestaurante newPR(@RequestBody PratosOfRestaurante newPR){        
        return prRepository.save(newPR);
    }


    

}