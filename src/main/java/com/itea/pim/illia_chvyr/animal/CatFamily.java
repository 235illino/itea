package com.itea.pim.illia_chvyr.animal;

public class CatFamily extends Predator {
    @Override
    protected void move() {
        System.out.println("cats are digitigrade");
    }

    @Override
    protected void eat() {
        System.out.println("cats eat little meal portion");
    }

    @Override
    protected void sleeping() {
        System.out.println("cats sleep 60-80% of their life");
    }

    @Override
    protected void hunt() {
        System.out.println("cats use hunting for provide meal");
    }

    protected void play() {
        System.out.println("cats can play");
    }
}
