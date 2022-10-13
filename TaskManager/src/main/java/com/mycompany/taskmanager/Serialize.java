/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taskmanager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author pferna12
 */
public class Serialize {

    private ObjectInputStream lectorObjetos;
    private ObjectOutputStream escritorObjetos;

    public void escribirObjeto(Object o, String nombreArchivo) throws IOException {
        try {
            escritorObjetos = new ObjectOutputStream(new FileOutputStream(nombreArchivo));
            escritorObjetos.writeObject(o);
            escritorObjetos.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public Object leerObjeto(String nombreArchivo) {
        Object devuelve = null;
        try {
            lectorObjetos = new ObjectInputStream(new FileInputStream(nombreArchivo));
            devuelve = lectorObjetos.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return devuelve;
    }
}
