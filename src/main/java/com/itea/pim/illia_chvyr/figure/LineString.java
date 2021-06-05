package com.itea.pim.illia_chvyr.figure;

public class LineString extends Line {

    private String nameShape = "LineString";
    public LineString(float x, float y) {
        super(x, y);
    }

    public LineString(LineString l) {
        this(l.x, l.y);
    }
    public void info() {
        System.out.println("Shape :" + nameShape);
    }
}
