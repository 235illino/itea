package com.itea.pim.illia_chvyr.figure;

public class Line extends Shape {

    private String nameShape = "Line";

    public Line(float x, float y) {
        super(x, y);
    }

    public Line(Line l) {
        this(l.x, l.y);
    }

    public void info() {
        System.out.println("Shape :" + nameShape);
    }
}
