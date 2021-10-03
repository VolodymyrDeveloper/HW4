package Shape2D;

import com.cursor.Vertices;

import java.util.List;

public class Triangle extends PlaneShape {

    public Triangle(Vertices vertices1, Vertices vertices2, Vertices vertices3) {
        addVertices(vertices1);
        addVertices(vertices2);
        addVertices(vertices3);
    }

    @Override
    public double getArea() {
        List<Vertices> vertices = getVertices();
        double segmentA = calculateSegmentLength2D(vertices.get(0), vertices.get(1));
        double segmentB = calculateSegmentLength2D(vertices.get(1), vertices.get(2));
        return 0.5 * (segmentA + segmentB);
    }

    @Override
    public double getPerimeter() {
        List<Vertices> vertices = getVertices();
        double segmentA = calculateSegmentLength2D(vertices.get(0), vertices.get(1));
        double segmentB = calculateSegmentLength2D(vertices.get(1), vertices.get(2));
        double segmentC = calculateSegmentLength2D(vertices.get(2), vertices.get(0));

        return segmentA + segmentB + segmentC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                vertices +
                "\nArea= " + getArea() +
                "; \nPerimeter= " + getPerimeter() +
                ";" + '}';
    }
}
