/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.calculator;

import java.util.Scanner;

/**
 *
 * @author pferna12
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Insert your first number: ");
        double first = sn.nextDouble();
        System.out.println("Insert your second number: ");
        double second = sn.nextDouble();
        System.out.println("Choose an action:");
        System.out.println("1: Addition");
        System.out.println("2: Substraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        int selected = sn.nextInt();

        switch (selected) {
            case 1:
                Addition add = new Addition(first, second);
                System.out.println("The result is " + add.calculate());
                break;
            case 2:
                Substraction substract = new Substraction(first, second);
                System.out.println("The result is " + substract.calculate());
                break;
            case 3:
                Multiplication mult = new Multiplication(first, second);
                System.out.println("The result is " + mult.calculate());
                break;
            case 4:
                Division div = new Division(first, second);
                try{
                    System.out.println("The result is " + div.calculate());
                }catch(Exception e){
                    System.out.println("You cannot divide by 0");
                }
                
                break;
        }
    }

}
