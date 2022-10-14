/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.wumpasmachine;

import java.util.ArrayDeque;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author pferna12
 */
public class VendingMachineTest {

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void testSomeMethod() {
        // GIVEN
        // THEN
        // EXPECT
    }

    /**
     * Test of chargeMachine method, of class VendingMachine.
     */
    @org.junit.Test
    public void testChargeMachine() {
        // GIVEN
        System.out.println("chargeMachine");
        int nWumpas = 5;
        int nPlumbus = 5;
        VendingMachine instance = new VendingMachine();

        // THEN
        instance.chargeMachine(nWumpas, nPlumbus);

        // EXPECT
        assertEquals(instance.getMyPlumbus().size(), nPlumbus);
        assertEquals(instance.getMyWumpas().size(), nWumpas);
    }

    /**
     * Test of addCoin method, of class VendingMachine. update the current
     * amount by adding a new coin
     */
    @org.junit.Test
    public void testAddCoin() {
        // GIVEN
        System.out.println("addCoin");
        VendingMachine instance0 = new VendingMachine();
        float initialAmount0 = instance0.getCurrentAmount();
        VendingMachine instance1 = new VendingMachine();
        float initialAmount1 = instance1.getCurrentAmount();
        VendingMachine instance2 = new VendingMachine();
        float initialAmount2 = instance2.getCurrentAmount();

        // THEN
        instance0.addCoin(0.0F);
        instance1.addCoin(0.5F);
        instance2.addCoin(-0.5F);

        // EXPECT
        assertEquals(instance0.getCurrentAmount(), 0.0F + initialAmount0);
        assertEquals(instance1.getCurrentAmount(), 0.5F + initialAmount1);
        assertEquals(instance2.getCurrentAmount(), initialAmount2);
    }

    /**
     * Test of checkAmount method, of class VendingMachine. return the actual
     * change
     */
    @org.junit.Test
    public void testCheckAmount() {
        // GIVEN
        System.out.println("checkAmount");
        VendingMachine instance1 = new VendingMachine();
        VendingMachine instance2 = new VendingMachine();
        instance1.setCurrentAmount(5F);
        instance2.setCurrentAmount(3F);

        // THEN
        float result1 = instance1.checkAmount(1.0F);
        float result2 = instance2.checkAmount(1.5F);

        // EXPECT
        assertEquals(result1, instance1.getCurrentAmount() - 1F);
        assertEquals(result2, instance2.getCurrentAmount() - 1.5F);
    }

    /**
     * Test of removeWumpas method, of class VendingMachine.
     */
    @org.junit.Test
    public void testRemoveWumpas() {
        // GIVEN
        System.out.println("removeWumpas");
        VendingMachine instance = new VendingMachine();
        VendingMachine instance1 = new VendingMachine();
        instance.chargeMachine(2, 0);

        // THEN
        boolean result0 = instance.removeWumpas();
        boolean result1 = instance1.removeWumpas();

        // EXPECT
        assertEquals(true, result0);
        assertEquals(false, result1);
    }

    /**
     * Test of removePlumbus method, of class VendingMachine.
     */
    @org.junit.Test
    public void testRemovePlumbus() {
        // GIVEN
        System.out.println("removePlumbus");
        VendingMachine instance = new VendingMachine();
        VendingMachine instance1 = new VendingMachine();
        instance.chargeMachine(0, 2);

        // THEN
        boolean result0 = instance.removePlumbus();
        boolean result1 = instance1.removePlumbus();

        // EXPECT
        assertEquals(true, result0);
        assertEquals(false, result1);
    }

}
