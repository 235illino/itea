package com.itea.pim.illia_chvyr.taxpark;

public class Shuttles extends TaxPark {


    public Shuttles(String model, int carValue, int gasConsumption, Category category) {
        super(model, carValue, gasConsumption, category);
        coefOfValueTrip = 3.0;
    }

    @Override
    void infoCategory() {
        System.out.println(this.category + " is category for big company");
    }
}
