package com.itea.pim.illia_chvyr.taxpark;

import java.util.Comparator;
import java.util.List;

public class Accountancy implements CarManipulation {


    @Override
    public double TaxParkValue(List<TaxPark> taxies) {
        double sum = 0;
        for (TaxPark t : taxies) {
            sum += t.getCarValue();
        }
        return sum;
    }

    @Override
    public List<TaxPark> carSortGasConsumption(List<TaxPark> taxies) {
        taxies.sort(Comparator.comparingDouble(TaxPark::getGasConsumption));
        return taxies;
    }

    @Override
    public void findCar(int carValue, int gasConsumption, Category category) {
        for (TaxPark t : TaxPark.taxies) {
            if (t.getCarValue() == carValue && t.getGasConsumption() == gasConsumption && t.category.equals(category)) {
                System.out.println("Finded Car is " + t.getModel());
            }
        }

    }
}
