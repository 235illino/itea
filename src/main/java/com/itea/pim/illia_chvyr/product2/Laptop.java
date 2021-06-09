package com.itea.pim.illia_chvyr.product2;

public class Laptop extends Computer {
    @Override
    protected void showCategory() {
        System.out.println("computer - Laptop");
    }

    @Override
    protected void usability() {
        System.out.println("personal laptop");
    }
}
