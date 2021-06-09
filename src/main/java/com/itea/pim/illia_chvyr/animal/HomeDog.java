package com.itea.pim.illia_chvyr.animal;

public class HomeDog extends DogFamily {
    @Override
    protected void move() {
        super.move();
    }

    @Override
    protected void eat() {
        System.out.println("home dogs eat dry balancing meal");
    }

    @Override
    protected void sleeping() {
        System.out.println("home dogs sleep with humans");
    }

    @Override
    protected void hunt() {
        System.out.println("home dogs hunt for birds");
    }

    protected void securityServe() {
        System.out.println("home dogs are used for protecting humans");
    }


}
