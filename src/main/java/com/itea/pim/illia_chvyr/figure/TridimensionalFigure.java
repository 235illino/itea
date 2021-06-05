package com.itea.pim.illia_chvyr.figure;

public class TridimensionalFigure extends Shape {

    private String nameShape = "TridimensionalFigure";


    public TridimensionalFigure(float x, float y) {
        super(x, y);
    }

    public void info() {
        System.out.println("Shape :" + nameShape);
    }
}
