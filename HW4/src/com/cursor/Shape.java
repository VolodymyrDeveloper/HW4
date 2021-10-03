package com.cursor;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape {

    protected List<Vertices> vertices = new ArrayList<>();

    protected double calculateSegmentLength2D(Vertices vertices1, Vertices vertices2) {
        return Math.sqrt(Math.pow(vertices1.getX() - vertices2.getX(), 2) + Math.pow(vertices1.getY() - vertices2.getY(), 2));
    }

    protected double calculateSegmentLength3D(Vertices vertices1, Vertices vertices2) {
        return Math.sqrt(Math.pow(vertices1.getX() - vertices2.getX(), 2) + Math.pow(vertices1.getY() - vertices2.getY(), 2) + Math.pow(vertices1.getZ() - vertices2.getZ(), 2));
    }

    protected void addVertices(Vertices vertices1) {
        vertices.add(vertices1);
    }

    public List<Vertices> getVertices() {
        return vertices;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "vertices=" + vertices +
                '}';
    }
}

