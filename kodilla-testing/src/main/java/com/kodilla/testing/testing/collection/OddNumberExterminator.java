package com.kodilla.testing.testing.collection;

import java.util.ArrayList;

public class OddNumberExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> number) {

        ArrayList<Integer> result = new ArrayList<>();
        if (number == null) {
            return null;
        } else {
            for (Integer integer : number) {
                if (integer % 2 != 0) {
                    result.add(integer);
                }
            }
        }
        return result;
    }
}
