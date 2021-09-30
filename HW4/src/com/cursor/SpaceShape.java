package com.cursor;

public class SpaceShape extends Shape implements AreaMeasurable,VolumeMeasurable {

    public double vertex3D(double x, double y, double z) {
        return 0;
    }


    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getVolume() {
        return 0;
    }
}
