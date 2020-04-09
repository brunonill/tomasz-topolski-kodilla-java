package com.kodilla.testing.testing.collection;

import org.junit.*;

import java.lang.reflect.Method;

import java.util.ArrayList;


public class CollectionTestSuite {

    static OddNumberExterminator oddNumberExterminator = new OddNumberExterminator();
    static Method[] methodNametoTest = new OddNumberExterminator() {
    }
            .getClass()
            .getMethods();


    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }


    @BeforeClass

    public static void startTest() {

        CollectionTestSuite collectionTestSuite = new CollectionTestSuite();
        Method[] testCase = collectionTestSuite.getClass().getMethods();
        System.out.println("Test Cases method >>>>>" + methodNametoTest[0].getName() + " Class >>> " + oddNumberExterminator.getClass().getSimpleName());

        System.out.println("Test Case [1]" + testCase[4].getName());
        System.out.println("Test Case [2]" + testCase[3].getName());

    }

    @After

    public void after() {
        System.out.println("Test End");

    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {

        //Given
        ArrayList<Integer> input = new ArrayList<>();
        //When
        ArrayList<Integer> output = oddNumberExterminator.exterminate(input);
        ArrayList<Integer> expected = new ArrayList<>();
        //Then
        Assert.assertEquals(expected, output);

    }

    @Test
    public void testOddNumberExterminatorNormalList() {
            //Given
        ArrayList<Integer> input = new ArrayList<>();
        input.add(2);
        input.add(5);
        input.add(11);
        input.add(12);

            //When
        ArrayList<Integer> expectedOutput = new ArrayList<>();
        expectedOutput.add(5);
        expectedOutput.add(11);
        oddNumberExterminator.exterminate(input);
            //Then
        Assert.assertEquals(expectedOutput, oddNumberExterminator.exterminate(input));


    }
}
