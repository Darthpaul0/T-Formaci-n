/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.tsystems.labyrinth;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author aalonsoa
 */
public class Labyrinth {

    public static void main(String[] args) throws IOException {
        
          char[][] mapLab = readMap();
          resolve(0,34,mapLab);
          printMap(mapLab);
    }
    
    /*Leemos archivo que contiene varias String 
    y lo convierte a un mapa (matriz de char[][])*/
    public static char[][] readMap() throws IOException {
        ArrayList<String> arrayListLines = new ArrayList<>();
        
        BufferedReader bf = new BufferedReader(
                            new FileReader("laberinto2.txt"));       
        String line = bf.readLine();
      
        while(line != null) {
            arrayListLines.add(line);
            line = bf.readLine();
        }
        
        bf.close();
        
        String[] stringArray = arrayListLines.toArray(new String[0]);
        
        ArrayList<char[]> arrayCharacters = new ArrayList<>();
        
        for(int i = 0; i < stringArray.length; i++) {
            arrayCharacters.add(stringArray[i].toCharArray());
        }

        char[][] map = arrayCharacters.toArray(new char[0][0]);
        
        return map;
    }
    
    public static void printMap(char[][] map) {
        for(int i = 0; i<map.length; i++) {
            for(int j = 0; j<map[0].length; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println("");
       
        }
    }
    
    public static void resolve(int file, int column,  char[][] map) {
        if(move(file,column, map)) {
            map[file][column] = 'E';
        }
    }
    
    public static boolean move(int file, int column, char[][] map) {
        boolean result;
        
        //Si encuentra espacio me puedo mover.
        if(map[file][column] == 'S') {
            return true;         
        }
        
        if(map[file][column] == '#' || map[file][column] == '*') {
            return false;
        }
        
        map[file][column] = '*';
        
        result = move(file, column+1, map); //Moverse a la izquierda     
        if(result) return true;
        
        result = move(file, column+-1, map); //Moverse a la derecha     
        if(result) return true;
        
        result = move(file+1, column, map); //Moverse hacia arriba     
        if(result) return true;
        
        result = move(file-1, column, map); //Moverse hacia abajo     
        if(result) return true;
        
        map[file][column] = ' '; //Si no encuentra pos. elimina la casilla marcada
        return false;
    }
    
}
