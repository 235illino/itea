package com.itea.pim.illia_chvyr.taxpark;

import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        TaxPark audiTax = new Luxury("Audi A8", 10000,10,Category.Lux);
        TaxPark lexusTax = new Luxury("Lexus RX", 15000,20,Category.Lux);
        TaxPark toyotaTax = new Comfort("Camry", 6000,8,Category.Comfort);
        TaxPark bmwTax = new Comfort("X3", 5000,9,Category.Comfort);
        TaxPark renaultTax = new Budget("Megan", 3000,10,Category.X);
        TaxPark fiatTax = new Budget("Punto", 3500,6,Category.X);
        TaxPark sprinterTax = new Shuttles("Sprinter Mersedes", 35000,19,Category.Bus);
        TaxPark.taxies.forEach(s -> System.out.println(s.getModel()));

        Accountancy accountancy = new Accountancy();
        System.out.println(accountancy.TaxParkValue(TaxPark.taxies));

        List<TaxPark> list = accountancy.carSortGasConsumption(TaxPark.taxies);
        list.forEach(s -> System.out.println(s.getGasConsumption()));
        accountancy.findCar(6000, 8, Category.Comfort);

    }
}
