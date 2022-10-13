/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.course.slowproject.operations;

import java.util.ArrayList;

/**
 *
 * @author iblancas
 */
public class Substract extends Operation{

    public Substract(ArrayList<Double> operands) {
        super(operands);
        this.name = "Substract";
    }

    
    @Override
    public double operate(){
        double result = this.operands.get(0);
        for(int i=1; i<this.operands.size(); i++){
            result-=this.operands.get(i);
        }

        return result;
    }
}
