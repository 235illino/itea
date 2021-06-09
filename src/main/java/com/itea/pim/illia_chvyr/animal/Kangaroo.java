package com.itea.pim.illia_chvyr.animal;

public class Kangaroo extends Marsupials {
    @Override
    protected void move() {
        System.out.println("Kangaroo jump!");
    }

    @Override
    protected void eat() {
        System.out.println("Kangaroo eat fruits, nuts and corn");
    }

    @Override
    protected void sleeping() {
        System.out.println("Kangaroo is daytime sleeping");
    }

    @Override
    protected void haveBag() {
        System.out.println("Kangaroo born their child not formed that why they carry child in bag");
    }

    protected void inhabitingArea() {
        System.out.println("Native land for kangaroo is Australia");
    }
}
