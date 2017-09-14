package com.oskr.curso.curso_0909;

import java.io.Serializable;

/**
 * Created by Erika on 9/09/2017.
 */

public class hitorialDTO implements Serializable {
    private String clave;
    private String valor;
    private int posicion;

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
