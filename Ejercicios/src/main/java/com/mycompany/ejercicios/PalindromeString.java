/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios;

/**
 *
 * @author pferna12
 */
public class PalindromeString {

    private int number;

    PalindromeString() {
    }

    // Methods
    public boolean isPalindrome(String palindrome) {
        boolean truth = false;

        // String reversing
        String reversed = "";
        String[] splitted = palindrome.split("");
        for (int i = palindrome.length() - 1; i >= 0; i--) {
            reversed += splitted[i];
        }

        if (reversed.equals(palindrome)) {
            truth = true;
        }
        return truth;
    }
}
