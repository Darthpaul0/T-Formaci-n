/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
public class Map {
    
    char[][] map;
    
    
    
    char[][] readMap(String fileName) throws IOException {
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

        char[][] map = arrayCharacters.toArray(new char[0][0]);

        return map;
    }
    
}
