package com.itea.pim.illia_chvyr.taxpark;

import java.util.ArrayList;
import java.util.List;

public abstract class TaxPark {
    static List<TaxPark> taxies = new ArrayList<>();
    double coefOfValueTrip;
    private double carValue;
    private double gasConsumption;
    Category category;
    String model;


    public TaxPark(String model, int carValue, int gasConsumption, Category category) {
        this.model = model;
        this.carValue = carValue;
        this.gasConsumption = gasConsumption;
        this.category = category;
        taxies.add(this);
    }

    void infoCategory() {
        System.out.println(this.category);
    }

    public double getGasConsumption() {
        return gasConsumption;
    }



    public double getCarValue() {
        return carValue;
    }

    public String getModel() {
        return model;
    }
}
