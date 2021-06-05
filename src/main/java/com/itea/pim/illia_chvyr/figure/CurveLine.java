package com.itea.pim.illia_chvyr.figure;

public class CurveLine extends Line {

    private String nameShape = "CurveLine";

    public CurveLine(float x, float y) {
        super(x, y);
    }

    public CurveLine(CurveLine l) {
        this(l.x, l.y);
    }

    public void info() {
        System.out.println("Shape :" + nameShape);
    }
}
