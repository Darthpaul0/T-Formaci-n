/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.course.slowproject;

import java.util.ArrayList;

/**
 *
 * @author iblancas
 */
public class SlowProject {

    public static void main(String[] args) {
        ArrayList<Double> operands = new ArrayList<>();
        for (int i=1; i<6000;i++){
            operands.add((double)i);
        }
        
        Server server = Server.getInstance();
        server.run(operands);
    }
}
