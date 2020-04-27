package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTest{

    @Test
    public void getAverage(){

        //Given
        int[] table = {5, 5, 5, 5};

        //When
        double output = ArrayOperations.getAverage(table);
        double expected = 5.0;

        //Then
        Assert.assertEquals(expected, output, 0);


    }
}