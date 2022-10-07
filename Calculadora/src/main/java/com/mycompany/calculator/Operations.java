/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;

/**
 *
 * @author pferna12
 */
public abstract class Operations {

    double operator1;
    double operator2;

    Operations(double operator1, double operator2) {
        this.operator1 = operator1;
        this.operator2 = operator2;
    }

    public abstract double calculate() throws Exception ;
}
