package com.itea.pim.illia_chvyr.product2;

public class Phone extends Category {
    @Override
    protected void showCategory() {
        System.out.println("phones");
    }

    @Override
    protected void usability() {
        System.out.println("making calling");
    }
}
