/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.tresenraya;

import java.util.Scanner;

/**
 *
 * @author pferna12
 */
public class TresEnRaya {

    private static final String[] players = new String[2];
    private static int turn = 1;

    // Devuelve true si en el tablero hay tres fichas en línea o false en caso contrario.
    public static boolean checkWinner(Board board) {
        boolean winner = false;
        int[][] myBoard = board.getBoard();

        //Check rows
        for (int x = 0; x < 3; x++) {
            if ((myBoard[x][0] == myBoard[x][1]) && (myBoard[x][0] == myBoard[x][2]) && (myBoard[x][0] != 0)) {
                winner = true;
            }
        }
        //Check columns
        for (int y = 0; y < 3; y++) {
            if ((myBoard[0][y] == myBoard[1][y]) && (myBoard[2][y] == myBoard[0][y]) && (myBoard[0][y] != 0)) {
                winner = true;
            }
        }

        //Check diagonals (from 0,0 to 2,2)
        if ((myBoard[0][0] == myBoard[1][1]) && (myBoard[2][2] == myBoard[0][0]) && (myBoard[0][0] != 0)) {
            winner = true;
        }

        //Check inversal diagonal 
        if ((myBoard[0][2] == myBoard[1][1]) && (myBoard[2][0] == myBoard[0][2]) && (myBoard[2][0] != 0)) {
            winner = true;
        }

        return winner;

    }

    // Devuelve true si el tablero está completo y false si aún quedan casillas vacías.
    public static boolean gameOver(Board board) {
        boolean finished = true;
        int[][] myBoard = board.getBoard();

        for (int i = 0; i < myBoard.length; i++) {
            for (int j = 0; j < myBoard[i].length; j++) {
                if (myBoard[i][j] == 0) {
                    finished = false;
                }
            }
        }
        return finished;
    }

    public static void main(String[] args) {
        Board myBoard = new Board(new int[3][3]);

        myBoard.initialBoard();

        System.out.println("*** TIC-TAC-TOE ***");
        Scanner sc = new Scanner(System.in);
        players[0] = "Nonameo";
        players[1] = "Anonym";
        System.out.println(players[0] + " VS " + players[1]);

        int winner = 0;

        do {
            myBoard.showBoard();
            System.out.println("Turn to " + players[turn - 1]);
            System.out.println("******");
            String coordinates;
            int x = 0, y = 0;

            do {
                System.out.println("Insert row and column (x,y) ");
                coordinates = sc.next();
                if (readCoordinates(coordinates)[0].matches("[0-2]") && readCoordinates(coordinates)[1].matches("[0-2]")) {
                    x = Integer.parseInt(readCoordinates(coordinates)[0]);
                    y = Integer.parseInt(readCoordinates(coordinates)[1]);
                } else {
                    System.out.println("******");
                    System.out.println("Invalid coordinates. Try again.");
                    System.out.println("******");
                }

            } while (!myBoard.putSymbol(myBoard, turn, x, y));
            if (checkWinner(myBoard)) {
                winner = turn;
            }
            //para cambiar el turno
            turn = (turn == 1) ? 2 : 1;

        } while ((winner == 0) && !gameOver(myBoard));
        myBoard.showBoard();
        if (winner != 0) {
            System.out.println("The winner is " + players[winner - 1]);
        } else {
            System.out.println("There is no winner.");
        }
    }

    public static String[] readCoordinates(String coordinates) {
        coordinates.replace(",", ".").trim();
        String[] myCoordinates = coordinates.split(",");
        return myCoordinates;
    }
}
