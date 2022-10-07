/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios;

/**
 *
 * @author pferna12
 */
public class MCD {

    MCD() {
    }

    public int calculateMCD(int number1, int number2) {
        int mcd = 0;
        int greater = Math.max(number1, number2);
        int lower = Math.min(number1, number2);

        // 
        do {
            // assume mcd equals the lower number
            mcd = lower;
            System.out.println(mcd);
            System.out.println("---");

            // assume mcd equals mod
            lower = greater % lower;
            System.out.println(lower);
            System.out.println("---");

            greater = mcd;
            System.out.println(greater);
            System.out.println("---");

        } while (lower != 0);
        return mcd;
    }

}
