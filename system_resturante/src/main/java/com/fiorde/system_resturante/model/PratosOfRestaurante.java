package com.fiorde.system_resturante.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * PratosOfRestaurante
 */
@Entity
public class PratosOfRestaurante {

    @Id
    @GeneratedValue
    private Long IdPR;
    private String PratoPR;
    private BigDecimal PrecoPR;
    private String RestaurantePR;    
    private Long IdRestaurante;

    public PratosOfRestaurante(){

    }

    public PratosOfRestaurante(Long id, String pratoPR, BigDecimal precoPR, String restaurantePR){
        this.IdPR = id;
        this.PratoPR = pratoPR;
        this.PrecoPR = precoPR;
        this.RestaurantePR = restaurantePR;
    }

    
    public PratosOfRestaurante(String pratoPR, BigDecimal precoPR, String restaurantePR){        
        this.PratoPR = pratoPR;
        this.PrecoPR = precoPR;
        this.RestaurantePR = restaurantePR;
    }

    public Long getId(){
        return IdPR;
    }

    public void setId(Long id)
    {
        this.IdPR = id;
    }

    public String getPratoPR(){
        return PratoPR;
    }

    public void setPratoPR(String prato)
    {
        this.PratoPR = prato;
    }

    public BigDecimal getPrecoPR(){
        return PrecoPR;
    }

    public void setPrecoPR(BigDecimal preco)
    {
        this.PrecoPR = preco;
    }

    public String getRestaurantePR(){
        return RestaurantePR;
    }

    public void setRestaurantePR(String restaurante)
    {
        this.RestaurantePR = restaurante;
    }

    public Long getIdRestaurante(){
        return IdRestaurante;
    }

    public void getIdRestaurante(Long IdRestaurante)
    {
        this.IdRestaurante = IdRestaurante;
    }
}