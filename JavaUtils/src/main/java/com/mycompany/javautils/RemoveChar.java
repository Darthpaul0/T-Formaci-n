/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javautils;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author pferna12
 */
public class RemoveChar {

    public String removeChar(String toRemove, String myString) {
        ArrayList<String> myArray = new ArrayList();
        String newString = "";
        String[] splitted = myString.split("");

        for (String anotherString : splitted) {
            myArray.add(anotherString);
        }
        Iterator<String> myIterable = myArray.iterator();

        while (myIterable.hasNext()) {
            String single = myIterable.next();
            if (single.equals(toRemove)) {
                myIterable.remove();
            }
        }

        for (String otroString : myArray) {
            newString += otroString;
        }
        return newString;

    }

    public static void main(String[] args) {
        RemoveChar myRemoveChar = new RemoveChar();
        System.out.println(myRemoveChar.removeChar("e", "machine learning"));
    }
}
