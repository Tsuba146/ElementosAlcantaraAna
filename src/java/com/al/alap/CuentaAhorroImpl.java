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
public class CuentaAhorroImpl extends Cuenta implements ServicioCuenta{
    
    @Override
    public String crearCuenta() {
        return "Se ha creado con éxito una cuenta de Ahorro";
    }
    
}
