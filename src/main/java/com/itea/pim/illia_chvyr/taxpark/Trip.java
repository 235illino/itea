package com.itea.pim.illia_chvyr.taxpark;

public class Trip {
    private static final double VALUEPERKM = 5.0;

    public double tripValue(TaxPark tax, double distance) {
        return (tax.coefOfValueTrip*VALUEPERKM) * distance;
    }


}
