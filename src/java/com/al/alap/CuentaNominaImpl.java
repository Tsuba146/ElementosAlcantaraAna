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
public class CuentaNominaImpl extends Cuenta implements ServicioCuenta {
    
    @Override
    public String crearCuenta(){
        //Aqui va el código que se conecta a la base de datos que crea
        //este tipo de cuenta
        return "Se ha creado con éxito una cuenta de Nómina";
    }
    
}
