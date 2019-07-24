package com.notearena.mathutils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import com.notearena.mathutils.Calculator;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * ---------------------------------|
 * Originally from notearena.com    |
 * Written by MMAK Sourav           |
 * ---------------------------------|
 * Unit test for simple App.
 * Test for equality, true
 * Test for proper Exception checking
 * Test odering/numbering
 */
@TestMethodOrder(OrderAnnotation.class)
class CalculatorTest {
	
	static Calculator calculator;
    
    @BeforeAll
    static void initialSetup(){
        System.out.println("inside @BeforeAll");
       // calculator = new Calculator(); // should not instantiate in @BeforeAll, every test should use fresh new object
    }
     
    @BeforeEach
    void setupEachTest(){
        System.out.println("inside @BeforeEach");
        calculator = new Calculator(); // every test should use fresh new object as it can hold data from previous object
    }
     
    @Test
    void testAddition() {
        System.out.println("inside testTrueFalse()");
        assertEquals(3, calculator.addNumbers(1, 2), 
				"addNumbers method should return summation of the numbers");
    }
     
    @Test
    void testSubtrction() {
        System.out.println("inside testEquality() ");
        assertEquals(0, calculator.subtractNumbers(1, 1), 
				"addNumbers method should return subtraction of the numbers");
    }
    
    @Test
    void testDivision() {
        System.out.println("inside testEquality() ");
        assertEquals(2, calculator.divideNumber(2, 1), 
				"divideNumber method should return proper division result");
    }
    
    @Test
    void testException() {
        System.out.println("inside testEquality() ");
        assertThrows(ArithmeticException.class, () -> calculator.divideNumber(2, 0), "should return ArithmeticException");
    }
    
    
    @Test
    void testMultiplication() {
        System.out.println("inside testEquality() ");
        assertEquals(4, calculator.multiplyNumbers(2, 2), 
				"multiplyNumbers method should return multiplication of the numbers");
    }
     
    @Test
    void testSqaure() {
        System.out.println("inside testEquality() ");
        assertEquals(4, calculator.getSquare(2), 
				"multiplyNumbers method should return square of the number");
    }
    
    @Test
    @Order(1)
    void testTotalAmoutMethod() {
        System.out.println("inside testEquality() ");
        assertEquals(120, calculator.getTotalAmout(10), 
				"getTotalAmout method should return total valid amout");
    }
    
    @Test
    void testAmoutMethod() {
        System.out.println("inside testEquality() ");
        assertEquals(1000, calculator.getAmout(10), 
				"multiplyNumbers method should return valid amout");
    }
    
    @Test
    void testMatchNumber() {
        System.out.println("inside testEquality() ");
        assertTrue(calculator.matchNumber(10), 
				"should return true if the value matched");
    }
    
    @AfterEach
    void tearThis(){
    	// clean-up code
        System.out.println("inside @AfterEach");
    }
     
    @AfterAll
    static void tear(){
        System.out.println("inside @AfterAll");
    }
}