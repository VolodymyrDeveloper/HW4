package Shape2D;

import com.cursor.Vertices;

public class Circle extends PlaneShape {
    private double radius;

    @Override
    public String toString() {
        return "Circle{" +
                "\nradius=" + radius +
                vertices +
                "\nArea= " + getArea() +
                "; \nPerimeter= " + getPerimeter() +
                ";" + '}';
    }

    public Circle(Vertices vertices, double radius) {
        addVertices(vertices);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
