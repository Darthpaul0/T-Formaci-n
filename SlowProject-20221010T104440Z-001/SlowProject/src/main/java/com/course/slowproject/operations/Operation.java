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
public abstract class Operation {
    protected ArrayList <Double> operands;
    protected String name;
    
    Operation(ArrayList<Double> operands){
        this.operands = operands;
    }
    public abstract double operate();
    
    public String getName(){
        return this.name;
    };
}
