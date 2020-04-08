package com.kodilla.testing.testing;

import com.kodilla.testing.testing.calculator.Calculator;
import com.kodilla.testing.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Calculator test");

        Calculator calculator = new Calculator();
        Integer addTest = calculator.add(5,5);
        Integer subTest = calculator.substract(10,5);

        if (addTest.equals(10) && subTest.equals(5)){
            System.out.println("Test Passed");
        }else{
            System.out.println("Error");
        }
    }
}