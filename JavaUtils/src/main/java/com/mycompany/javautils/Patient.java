/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javautils;

import java.util.PriorityQueue;

/**
 *
 * @author pferna12
 */
public class Patient implements Comparable<Patient> {

    private double risk;
    private String name;

    public Patient(double risk, String name) {
        this.risk = risk;
        this.name = name;
    }

    public double getRisk() {
        return risk;
    }

    public String getName() {
        return name;
    }

    public void setRisk(double risk) {
        this.risk = risk;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Patient patient) {
//        int risiko = 0;
//        if (patient.getRisk() > this.getRisk()) {
//            risiko = 1;
//        } else if (patient.getRisk() < this.getRisk()) {
//            risiko = -1;
//        } else {
//            risiko = 0;
//        }
        return Double.compare(patient.getRisk(), this.risk);
    }

    public static void main(String[] args) {
        Patient patient1 = new Patient(0.95, "Manolo");
        Patient patient2 = new Patient(0.37, "Manola");
        Patient patient3 = new Patient(0.45, "Pepe");
        Patient patient4 = new Patient(0.88, "Pepa");
        Patient patient5 = new Patient(0.12, "Juan");

        PriorityQueue<Patient> myAssurance = new PriorityQueue<>();

        myAssurance.add(patient1);
        myAssurance.add(patient2);
        myAssurance.add(patient3);
        myAssurance.add(patient4);
        myAssurance.add(patient5);

        for (Patient e : myAssurance) {
            System.out.println(e.getName() + " --> " + e.getRisk());
        }
    }
}
