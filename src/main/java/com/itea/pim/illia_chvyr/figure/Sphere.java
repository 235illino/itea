package com.itea.pim.illia_chvyr.figure;

public class Sphere extends TridimensionalFigure {

    private String nameShape = "Sphere";

    float z;

    public Sphere(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public void info() {
        System.out.println("Shape :" + nameShape);
    }
}
