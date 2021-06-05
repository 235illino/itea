package com.itea.pim.illia_chvyr.figure;

public class Trapeze extends PlaneFigure {

    private String nameShape = "Trapeze";

    public Trapeze(float x, float y, float width, float height) {
        super(x, y, width, height);
    }

    public Trapeze(Trapeze p){

        this(p.x, p.y, p.width, p.height);
    }
    public void info() {
        System.out.println("Shape :" + nameShape);
    }
}
