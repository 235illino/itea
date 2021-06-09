package com.itea.pim.illia_chvyr.animal;

public class Predator extends Animal {
    @Override
    protected void move() {
        System.out.println("predator moving with four limbs");
    }

    @Override
    protected void eat() {
        System.out.println("predator eat meat");
    }

    @Override
    protected void sleeping() {
        System.out.println("predator daytime sleaping animal");
    }

    protected void hunt() {
        System.out.println("predator hunting");
    }
}
