package com.fiorde.system_resturante.error;

public class RestauranteNotFoundException extends RuntimeException {

    public RestauranteNotFoundException(Long id) {
        super("Restaurante não funciona : " + id);
    }

}
