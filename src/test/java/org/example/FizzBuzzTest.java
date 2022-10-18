package org.example;

import junit.framework.TestCase;

public class FizzBuzzTest extends TestCase {

    FizzBuzz fizzBuzz = new FizzBuzz();

    void demoTestMethod() {
        assertTrue(true);
    }

    public void testIsFiz(){

        System.err.println(fizzBuzz.calculate(3));

        assertTrue(fizzBuzz.calculate(3).contains("Fizz"));
        assertTrue(fizzBuzz.calculate(3).equals("Fizz"));
        assertEquals(fizzBuzz.calculate(3),"Fizz");
    }

    public void testIsBuz(){
        assertTrue(fizzBuzz.calculate(5).contains("Buzz"));
        assertTrue(fizzBuzz.calculate(5).equals("Buzz"));
        assertEquals(fizzBuzz.calculate(5),"Buzz");
    }

    public void testIsFixBuz(){
        assertTrue(fizzBuzz.calculate(15).contains("FizzBuzz"));
        assertEquals(fizzBuzz.calculate(15),"FizzBuzz");
    }

    public void testIfProperNumber(){

        assertTrue(fizzBuzz.calculate(16).contains("16"));

    }





}