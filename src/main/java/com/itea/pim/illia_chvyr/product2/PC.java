package com.itea.pim.illia_chvyr.product2;

public class PC extends Computer {
    @Override
    protected void showCategory() {
        System.out.println("computer - PC");
    }

    @Override
    protected void usability() {
        System.out.println("personal PC");
    }
}
