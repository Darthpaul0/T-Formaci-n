/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.calculadora;

/**
 *
 * @author dpadilla
 */
public class Multiplication implements Operation {
    
    @Override
    public float operation(float a, float b) {
        float result=0;
        
        result=(a*b);
        
        return result;
    }
}
