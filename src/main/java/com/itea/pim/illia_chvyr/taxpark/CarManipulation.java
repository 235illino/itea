package com.itea.pim.illia_chvyr.taxpark;

import java.util.List;

public interface CarManipulation {
    double TaxParkValue(List<TaxPark> taxies);
    List<TaxPark> carSortGasConsumption(List<TaxPark> taxies);
    void findCar(int carValue, int gasConsumption, Category category);
}
