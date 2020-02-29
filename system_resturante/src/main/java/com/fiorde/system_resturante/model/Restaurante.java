package com.fiorde.system_resturante.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Restaurante
 */
@Entity
public class Restaurante {

    @Id
    @GeneratedValue
    private Long idRestaurante;
    private String nomeRestaurante;        

    public Restaurante(){        
    }

    public Restaurante(Long Id, String nome){
        this.idRestaurante = Id;
        this.nomeRestaurante = nome;
    }

    public Restaurante(String nome){
        this.nomeRestaurante = nome;
    }

    public Long getId(){
        return idRestaurante;
    }

    public void setId(Long id)
    {
        this.idRestaurante = id;
    }
    
    public String getNomeRestaurante(){
        return nomeRestaurante;
    }

    public void setNomeRestaurante(String nome)
    {
        this.nomeRestaurante = nome;
    }

    @Override
    public String toString(){
        return "Restaurante{"+
               "idRestaurante=" +idRestaurante+
               ", nomeRestaurante="+nomeRestaurante+
               "}";
    }

}