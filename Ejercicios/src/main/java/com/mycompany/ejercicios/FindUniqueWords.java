/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios;

import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author pferna12
 */
public class FindUniqueWords {

    public static int CountWords(String myString) {
        String[] splitted = myString.trim().split(" ");
        HashSet<String> exists = new HashSet();

        exists.addAll(Arrays.asList(splitted));

        return exists.size();
    }

    public static void main(String[] args) {
        System.out.println(CountWords("   a af afa afa"));

    }

}
