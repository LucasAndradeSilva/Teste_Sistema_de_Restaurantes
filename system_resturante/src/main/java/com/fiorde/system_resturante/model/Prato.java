package com.fiorde.system_resturante.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Prato
 */
@Entity
public class Prato {

    @Id
    @GeneratedValue
    private Long idPrato;
    private String nomePrato;        
    private BigDecimal precoPrato;

    public Prato(){        
    }

    public Prato(Long Id, String nome, BigDecimal preco){
        this.idPrato = Id;
        this.nomePrato = nome;
        this.precoPrato = preco;
    }

    public Prato(String nome, BigDecimal preco){
        this.nomePrato = nome;
        this.precoPrato = preco;
    }

    public Long getId(){
        return idPrato;
    }

    public void setId(Long id)
    {
        this.idPrato = id;
    }
    
    public String getNomePrato(){
        return nomePrato;
    }

    public void setNomePrato(String nome)
    {
        this.nomePrato = nome;
    }

    public BigDecimal getPreco(){
        return precoPrato;
    }

    public void setPreco(BigDecimal preco)
    {
        this.precoPrato = preco;
    }

    @Override
    public String toString(){
        return "Prato{"+
               "idPrato=" +idPrato+
               ", nomePrato='"+nomePrato+'\''+
               ", precoPrato="+precoPrato+               
               "}";             
    }


}