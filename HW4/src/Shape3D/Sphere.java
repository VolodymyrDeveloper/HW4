package Shape3D;

import com.cursor.Vertices;

public class Sphere extends SpaceShape {
    private double radius;

    public Sphere(Vertices vertices, double radius) {
        addVertices(vertices);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return 4 / 3d * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Sphere{" +
                vertices +
                ",\nradius=" + radius +
                "\nArea= " + getArea() +
                "; \nVolume= " + getVolume() +
                ";" + '}';
    }
}
