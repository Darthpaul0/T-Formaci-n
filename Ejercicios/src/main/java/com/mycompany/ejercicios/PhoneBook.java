/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author pferna12
 */
public class PhoneBook {

    public static String getPhoneNumber(HashMap<String, String> myHashMap, String myKey) {

        return myHashMap.get(myKey);
    }

    public static void main(String[] args) {
        HashMap<String, String> users = new HashMap<>();
        users.put("Pepe", "6852152655");
        users.put("Pepa", "6852152677");
        users.put("Pep", "6852152699");
        users.put("Pepi", "6852152666");

        System.out.println(getPhoneNumber(users, "Pep"));
    }
}
