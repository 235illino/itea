package lesson_21_06.car;

import java.util.Comparator;

public class CarSortYear implements Comparator<Car> {
    @Override
    public int compare(Car left, Car right) {
        return Integer.compare(left.getYearOfManufacture(), right.getYearOfManufacture());
    }
}
