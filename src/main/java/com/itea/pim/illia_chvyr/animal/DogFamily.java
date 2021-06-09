package com.itea.pim.illia_chvyr.animal;

public class DogFamily extends Predator {
    @Override
    protected void move() {
        System.out.println("dogs are digitigrade");
    }

    @Override
    protected void eat() {
        System.out.println("dogs eat big meal portion");
    }

    @Override
    protected void sleeping() {
        System.out.println("dogs sleep 50% of their life");
    }

    @Override
    protected void hunt() {
        System.out.println("dogs use hunting for provide meal");
    }
}
