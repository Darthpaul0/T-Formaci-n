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
public class Add extends Operation{

    public Add(ArrayList<Double> operands) {
        super(operands);
        this.name = "Add";
    }

    
    @Override
    public double operate(){
        float result = 0;
        for(double number: this.operands){
            result+=number;
        }

        return result;
    }
}
