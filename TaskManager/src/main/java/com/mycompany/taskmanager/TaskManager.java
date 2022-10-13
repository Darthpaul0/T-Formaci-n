/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.taskmanager;

import java.util.ArrayList;

/**
 *
 * @author pferna12
 */
public class TaskManager {

    ArrayList<Task> myTasks = new ArrayList<>();

    public TaskManager(ArrayList<Task> myTasks) {
        this.myTasks = new ArrayList<>();
    }

    public void createTask(String des) {
        Task myTask = new Task(des);
        myTasks.add(myTask);
        System.out.println("Task successfully created.");
    }

    public void deleteTask(int id) {
        int size = myTasks.size();
        for (Task task : myTasks) {
            if (task.getTaskId() == id) {
                myTasks.remove(task);
            }
        }
        if (myTasks.size() == size || id > size) {
            System.out.println("Cannot find task id.");
        } else {
            System.out.println("Task successfully removed.");
        }
    }

    public Task selectTask(int id) {
        for (Task task : myTasks) {
            if (task.getTaskId() == id) {
                return task;
            }
        }
        int size = myTasks.size();
        if (myTasks.size() == size || id > size) {
            System.out.println("Cannot find task id.");
            return null;
        }
        return null;
    }

    public void changeTaskState(int id, States newState) {
        boolean exists = false;
        for (Task task : myTasks) {
            if (task.getTaskId() == id) {
                task.setState(newState);
                exists = true;
            }
        }
        if (!exists) {
            System.out.println("Task state is" + newState.name() + "already.");
        } else {
            System.out.println("Task state changed successfully");
        }
    }

    public void listTasks() {
        for (Task task : myTasks) {
            System.out.println(task.toString());
        }
    }
}
