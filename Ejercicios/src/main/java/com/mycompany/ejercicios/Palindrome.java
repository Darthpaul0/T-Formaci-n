/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios;

/**
 *
 * @author pferna12
 */
public class Palindrome {

    private int number;

    Palindrome() {
    }

    // Methods
    public boolean isPalindrome(int palindrome) {
        // int reversing
        int reversed = 0;
        int digit = 0;
        int original = palindrome;
        boolean truth = true;

        while (palindrome > 0) {
            digit = palindrome % 10;
            reversed = (reversed * 10) + digit;
            palindrome /= 10;

        }
        if (original != reversed) {
            truth = false;
        }

        return truth;
    }

}
