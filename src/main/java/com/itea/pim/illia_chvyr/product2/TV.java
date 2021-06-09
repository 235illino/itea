package com.itea.pim.illia_chvyr.product2;

public class TV extends Category {
    @Override
    protected void showCategory() {
        System.out.println("TV");
    }

    @Override
    protected void usability() {
        System.out.println("watching movies");

    }
}
