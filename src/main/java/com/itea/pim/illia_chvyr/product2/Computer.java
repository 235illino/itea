package com.itea.pim.illia_chvyr.product2;

public class Computer extends Category {
    @Override
    protected void showCategory() {
        System.out.println("computers");
    }

    @Override
    protected void usability() {
        System.out.println("coding");
    }
}
