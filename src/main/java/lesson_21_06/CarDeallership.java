package lesson_21_06;

import java.util.List;

public class CarDeallership {
    private List<Car> cars;
    private String name;

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void testDrive(Car car) {
        car.drive();
    }
}
