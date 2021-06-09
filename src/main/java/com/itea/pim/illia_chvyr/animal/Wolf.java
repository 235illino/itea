package com.itea.pim.illia_chvyr.animal;

public class Wolf extends DogFamily {
    @Override
    protected void move() {
        super.move();
    }

    @Override
    protected void eat() {
        System.out.println("wolfs eat  hoofed animals");
    }

    @Override
    protected void sleeping() {
        System.out.println("wolf are daytime sleeping animal");
    }

    @Override
    protected void hunt() {
        System.out.println("hunting is wolf's lifestyle");
    }
}
