/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios;

/**
 *
 * @author pferna12
 */
public class ReversingString {

    public ReversingString() {
    }

    public String reverseString(String myString) {
        String reversed = "";
        String[] splitted = myString.split("");
        for (int i = myString.length() - 1; i >= 0; i--) {
            reversed += splitted[i];
        }

        return reversed;
    }
}
