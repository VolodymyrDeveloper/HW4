package HW4.Shape2D;

import HW4.cursor.Vertices;

import java.util.List;

public class Rectangle extends PlaneShape {

    private double width;
    private double height;


    @Override
    public String toString() {
        return "Rectangle\n{" +
                "width=" + width +
                ", height=" + height +
                vertices +
                "\nArea= " + getArea() +
                "; \nPerimeter= " + getPerimeter() +
                ";" + '}';
    }

    public Rectangle(double width, double height, Vertices verticesA) {
        this.width = width;
        this.height = height;
        addVertices(verticesA);
        Vertices verticesB = new Vertices(verticesA.getX(), verticesA.getY() + height);
        addVertices(verticesB);
        Vertices verticesC = new Vertices(verticesB.getX() + width, verticesB.getY());
        addVertices(verticesC);
        Vertices verticesD = new Vertices(verticesC.getX(), verticesC.getY() - height);
        addVertices(verticesD);
    }


    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        List<Vertices> verticesList = getVertices();
        Vertices verticesA = verticesList.get(0);
        Vertices verticesB = verticesList.get(1);
        Vertices verticesC = verticesList.get(2);
        Vertices verticesD = verticesList.get(3);
        double segmentA = calculateSegmentLength2D(verticesA, verticesB);
        double segmentB = calculateSegmentLength2D(verticesB, verticesC);
        double segmentC = calculateSegmentLength2D(verticesC, verticesD);
        double segmentD = calculateSegmentLength2D(verticesD, verticesA);
        return segmentA + segmentB + segmentC + segmentD;
    }


}

