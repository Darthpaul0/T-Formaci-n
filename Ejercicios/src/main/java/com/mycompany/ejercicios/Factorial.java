/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios;

/**
 *
 * @author pferna12
 */
public class Factorial {

    Factorial() {

    }

    public int theFactorial(int number) {
        int factorial = 1;
        if (number != 0) {

            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
        } else {
            factorial = 0;
        }

        return factorial;
    }

}
