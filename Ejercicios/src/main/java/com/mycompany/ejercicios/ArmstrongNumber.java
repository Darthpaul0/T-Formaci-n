/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios;

/**
 *
 * @author pferna12
 */
public class ArmstrongNumber {

    ArmstrongNumber() {
    }

    public int calculateArmstrongNumber(int number) {
        // split number
        String stringy = Integer.toString(number);
        int digit = 0;
        int powered = 0;
        int total = 0;
        while (number > 0) {
            digit = number % 10;
            powered = (int) Math.pow(digit, stringy.length());
            System.out.println(powered);
            total += powered;
            number /= 10;
        }

        return total;
    }
}
