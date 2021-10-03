package com.cursor;

public class Vertices {

    private double x;
    private double y;
    private double z;

    public Vertices(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vertices(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "\nVertices{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
