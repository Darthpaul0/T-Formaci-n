/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taskmanager;

/**
 *
 * @author pferna12
 */
enum States {
    NOT_DONE, IN_PROGRESS, DONE
};

public class Task {

    private String description;
    States state;

    private static int id = 1;
    private int taskID;

    public Task(String description) {
        this.description = description;
        this.state = States.NOT_DONE;
        this.taskID = id++;

    }

    public String getDescription() {
        return description;
    }

    public States getState() {
        return state;
    }

    public int getTaskId() {
        return taskID;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setState(States state) {
        this.state = state;
    }

    public void setTaskId(int taskID) {
        this.taskID = taskID;
    }

    @Override
    public String toString() {
        String task = "———"+"ID: " + this.taskID + " || STATE: " + this.state + "\n" + "DESCRIPTION: " + this.description + "\n" + "******";
        return task;
    }

}
