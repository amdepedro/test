/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.test;

/**
 *
 * @author usuario
 */
public class Cuenta {

    double saldo;
//Comentario de prueba
    Cuenta(double d) {
        saldo = d;
    }

    Cuenta() {
    }

    void ingresar(double d) {
        saldo += d;
    }

    double saldo() {
        return saldo;
    }

}
