/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;

/**
 *
 * @author pferna12
 */
public class Substraction extends Operations{
    Substraction(double operator1, double operator2) {
        super(operator1, operator2);

    }

    @Override
    public double calculate() {
        return operator1 - operator2;
    }
}
