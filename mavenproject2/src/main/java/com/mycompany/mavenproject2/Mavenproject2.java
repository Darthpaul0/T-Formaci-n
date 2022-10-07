/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author pferna12
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        int counter = 0;
        for (int i = 0; i <= 10; i++) {
            counter += i;
        }
        System.out.println(counter);

        int countWhile = 0;
        int i = 0;
        while (i <= 10) {
            countWhile += i;
            i++;
        }
        System.out.println(countWhile);

        int countDoWhile = 0;
        int y = 0;
        do {
            countDoWhile += y;
            y++;
        } while (y <= 10);
        System.out.println(countDoWhile);

        int myCounter = 0;
        for (int x = 0; x < 100 && myCounter < 100; x++) {
            System.out.println(x);
            myCounter += x;
        }
        System.out.println(myCounter);

    }
}
