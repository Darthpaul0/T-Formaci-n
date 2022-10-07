/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javautils;

import java.util.ArrayDeque;

/**
 *
 * @author pferna12
 */
public class UsingLists {

    public static void main(String[] args) {
        ArrayDeque<Integer> myDeque = new ArrayDeque();
        for (int i = 0; i <= 100; i++) {
            myDeque.push(i);
        }
        while (!myDeque.isEmpty()) {
            System.out.println(myDeque.getFirst());
            myDeque.pop();
        }
    }

}
