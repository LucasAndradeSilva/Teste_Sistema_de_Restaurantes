package com.fiorde.system_resturante.controller;

import com.fiorde.system_resturante.model.Restaurante;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/**
 * HomeController
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String getHome()
    {        
        return "home";
    }

}