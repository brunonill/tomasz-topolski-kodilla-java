package com.kodilla.testing.testing.shape;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import java.lang.reflect.Method;

public class ShapeCollectorTestSuite{

    @BeforeClass

    static public void showTEstCases(){
        ShapeCollectorTestSuite shapeCollectorTestSuite = new ShapeCollectorTestSuite();
        Method[] testCase = shapeCollectorTestSuite.getClass().getDeclaredMethods();
        for (int i = 2; i < testCase.length; i++){
            System.out.println("Test Cases " + "[" + (i - 1) + "]" + " >>>>>" + testCase[i].getName());
        }
    }

    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shapeCollectorTest = new ShapeCollector();
        Shape shapeTest = new Circle(2);
        shapeCollectorTest.addFigure(shapeTest);
        //When
        int output = shapeCollectorTest.getShapes().size();

        //Then
        int expected = 1;
        Assert.assertEquals(expected, output);

    }

    @Test
    public void testAddFigureDuplicated() throws Exception{
        //        Given
        ShapeCollector shapeCollectorTest = new ShapeCollector();
        shapeCollectorTest.addFigure(new Circle(2));
        shapeCollectorTest.addFigure(new Circle(2));
        //        When
        int output = shapeCollectorTest.getShapes().size();

        //        Then
        int expected = 2;
        Assert.assertEquals(expected,output);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddFigureNull(){
        ShapeCollector shapeCollectorTest = new ShapeCollector();
        shapeCollectorTest.addFigure(null);
    }

    @Test
    public void testRemoveFigureObjectExist() throws Exception{
        //        Given
        ShapeCollector shapeCollectorTest = new ShapeCollector();
        Shape figureToRemove = new Circle(2);
        shapeCollectorTest.addFigure(figureToRemove);
        //        When
        shapeCollectorTest.removeFigure(figureToRemove);
        int input = shapeCollectorTest.getShapes().size();

        //        Then
        int expected = 0;
        Assert.assertEquals(expected, input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveFigureObjectNotExist() throws Exception{
        //        Given
        ShapeCollector shapeCollectorTest = new ShapeCollector();
        Shape figureToRemove = new Circle(2);
        //        When
        shapeCollectorTest.removeFigure(figureToRemove);
        //        Then
        //expected Exception

    }

    @Test
    public void testRemoveFigureIndex(){
        //        Given
        ShapeCollector shapeCollectorTest = new ShapeCollector();
        Shape figureToRemove = new Circle(2);
        shapeCollectorTest.addFigure(figureToRemove);
        int expected = 0;
        //        When
        shapeCollectorTest.removeFigure(0);
        //        Then
        Assert.assertEquals(expected, shapeCollectorTest.getShapes().size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveFigureException(){
        //        Given
        ShapeCollector shapeCollectorTest = new ShapeCollector();
        //        When
        shapeCollectorTest.removeFigure(10);
        //        Then
    }

    @Test
    public void testGetFiguresShow() throws Exception{
        //        Given
        ShapeCollector shapeCollectorTest = new ShapeCollector();
        Shape one = new Circle(3);
        Shape two = new Square(3);

        //        When
        shapeCollectorTest.addFigure(one);
        shapeCollectorTest.addFigure(two);

        //        Then
        String expected = one + "" + two;
        Assert.assertEquals(expected, shapeCollectorTest.showFigures());
    }

    @Test
    public void testGetFigureException() throws Exception{
        //        Given
        ShapeCollector shapeCollectorTest = new ShapeCollector();
        //shapeCollectorTest.addFigure(new Circle(2));
        //        When
        Assert.assertNull(shapeCollectorTest.getFigure(0));
        //        Then
    }

    @Test
    public void testGetFigure() throws Exception{
        //        Given
        ShapeCollector shapeCollectorTest = new ShapeCollector();
        shapeCollectorTest.addFigure(new Circle(2));
        //        When
        Shape expected = shapeCollectorTest.getFigure(0);
        //        Then
        Assert.assertEquals(expected, shapeCollectorTest.getFigure(0));
    }
}