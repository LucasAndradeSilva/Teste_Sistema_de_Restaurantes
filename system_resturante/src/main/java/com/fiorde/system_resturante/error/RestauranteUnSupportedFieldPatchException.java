package com.fiorde.system_resturante.error;

import java.util.Set;

public class RestauranteUnSupportedFieldPatchException extends RuntimeException {

    public RestauranteUnSupportedFieldPatchException(Set<String> keys) 
    {
        super("Field " + keys.toString() + " update is not allow.");
    }

}
