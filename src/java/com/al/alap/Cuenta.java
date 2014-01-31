/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.al.alap;

/**
 *
 * @author SHS
 */
public class Cuenta {
    
    private int numero;
    private String nombre;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String generarCuenta(){  
        return "esto esta mal pero lo dejamos asi";
    }
}
