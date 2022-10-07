///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
// */
//package com.mycompany.calculator;
//
//import java.util.Scanner;
//
///**
// *
// * @author pferna12
// */
//public class Calculator1 {
//
//    public static String findCharacter(String charac) throws Exception {
//        String[] splitted = charac.split("");
//        String result = "";
//        int counter = 0;
//        for (int i = 0; i < charac.length(); i++) {
//            if ("+".equals(splitted[i])) {
//                result = "+";
//                counter++;
//            }
//            if ("-".equals(splitted[i])) {
//                result = "-";
//                counter++;
//            }
//            if ("*".equals(splitted[i])) {
//                result = "*";
//                counter++;
//            }
//            if ("/".equals(splitted[i])) {
//                result = "/";
//                counter++;
//            }
//        }
//        if (counter != 1) {
//            throw new Exception();
//        }
//        return result;
//    }
//
//    public static boolean positionsCorrect(String operation) {
//        if(operation.matches("")){
//            
//        }
//        String clean = operation.replace(" ", "");
//        String clean1 = operation.replace(".", ",");
//        String[] splitted = operation.split("");
//
//    }
//
//    public static void main(String[] args) {
//        Scanner sn = new Scanner(System.in);
//        System.out.println("Insert your mathematical: ");
//        String first = sn.nextLine();
//
//        switch () {
//            case 
//                ):
//                Addition add = new Addition(first);
//                System.out.println("The result is " + add.calculate());
//                break;
//            case 2:
//                Substraction substract = new Substraction(first);
//                System.out.println("The result is " + substract.calculate());
//                break;
//            case 3:
//                Multiplication mult = new Multiplication(first);
//                System.out.println("The result is " + mult.calculate());
//                break;
//            case 4:
//                Division div = new Division(first);
//                try {
//                    System.out.println("The result is " + div.calculate());
//                } catch (Exception e) {
//                    System.out.println("You cannot divide by 0");
//                }
//
//                break;
//        }
//    }
//
//}
