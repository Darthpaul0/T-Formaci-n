/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.wumpasmachine;

import java.util.ArrayDeque;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author pferna12
 */
public class VendingMachineInterface {

    public void run() throws Exception {
        ArrayDeque<Wumpas> totalWumpases = new ArrayDeque<>();
        ArrayDeque<Plumbus> totalPlumbuses = new ArrayDeque<>();
        VendingMachine myMachine = new VendingMachine();

        myMachine.chargeMachine(3, 5);

        // Showing main menu
        showCoinMenu(myMachine);
    }

    public static void showDrinkMenu(VendingMachine myMachine) throws Exception {
        boolean exit = false;
        Scanner scan = new Scanner(System.in);
        int option = 0;

        while (!exit) {
            System.out.println("""
                           Choose your drink: 
                           1. Wumpas
                           2. Plumbus
                           3. Cancel""");
            try {
                option = scan.nextInt();

            } catch (InputMismatchException ex) {
                System.err.println(ex.getMessage());
                exit = true;
            }

            switch (option) {
                case 1:
                    exit = purchaseWumpas(myMachine);
                    myMachine.setCurrentAmount(0);
                    break;

                case 2:
                    exit = purchasePlumbus(myMachine);
                    myMachine.setCurrentAmount(0);
                    break;

                case 3:
                    System.out.println("Have a nice day!");
                    exit = true;
                    break;

                default:
                    System.out.println("Incorrect option.");
            }
        }
    }

    public static void showCoinMenu(VendingMachine myMachine) throws Exception {
        boolean exit = false;
        Scanner scan = new Scanner(System.in);
        int option = 0;

        while (!exit) {
            System.out.println("Wumpas Plumbus Machine");
            System.out.println("Total Wumpas: " + myMachine.getMyWumpas().size() + " -> 1€");
            System.out.println("Total Plumbus: " + myMachine.getMyPlumbus().size() + " -> 1.5€");
            System.out.println("""
                           Insert coin: 
                           1. 10 cts
                           2. 20 cts
                           3. 50 cts
                           4. 1 €
                           5. 2 €
                           6. Purchase your drink
                           7. Cancel""");
            System.out.println("-----> Current amount inserted: " + myMachine.getCurrentAmount() + " €");
            try {
                option = scan.nextInt();

            } catch (InputMismatchException ex) {
                System.err.println(ex.getMessage());
                exit = true;
            }

            switch (option) {
                case 1:
                    myMachine.addCoin(0.1F);
                    break;

                case 2:
                    myMachine.addCoin(0.2F);
                    break;

                case 3:
                    myMachine.addCoin(0.5F);
                    break;

                case 4:
                    myMachine.addCoin(1F);
                    break;

                case 5:
                    myMachine.addCoin(2F);
                    break;

                case 6:
                    showDrinkMenu(myMachine);
                    break;

                case 7:
                    System.out.println("Have a nice day!");
                    exit = true;
                    break;

                default:
                    System.out.println("Incorrect option");
            }
        }
    }

    public static boolean purchaseWumpas(VendingMachine myMachine) throws Exception {
        Wumpas drinkWumpas = new Wumpas();

        if (myMachine.checkAmount(drinkWumpas.getPrice()) < 0) {
            System.out.println("Not enough money.");
        } else if (myMachine.checkAmount(drinkWumpas.getPrice()) > 0) {

            // Return change
            if (myMachine.removeWumpas()) {
                System.out.println("Drink bought successfully.");
                System.out.println("Take your change: " + myMachine.checkAmount(drinkWumpas.getPrice()));
            } else {
                throw new Exception("Not supply of Plumbus. Come back tomorrow.\n Don't forget your money: " + myMachine.getCurrentAmount());
            }
            return true;

        } else {
            // Exact amount inserted
            if (myMachine.removeWumpas()) {
                System.out.println("Drink bought successfully.");
                System.out.println(myMachine.getMyWumpas().size());
            } else {
                throw new Exception("Not supply of Plumbus. Come back tomorrow.\n Don't forget your money: " + myMachine.getCurrentAmount());
            }
            return true;
        }
        return false;
    }

    public static boolean purchasePlumbus(VendingMachine myMachine) throws Exception {
        Plumbus drinkPlumbus = new Plumbus();

        if (myMachine.checkAmount(drinkPlumbus.getPrice()) < 0) {
            System.out.println("Not enough money.");

        } else if (myMachine.checkAmount(drinkPlumbus.getPrice()) > 0) {

            // Return change
            if (myMachine.removePlumbus()) {
                System.out.println("Drink bought successfully.");
                System.out.println("Take your change: " + myMachine.checkAmount(drinkPlumbus.getPrice()));
            } else {
                throw new Exception("Not supply of Plumbus. Come back tomorrow.\n Don't forget your money: " + myMachine.getCurrentAmount());
            }
            return true;

        } else {
            // Exact amount inserted
            if (myMachine.removePlumbus()) {
                System.out.println("Drink bought successfully.");
                System.out.println(myMachine.getMyPlumbus().size());
            } else {
                throw new Exception("Not supply of Plumbus. Come back tomorrow.\n Don't forget your money: " + myMachine.getCurrentAmount());
            }
            return true;
        }
        return false;
    }
}
