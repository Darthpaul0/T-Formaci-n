/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author pferna12
 */
public class School implements Interface{

    private String name;
    private int foundationYear;

    public School(Student students[], String name, int foundationYear) {
        this.foundationYear = foundationYear;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }
    
    @Override
    public void teach(){
        System.out.println(this.getName());
    }

    public static void main(String[] args) {
        Student myStudent = new Student(18, "Juan", "Hombre");
        Student myStudent1 = new Student(23, "Paco", "Hombre");
        Student myStudent2 = new Student(34, "Antonio", "Hombre");
        Student[] myStudents = {myStudent, myStudent1, myStudent2};
        School mySchool = new School(myStudents, "IES Zaidín Vergeles", 1890);
        
        mySchool.teach();

    }
}
