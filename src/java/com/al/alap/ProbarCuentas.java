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
public class ProbarCuentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioCuenta cuentaA=new CuentaAhorroImpl();
        System.out.println(cuentaA.crearCuenta());
        
        ServicioCuenta cuentaN=new CuentaNominaImpl();
        System.out.println(cuentaN.crearCuenta());
       
        ServicioCuenta cuentaD=new CuentaDebitoImpl();
        System.out.println(cuentaD.crearCuenta());
    }
    
}
