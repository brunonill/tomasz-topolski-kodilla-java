package com.kodilla.testing.testing.shape;

import java.util.ArrayList;

public class ShapeCollector{
    private ArrayList<Shape> shapes = new ArrayList<>();

    ArrayList<Shape> getShapes(){
        return shapes;
    }

    void addFigure(Shape shape){
        if (shape == null){
            throw new IllegalArgumentException("Shape is null");
        }else{
            shapes.add(shape);
        }
    }

    void removeFigure(Shape shapeRemove){
        //   shapes.removeIf(shape -> shape == shapeRtemove);

        if (!shapes.remove(shapeRemove)){
            throw new IllegalArgumentException(shapeRemove + " Not Exist On The List");
        }else{
            shapes.remove(shapeRemove);
        }
    }

    //  shapes.removeIf(shape -> shape == shapeRtemove);

    void removeFigure(int x){
        if (x > shapes.size()){
            throw new IndexOutOfBoundsException("Figure in " + x + " index" + "not exist");
        }
        shapes.remove(x);
    }

    Shape getFigure(int n){

        Shape result = null;
        for (int i = 0; i < shapes.size(); i++){
            if (i == n){
                result = shapes.get(i);
            }else{
                throw new IndexOutOfBoundsException("0" + "-" + shapes.size());
            }
        }

        return result;
    }

    String showFigures(){

        String result = "";
        for (Shape shape : shapes){
            result += shape + "";
        }
        return result;
    }

}
