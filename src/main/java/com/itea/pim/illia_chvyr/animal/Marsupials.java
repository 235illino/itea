package com.itea.pim.illia_chvyr.animal;

public class Marsupials extends Animal {
    @Override
    protected void move() {
        System.out.println("marsupials can be biped");
    }

    @Override
    protected void eat() {
        System.out.println("marsupials are rawtarian");
    }

    @Override
    protected void sleeping() {
        System.out.println("marsupials sleep up to 22 hours per day");
    }

    protected void haveBag() {
        System.out.println("marsupials have bag for bearing a child");
    }
}
