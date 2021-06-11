package com.itea.pim.illia_chvyr.taxpark;

public class Luxury extends TaxPark {


    public Luxury(String model, int carValue, int gasConsumption, Category category) {
        super(model, carValue, gasConsumption, category);
        coefOfValueTrip = 1.3;
    }

    @Override
    void infoCategory() {
        System.out.println(this.category + " is VIP service");

    }


}
