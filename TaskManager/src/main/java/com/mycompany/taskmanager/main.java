/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taskmanager;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pferna12
 */
public class main {

    public static void main(String[] args) {
        var myTasks = new ArrayList<Task>();
        TaskManager myTaskManager = new TaskManager(myTasks);
        int option;
        System.out.println("***WELCOME TO THE TASK MANAGER***");
        do {
            option = generateMainMenu();
            switch (option) {
                case 1 -> // create task
                    myTaskManager.createTask(readString("Insert the task description."));
                case 2 -> // delete task
                    myTaskManager.deleteTask(readInteger("Insert the task id."));
                case 3 -> {
                    // change task status
                    Task selected = myTaskManager.selectTask(readInteger("Insert the task id."));
                    int statusOption = generateChangeStatusMenu();
                    do {

                        switch (statusOption) {
                            case 1 -> {
                                if (selected.getState() == States.IN_PROGRESS) {
                                    System.out.println("Task status is already in progress.");
                                } else {
                                    myTaskManager.changeTaskState(selected.getTaskId(), States.IN_PROGRESS);
                                    System.out.println("Task status successfully changed.");
                                }
                            }
                            case 2 -> {
                                if (selected.getState() == States.DONE) {
                                } else {
                                    myTaskManager.changeTaskState(selected.getTaskId(), States.DONE);
                                }
                            }

                            case 3 -> {
                                System.out.println("Back");
                            }
                        }
                    } while (statusOption != 3);
                }
                case 4 -> // list tasks
                    myTaskManager.listTasks();

                case 5 -> // exit program
                    System.out.println("Bye!");
            }

        } while (option != 5);

    }

    public static int generateMainMenu() {
        // Estructura del menú

        int option = 0;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("""
                               What do you want to do?
                               1. Create task
                               2. Delete task
                               3. Change task status
                               4. List tasks
                               5. Exit TaskManager
                               """);

            while (!teclado.hasNextInt()) {
                teclado.next(); //si lo que se ha introducido no es un número lo sacamos del buffer
                System.out.println("Invalid option, try again.");
            }
            option = teclado.nextInt();
            if (option < 1 || option > 5) {
                System.out.println("Invalid option, try again.");
            }

        } while (option < 1 || option > 6);

        return option;
    }

    public static String readString(String message) {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        String text;
        text = sc.nextLine();
        return text;
    }

    public static int readInteger(String message) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(message);
        int num;

        //Antes de leer hay que comprobar que el tipo de valor introducido se corresponde con el solicitado
        //Si no lo hacemos y leemos directamente un valor no válido se lanzaría la excepción InputMismatchException
        while (!teclado.hasNextInt()) {
            teclado.next(); //si lo que se ha introducido no es un número lo sacamos del buffer
            System.out.println("Please, introduce a valid integer and try again.");
        }
        num = teclado.nextInt();

        return num;
    }

    public static int generateChangeStatusMenu() {
        // Estructura del menú

        int opcion = 0;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("""
                               Change task status to:
                               1. IN_PROGRESS
                               2. DONE
                               3. Return to main menu.
                               """);

            while (!teclado.hasNextInt()) {
                teclado.next(); //si lo que se ha introducido no es un número lo sacamos del buffer
                System.out.println("Invalid option, try again.");
            }
            opcion = teclado.nextInt();
            if (opcion < 1 || opcion > 2) {
                System.out.println("Invalid option, try again.");
            }
        } while (opcion < 1 || opcion > 2);

        return opcion;
    }

}
