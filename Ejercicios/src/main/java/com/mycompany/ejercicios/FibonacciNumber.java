/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios;

/**
 *
 * @author pferna12
 */
public class FibonacciNumber {

    public FibonacciNumber() {
    }

    public int findFibonacciNumber(int number) {
        int fibo = 0;
        int result = 0;
        int[] myArray = new int[number + 1];

        switch (number) {
            case 0 ->
                result = 0;
            case 1 ->
                result = 1;
            default -> {
                fibo = 2;
                for (int i = 2; i <= number; i++) {
                    fibo = fibo - 1 + fibo - 2;
                    myArray[i] = fibo;
                    System.out.println(fibo);
                }
                result = myArray[number];
            }
        }

        return result;
    }
}
