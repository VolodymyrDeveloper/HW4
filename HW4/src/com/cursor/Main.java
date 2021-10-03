package com.cursor;

import Shape2D.Circle;
import Shape2D.Rectangle;
import Shape2D.Triangle;
import Shape3D.Cuboid;
import Shape3D.Sphere;
import Shape3D.SquarePyramid;

public class Main {

    public static void main(String[] args) {
        Shape[] Shape = new Shape[6];
        Shape[0] = new Rectangle(5, 5, new Vertices(1, 1));
        Shape[1] = new Triangle(new Vertices(0, 1), new Vertices(3, 8), new Vertices(1, 12));
        Shape[2] = new Circle(new Vertices(1, 1), 1);
        Shape[3] = new SquarePyramid(new Vertices(0, 0, 0), 5, 5);
        Shape[4] = new Cuboid(new Vertices(0, 0, 0), 10, 12, 5);
        Shape[5] = new Sphere(new Vertices(1, 1, 1), 5);
        for (Shape i : Shape) {
            System.out.println(i + "\n");
        }
    }
}



