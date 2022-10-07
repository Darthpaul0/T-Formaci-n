/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pferna12
 */
public class Division extends Operations {

    Division(double operator1, double operator2) {
        super(operator1, operator2);

    }

    @Override
    public double calculate() throws Exception {
        if(operator2 == 0){
            throw new Exception("Second operator must be different to 0");
        }
        
        return operator1 / operator2;
    }
}
