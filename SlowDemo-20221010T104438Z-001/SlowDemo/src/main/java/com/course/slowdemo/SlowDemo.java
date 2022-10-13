/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.course.slowdemo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iblancas
 */
public class SlowDemo {
    
    public static void slowCheck(){
        try {  
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SlowDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void fastCheck(){
        try {  
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SlowDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    public static void main(String[] args) {
        fastCheck();
        slowCheck();
    }
}
