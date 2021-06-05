package com.itea.pim.illia_chvyr.figure;

public class Parallelogram extends PlaneFigure {
    private String nameShape = "Parallelogram";

    public Parallelogram(float x, float y, float width, float height) {
        super(x, y, width, height);
    }

    public Parallelogram(Parallelogram p){

        this(p.x, p.y, p.width, p.height);
    }
    public void info() {
        System.out.println("Shape :" + nameShape);
    }
}
