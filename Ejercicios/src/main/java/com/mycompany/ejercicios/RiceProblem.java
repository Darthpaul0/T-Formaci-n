/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios;

/**
 *
 * @author pferna12
 */
public class RiceProblem {

    public RiceProblem() {
    }

    public int calculateRicePackages(int amountOfRice) {
        int totalPackages = 0;
        int greaterPackage = 0;
        int mediumPackage = 0;
        int smallPackage = 0;
        int rest = 0;

        rest = amountOfRice % 5;
        greaterPackage = amountOfRice / 5;
        totalPackages = greaterPackage;
        if (rest == 3) {
            mediumPackage = 1;
        }
        if (rest == 2) {
            smallPackage = 1;
        }

        if (rest == 1) {
            greaterPackage -= 1;
            mediumPackage = 2;
        }

        if (rest == 4) {
            greaterPackage -= 1;
            smallPackage = 2;
        }

        System.out.println("5Kg: " + greaterPackage);
        System.out.println("3Kg: " + mediumPackage);
        System.out.println("2Kg: " + smallPackage);

        return greaterPackage + mediumPackage + smallPackage;
    }

}
