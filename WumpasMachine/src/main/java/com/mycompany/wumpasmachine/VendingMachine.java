/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.wumpasmachine;

import java.util.ArrayDeque;

/**
 *
 * @author pferna12
 */
public class VendingMachine {

    ArrayDeque<Plumbus> myPlumbus;
    ArrayDeque<Wumpas> myWumpas;
    float currentAmount;

    public VendingMachine() {
        this.myPlumbus = new ArrayDeque<>();
        this.myWumpas = new ArrayDeque<>();
        this.currentAmount = 0;
    }

    public ArrayDeque<Plumbus> getMyPlumbus() {
        return myPlumbus;
    }

    public ArrayDeque<Wumpas> getMyWumpas() {
        return myWumpas;
    }

    public float getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(float currentAmount) {
        this.currentAmount = currentAmount;
    }

    public void chargeMachine(int nWumpas, int nPlumbus) {

        for (int i = 0; i < nWumpas; i++) {
            this.getMyWumpas().add(new Wumpas());
        }
        for (int i = 0; i < nPlumbus; i++) {
            this.getMyPlumbus().add(new Plumbus());
        }
    }

    public void addCoin(float newCoin) {
        if (newCoin > 0) {
            this.setCurrentAmount(this.getCurrentAmount() + newCoin);
        } 
    }

    public float checkAmount(float money) {
        return this.getCurrentAmount() - money;
    }

    public boolean removeWumpas() {
        boolean res;
        int size = this.getMyWumpas().size();

        if (size == 0) {
            res = false;
        } else {
            this.getMyWumpas().remove();
            res = this.getMyWumpas().size() == size - 1;
        }

        return res;
    }

    public boolean removePlumbus() {
        boolean res;
        int size = this.getMyPlumbus().size();

        if (size == 0) {
            res = false;
        } else {
            this.getMyPlumbus().remove();
            res = this.getMyPlumbus().size() == size - 1;
        }

        return res;
    }

}
