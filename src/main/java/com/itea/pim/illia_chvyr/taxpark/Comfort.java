package com.itea.pim.illia_chvyr.taxpark;

public class Comfort extends TaxPark {


    public Comfort(String model, int carValue, int gasConsumption, Category category) {
        super(model, carValue, gasConsumption, category);
        coefOfValueTrip = 1.1;
    }

    @Override
    void infoCategory() {
        System.out.println(this.category + " is category for comfortable trip");

    }


}
