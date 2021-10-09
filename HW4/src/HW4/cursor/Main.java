package HW4.cursor;

import HW4.Shape2D.Circle;
import HW4.Shape2D.Rectangle;
import HW4.Shape2D.Triangle;
import HW4.Shape3D.Cuboid;
import HW4.Shape3D.Sphere;
import HW4.Shape3D.SquarePyramid;

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



