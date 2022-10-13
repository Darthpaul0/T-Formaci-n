package com.tsystems.labyrinth;

import com.tsystems.labyrinth.Position;
import java.util.ArrayDeque;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author aalonsoa
 */
public class Labyrinth {

    String fileName;
    char[][] map;
    ArrayDeque<Position> path;
    Position actualPosition;

    public Labyrinth(String fileName) {
        this.fileName = fileName;
        this.path = new ArrayDeque<>();
    }

    void readMap() throws IOException {
        ArrayList<String> arrayListLines = new ArrayList<>();

        BufferedReader bf = new BufferedReader(
                new FileReader(fileName));
        String line = bf.readLine();

        while (line != null) {
            arrayListLines.add(line);
            line = bf.readLine();
        }

        bf.close();

        String[] stringArray = arrayListLines.toArray(new String[0]);

        ArrayList<char[]> arrayCharacters = new ArrayList<>();

        for (int i = 0; i < stringArray.length; i++) {
            arrayCharacters.add(stringArray[i].toCharArray());
        }

        this.map = arrayCharacters.toArray(new char[0][0]);
    }

    private void getStart() {

        Position pos = null;

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == 'E') {
                    pos = new Position(i, j);
                }
            }
        }
        path.push(pos);
    }

    boolean canIMove(Position pos) {
        boolean result;
        
        int row = actualPosition.getRow(),
            column = actualPosition.getColumn();

        Position moveLeft = new Position(row, column + 1),
                 moveRight = new Position(row, column - 1),
                 moveUp = new Position(row + 1, column),
                 moveDown = new Position(row - 1, column);

        //Si encuentra espacio me puedo mover.
        if (map[row][column] == 'S') {
            return true;
        }

        if (map[row][column] == '#' || map[row][column] == '*') {
            return false;
        }

        if (map[row][column] != 'E') {
            map[row][column] = '*';
        }

        result = canIMove(moveLeft); //Moverse a la izquierda     
        if (result) {
            return true;
        }

        result = canIMove(moveRight); //Moverse a la derecha     
        if (result) {
            return true;
        }

        result = canIMove(moveUp); //Moverse hacia arriba     
        if (result) {
            return true;
        }

        result = canIMove(moveDown); //Moverse hacia abajo     
        if (result) {
            return true;
        }

        map[row][column] = ' '; //Si no encuentra pos. elimina la casilla marcada
        return false;

    }
    
    void resolve() {
        getStart();
        actualPosition = path.getLast();
        if(canIMove(actualPosition)) {
            path.push(actualPosition);
        } else {
            path.pop();
        }
    }

//    /*
//        Método que almacena todas las posiciones validas del laberinto.
//     */
//    boolean resolve() {
//
//        boolean result;
//        int row = path.getLast().getRow();
//        int column = path.getLast().getColumn();
//
//        //Si encuentra espacio me puedo mover.
//        if (map[row][column] == 'S') {
//            path.push(actualPosition = new Position(row, column));
//            return true;
//        }
//
//        if (map[row][column] == '#' || map[row][column] == '*') {
//            path.pop();
//            return false;
//        }
//
//        if (map[row][column] != 'E') {
//            map[row][column] = '*';
//        }
//
//        result = resolve(); //Moverse a la izquierda     
//        if (result) {
//            return true;
//        }
//
//        result = resolve(); //Moverse a la derecha     
//        if (result) {
//            return true;
//        }
//
//        result = resolve(); //Moverse hacia arriba     
//        if (result) {
//            return true;
//        }
//
//        result = resolve(); //Moverse hacia abajo     
//        if (result) {
//            return true;
//        }
//
//        map[row][column] = ' '; //Si no encuentra pos. elimina la casilla marcada
//        return false;
//
//    }

}
