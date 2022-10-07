/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.javautils;

import java.util.ArrayList;

/**
 *
 * @author pferna12
 */
public class JavaUtils {

    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            myArray.add(i);
        }

        for (Integer number : myArray) {
            System.out.println(number);
        }
    }
}
