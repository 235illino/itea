package com.itea.pim.illia_chvyr.taxpark;

public class Budget extends TaxPark {


    public Budget(String model, int carValue, int gasConsumption, Category category) {
        super(model, carValue, gasConsumption, category);
        coefOfValueTrip = 1.0;
    }

    @Override
    void infoCategory() {
        System.out.println(this.category + " is category for cheap and quick trips");

    }
}
