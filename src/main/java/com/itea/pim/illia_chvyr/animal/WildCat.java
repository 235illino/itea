package com.itea.pim.illia_chvyr.animal;

public class WildCat extends CatFamily {
    @Override
    protected void move() {
        super.move();
    }

    @Override
    protected void eat() {
        System.out.println("wild cats eat their victims");
    }

    @Override
    protected void sleeping() {
        System.out.println("wild cats sleep a lot to provide stamina for hunting");
    }

    @Override
    protected void hunt() {
        System.out.println("hunting for wild cats is a way for surviving");
    }

    @Override
    protected void play() {
        System.out.println("plaing in childhood with their brothers and sisters");
    }
}
