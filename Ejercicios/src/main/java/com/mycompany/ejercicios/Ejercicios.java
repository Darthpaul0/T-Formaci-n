/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejercicios;

/**
 *
 * @author pferna12
 */
public class Ejercicios {

    public static void main(String[] args) {
        Palindrome myPalindrome = new Palindrome();
        PalindromeString myPalindromeString = new PalindromeString();
        Factorial myFactorial = new Factorial();
        MCD myMCD = new MCD();
        ArmstrongNumber myNumber = new ArmstrongNumber();
        ReversingString myReversingString = new ReversingString();
        RiceProblem myRiceProblem = new RiceProblem();
        FibonacciNumber myFibonacciNumber = new FibonacciNumber();

        /*if (myPalindrome.isPalindrome(898)) {
            System.out.println("Is palindrome");
        } else {
            System.out.println("Not palindrome");
        }

        if (myPalindromeString.isPalindrome("aca")) {
            System.out.println("Is palindrome");
        } else {
            System.out.println("Not palindrome");
        }*/
        //System.out.println(myFactorial.theFactorial(5));
        //System.out.println(myMCD.calculateMCD(90, 48));
        //System.out.println(myNumber.calculateArmstrongNumber(44));
        //System.out.println(myReversingString.reverseString("aloha"));
        System.out.println("Total packages: " + myRiceProblem.calculateRicePackages(109));
        //System.out.println(myFibonacciNumber.findFibonacciNumber(5));
    }
}
