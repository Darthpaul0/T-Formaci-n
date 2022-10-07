/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.calculadora;

import java.util.Scanner;

/**
 *
 * @author dpadilla
 */
public class Calculator {
    private String comand;
    private String[] numbers;
    private float firstNumber;
    private float secondNumber;
    private int operationType;
    private boolean exit=false;
    private boolean needOperation=true;
    
    
    public void run(){
        
       while(!exit){
           Scanner keyboard= new Scanner(System.in);
           needOperation=true;
           operationType=7;
           System.out.println("Please insert the operation: ");
           comand=keyboard.nextLine();
           comand=comand.toLowerCase();
           
           if(comand.contains("+")){
               operationType=1;
               numbers=comand.split("\\Q+");
           }else if(comand.contains("-")){
               operationType=2;
               numbers=comand.split("\\Q-");
           }else if(comand.contains("*")){
               operationType=3;
               numbers=comand.split("\\Q*");
           }else if(comand.contains("/")){
               operationType=4;
               numbers=comand.split("\\Q/");
           }else if(comand.contains("n!")){
               operationType=5;
               comand="0"+comand;
               numbers=comand.split("\\Qn!");
               if(numbers.length==1){
                  comand=comand+numbers[0];
                  numbers=comand.split("\\Qn!"); 
               }
           }else if(comand.contains("exit")){
               operationType=6;
               numbers="0,0".split("\\Q,");
           }else if(comand.contains("help")){
               operationType=7;
               numbers="0,0".split("\\Q,");
           }else{
               operationType=0;
               numbers="0,0".split("\\Q,");
               System.out.println("Please enter a valid operation format [ 2+2 1*1  2.5/3  n!3.885  6-9.2]");
           }
           
           try {
               firstNumber=Float.parseFloat(numbers[0]);
               secondNumber=Float.parseFloat(numbers[1]);
           } catch (NumberFormatException e) {
               System.out.println("Please enter the numbers valid format number [ 2   2.5  3.885   -9.2]");
           }
           
           

           float result = 0;

           Operation operation=null;


            switch (operationType) {
                case 1:
                    operation=new Sum();
                    break;               
                case 2:
                    operation=new Subtract();
                    break;
                case 3:
                    operation=new Multiplication();
                    break;
                case 4:
                    operation=new Division();
                    break; 
                case 5:
                    operation=new Factorial();
                    break; 
                case 6:
                    exit=true;
                    break;
                case 7:
                    System.out.println("Please insert the operation. \n + to Sum \n - to Subtract \n * to Multiply \n / to Divide "
                            + "\n n! to factorial or exit");
                    //operation=new NonOperation();
                    needOperation=false;
                    break;
                default:
                    needOperation=false;
                    //operation=new NonOperation();
                    System.out.println("No valid operation selected");                    
           }
            
           if(!exit && needOperation){
               try {
                   result=operation.operation(firstNumber, secondNumber);
               } catch (ArithmeticException e) {
                   System.out.println(e.getMessage());
               }

               System.out.println("The solution is: "+ result ); 
           }
        }
    }
       
}
