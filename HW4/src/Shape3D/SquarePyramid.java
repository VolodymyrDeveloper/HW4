package Shape3D;

import com.cursor.Vertices;

import java.util.List;

public class SquarePyramid extends SpaceShape {
    private double baseWidth;
    private double pyramidHeight;

    public SquarePyramid(Vertices verticesH, double baseWidth, double pyramidHeight) {
        addVertices(verticesH);
        Vertices verticesА = new Vertices(verticesH.getX() - (0.5 * baseWidth), verticesH.getY() - (0.5 * baseWidth), verticesH.getZ());
        addVertices(verticesА);
        Vertices verticesD = new Vertices(verticesА.getX(), verticesА.getY() + baseWidth, verticesА.getZ());
        addVertices(verticesD);
        Vertices verticesC = new Vertices(verticesD.getX() + baseWidth, verticesD.getY(), verticesD.getZ());
        addVertices(verticesC);
        Vertices verticesB = new Vertices(verticesC.getX(), verticesC.getY() - baseWidth, verticesC.getY());
        addVertices(verticesB);
        Vertices verticesS = new Vertices(verticesH.getX(), verticesH.getY(), verticesH.getZ() + pyramidHeight);
        addVertices(verticesS);

        this.baseWidth = baseWidth;
        this.pyramidHeight = pyramidHeight;
    }

    @Override
    public double getArea() {
        List<Vertices> verticesList = getVertices();
        Vertices verticesН = verticesList.get(0);
        Vertices verticesA = verticesList.get(1);
        Vertices verticesD = verticesList.get(2);
        Vertices verticesC = verticesList.get(3);
        Vertices verticesB = verticesList.get(4);
        Vertices verticesS = verticesList.get(5);

        double segmentAD = calculateSegmentLength3D(verticesA, verticesD);
        double segmentDC = calculateSegmentLength3D(verticesD, verticesC);
        double segmentCB = calculateSegmentLength3D(verticesC, verticesB);
        double segmentBA = calculateSegmentLength3D(verticesB, verticesA);
        double perimetrBasePiramid = (baseWidth * 4);
        double apofema = Math.sqrt((Math.pow(pyramidHeight, 2)) + Math.pow((baseWidth / 2), 2));
        double areaBase = segmentAD * segmentDC;
        double areaSidePiramide = 0.5 * perimetrBasePiramid * apofema;

        return areaBase + areaSidePiramide;
    }

    @Override
    public double getVolume() {

        return baseWidth * baseWidth * pyramidHeight * 1 / 3;
    }

    @Override
    public String toString() {
        return "SquarePyramid{\n" +
                "baseWidth=" + baseWidth +
                ", pyramidHeight=" + pyramidHeight +
                vertices +
                "\nArea= " + getArea() +
                "; \nVolume= " + getVolume() +
                ";" + '}';

    }
}
