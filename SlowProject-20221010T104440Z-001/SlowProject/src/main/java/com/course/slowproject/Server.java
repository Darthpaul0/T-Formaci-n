/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.course.slowproject;
import com.course.slowproject.operations.*;
import java.util.ArrayList;

/**
 *
 * @author iblancas
 */
public class Server {
    
    private static Server instance;
    
    public static Server getInstance(){
        if(Server.instance == null) {
            Server server = new Server();
            Server.instance = server;
        }
        return Server.instance;
    }
    
    public void run(ArrayList<Double> operands){
        ArrayList<Operation> operations = new ArrayList<>();
        operations.add(new Substract(operands));
        operations.add(new Add(operands));
        operations.add(new Multiply(operands));
        
        
        for(int i=0; i<6000; i++){
            for(Operation operation: operations){
                operation.operate();
            }
        }

        
    }
    
    
}
