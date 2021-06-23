package lesson_21_06.car;

import java.util.Comparator;

public class CarSortVolume implements Comparator<Car> {
    @Override
    public int compare(Car left, Car right) {
        int i = Double.compare(left.getVolume(), right.getVolume());
        if (i == 0) {
            return i = -1;
        }
        return i;
    }
}
