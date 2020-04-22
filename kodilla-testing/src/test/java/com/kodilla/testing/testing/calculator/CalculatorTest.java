package com.kodilla.testing.testing.calculator;


import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test

    public void testCalulator () {
        //Given
        Calculator calculator = new Calculator();

        //When
        int addtest = calculator.add(30, 30);

        //Then
        Assert.assertEquals(60,addtest);


    }

}