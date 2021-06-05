package com.itea.pim.illia_chvyr.figure;

public class PlaneFigure extends Shape {

    private String nameShape = "PlaneFigure";

    float width;
    float height;


    public PlaneFigure(float x, float y, float width, float height){

        super(x,y);
        this.width = width;
        this.height = height;
    }

    public PlaneFigure(PlaneFigure p){

        this(p.x, p.y, p.width, p.height);
    }

    public void info() {
        System.out.println("Shape :" + nameShape);
    }
}
