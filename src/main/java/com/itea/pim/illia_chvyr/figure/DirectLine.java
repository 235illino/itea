package com.itea.pim.illia_chvyr.figure;

public class DirectLine extends Line {

    private String nameShape = "DirectLine";

    public DirectLine(float x, float y) {
        super(x, y);
    }

    public DirectLine(DirectLine l) {
        this(l.x, l.y);
    }

    public void info() {
        System.out.println("Shape :" + nameShape);
    }
}
