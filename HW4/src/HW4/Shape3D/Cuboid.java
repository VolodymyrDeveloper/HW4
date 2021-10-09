package HW4.Shape3D;

import HW4.cursor.Vertices;

public class Cuboid extends SpaceShape {
    private double width;
    private double height;
    private double depht;

    public Cuboid(Vertices verticesA, double width, double height, double depht) {
        addVertices(verticesA);
        Vertices verticesВ = new Vertices(verticesA.getX(), verticesA.getY() + depht, verticesA.getZ());
        addVertices(verticesВ);
        Vertices verticesC = new Vertices(verticesВ.getX() + width, verticesВ.getY(), verticesA.getZ());
        addVertices(verticesC);
        Vertices verticesD = new Vertices(verticesC.getX(), verticesC.getY() - depht, verticesA.getZ());
        addVertices(verticesD);
        Vertices verticesA1 = new Vertices(verticesA.getX(), verticesA.getY(), verticesA.getZ() + height);
        addVertices(verticesA1);
        Vertices verticesВ1 = new Vertices(verticesВ.getX(), verticesA.getY(), verticesВ.getZ() + height);
        addVertices(verticesВ1);
        Vertices verticesC1 = new Vertices(verticesC.getX(), verticesC.getY(), verticesC.getZ() + height);
        addVertices(verticesC1);
        Vertices verticesD1 = new Vertices(verticesD.getX(), verticesD.getY(), verticesD.getZ() + height);
        addVertices(verticesD1);
        this.width = width;
        this.height = height;
        this.depht = depht;
    }

    @Override
    public double getArea() {
        return ((height * width) + (height * depht) + (width * depht)) * 2;
    }

    @Override
    public double getVolume() {

        return height * depht * width;
    }

    @Override
    public String toString() {
        return "Cuboid\n{" +
                "width=" + width +
                ", height=" + height +
                ", depht=" + depht +
                vertices +
                "\nArea= " + getArea() +
                "; \nVolume= " + getVolume() +
                ";" + '}';

    }
}
