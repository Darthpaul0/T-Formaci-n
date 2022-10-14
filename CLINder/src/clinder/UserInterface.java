/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinder;

import java.util.Scanner;

/**
 *
 * @author pferna12
 */
public class UserInterface {

    public void welcomeUser() {
        int option;
        System.out.println("""
                           WELCOME TO CLINder
                           1. Login
                           2. Register
                           """);
        switch (option) {
            case 1:
                loginUser();
                break;
            case 2:
                loginUser();
                break;
            default:
                throw new AssertionError();
        }
    }

    public static User loginUser() {
        String username = readString("Insert your username.");
        String password = readString("Insert your password.");
        return new User(username, password);
    }

    public void userLogged() {
    }

    public User registerUser() {
        String username = readString("Insert your username.");
        String userSex = readString("What do you think you are?");
        int userAge = readInteger("How old are you?");
        String userSexualOrientation = readString("What do you like?");
        int[] userInterests = askInterests();
        return new User(username, userAge, userSexualOrientation, userInterests, userSex);
    }

    public void askUserData() {

    }

    public int[] askInterests() {
        int[] preferences = null;
        int option = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; preferences.length < 3; i++) {
            System.out.println("""
                           Please choose three topics of interest:
                           1. Sports
                           2. Animals
                           3. Party
                           4. Boardgames
                           5. Travel
                           6. Music
                           """);
            while (!scan.hasNextInt()) {
                scan.next(); //si lo que se ha introducido no es un número lo sacamos del buffer
                System.out.println("El valor introducido no es un número, vuelva a intentarlo:");
            }
            preferences[i] = option;
            option = scan.nextInt();
        }
        return preferences;
    }

    public int matchingInterface(User posMatch) {
        int opcion = 0;
        Scanner scan = new Scanner(System.in);

        // show user attributes
        posMatch.toString();

        do {
            System.out.println("""
                           1. Like
                           2. Dislike
                           """);
            while (!scan.hasNextInt()) {
                scan.next(); //si lo que se ha introducido no es un número lo sacamos del buffer
                System.out.println("El valor introducido no es un número, vuelva a intentarlo:");
            }
            opcion = scan.nextInt();
        } while (opcion < 1 || opcion > 2);
        return opcion;
    }

    public static String readString(String mensaje) {
        System.out.println(mensaje);
        Scanner sc = new Scanner(System.in);
        String texto;
        texto = sc.nextLine();
        return texto;
    }

    public static int readInteger(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje);
        int num;

        //Antes de leer hay que comprobar que el tipo de valor introducido se corresponde con el solicitado
        //Si no lo hacemos y leemos directamente un valor no válido se lanzaría la excepción InputMismatchException
        while (!sc.hasNextInt()) {
            sc.next(); //si lo que se ha introducido no es un número lo sacamos del buffer
            System.out.println("Please enter a valid number: ");
        }
        num = sc.nextInt();

        return num;
    }

}
