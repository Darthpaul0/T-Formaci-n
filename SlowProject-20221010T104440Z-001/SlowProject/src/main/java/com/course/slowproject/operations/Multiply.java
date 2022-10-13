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
public class Multiply extends Operation {

    public Multiply(ArrayList<Double> operands) {
        super(operands);
        this.name = "Multiply";
    }

    @Override
    public double operate() {
        double result = 1;
        ArrayList<Double> addoperands = new ArrayList<>();
        for (double number : this.operands) {
            result *= number;
        }
        return result;
    }
}
