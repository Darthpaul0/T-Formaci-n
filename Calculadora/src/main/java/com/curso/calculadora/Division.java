/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.calculadora;

import static java.lang.Float.NaN;

/**
 *
 * @author dpadilla
 */
public class Division implements Operation{
    
    @Override
    public float operation(float a, float b) {
        float result= 0;
        
        
        try {
            result=(a/b);           
        } catch(ArithmeticException e) {
           result = NaN;
           throw new ArithmeticException("Divided by zero operation cannot possible");
        }
        
        return result;
    }

}
