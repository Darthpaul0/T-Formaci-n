/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.lang.reflect.Constructor;

/**
 *
 * @author pferna12
 */
public class Student {

    private int age;
    private String name;
    private String gender;
    
    public Student(int age, String name, String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static void main(String[] args) {
        Student myStudent = new Student(18, "Paco", "Hombre");
        System.out.println(myStudent.getAge());
    }
}
