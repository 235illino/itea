package com.itea.pim.illia_chvyr.animal;

public class HomeCat extends CatFamily {
    @Override
    protected void move() {
        super.move();
    }

    @Override
    protected void eat() {
        System.out.println("home cat eat preserves");
    }

    @Override
    protected void sleeping() {
        System.out.println("home cat sleep at nighttime as well with humans");
    }

    @Override
    protected void hunt() {
        System.out.println("home cat hunt only for fun");
    }

    @Override
    protected void play() {
        System.out.println("home cat are lazy and don't want playing");
    }
}
