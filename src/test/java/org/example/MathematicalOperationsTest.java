package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathematicalOperationsTest {

    @Test
    public void testSubtraction(){
        int result = MathematicalOperations.subtraction(20, 10);
        assertEquals(10, result, "La sottrazione 20 - 10 dovrebbe ridare 10");
    }

    @Test
    public void testSubtraction2(){
        int result = MathematicalOperations.subtraction(25, 10);
        assertEquals(15, result, "La sottrazione 25 - 10 dovrebbe ridare 15");
    }

    @Test
    public void testMultiplication(){
        int result = MathematicalOperations.multiplication(5, 5);
        assertEquals(25, result, "La moltiplicazione 5 * 5 dovrebbe ridare 25");
    }

    @Test
    public void testMultiplication2(){
        int result = MathematicalOperations.multiplication(3, 3);
        assertEquals(9, result, "La moltiplicazione 3 * 3 dovrebbe ridare 9");
    }
}