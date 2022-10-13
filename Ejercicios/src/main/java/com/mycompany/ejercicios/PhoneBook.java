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

    private HashMap<String, String> users;

    public PhoneBook(HashMap<String, String> users) {
        this.users = users;
    }

    public String getPhoneNumber(HashMap<String, String> myHashMap, String contact) {

        return myHashMap.get(contact);
    }

    public void addUser(HashMap<String, String> myHashMap, String contact, String number) {
        myHashMap.put(contact, number);
    }

    public static void main(String[] args) {
        HashMap<String, String> myAgenda = new HashMap<>();
        PhoneBook paginasAmarillas = new PhoneBook(myAgenda);
        paginasAmarillas.addUser(myAgenda, "Manolo", "888777444");
        paginasAmarillas.addUser(myAgenda, "Manoli", "958777444");

        System.out.println(paginasAmarillas.getPhoneNumber(myAgenda, "Manolo"));
    }
}
