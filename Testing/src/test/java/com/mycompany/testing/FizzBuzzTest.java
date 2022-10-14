/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.testing;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author pferna12
 */
public class FizzBuzzTest {

    public FizzBuzzTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of check method, of class FizzBuzz.
     */
    @Test
    public void testCheck() {
        // Check Fizz
        assertEquals("Fizz", FizzBuzz.check(3));
        assertEquals("Fizz", FizzBuzz.check(-3));

        // Check Buzz
        assertEquals("Buzz", FizzBuzz.check(5));
        assertEquals("Buzz", FizzBuzz.check(-5));

        // Check FizzBuzz
        assertEquals("FizzBuzz", FizzBuzz.check(15));
        assertEquals("FizzBuzz", FizzBuzz.check(0));
        assertEquals("FizzBuzz", FizzBuzz.check(-15));
    }

}
