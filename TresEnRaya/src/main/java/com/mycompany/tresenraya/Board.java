/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tresenraya;

/**
 *
 * @author pferna12
 */
public class Board {

    private int[][] board;
    private final String[] FICHAS = {"-", "0", "X"};

    public Board(int[][] board) {
        this.board = board;
    }

    public int[][] getBoard() {
        return board;
    }

    public String[] getFICHAS() {
        return FICHAS;
    }

    public void initialBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 0;
            }
        }
    }

    public void showBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(FICHAS[board[i][j]]);
            }
            System.out.println("");
        }
    }

    public boolean putSymbol(Board myBoard, int chip, int x, int y) {
//comprobamos que la posición está libre 
        boolean free = false;
        int[][] newBoard = myBoard.getBoard();
        if (newBoard[x][y] == 0) {
            free = true;
        }
        //si está libre asignamos la posición
        if (free) {
            newBoard[x][y] = chip;
        }
        return free;
    }

}
