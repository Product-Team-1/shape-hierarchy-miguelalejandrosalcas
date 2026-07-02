package com.example.project;
import java.util.ArrayList;

public class ShapeHierarchy {
    public static void main(String[] args) {
        // TODO: create a list/array of shapes and print each area (polymorphism)
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Triangle(5, 6));
        shapes.add(new Rectangle(5, 9));

        for (int i = 0; i < shapes.size(); i++) {
            System.out.println(shapes.get(i).getArea());
        }
    }
}
