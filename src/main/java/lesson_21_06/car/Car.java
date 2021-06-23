package lesson_21_06.car;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Car {
    private String model;
    private String brand;
    private int yearOfManufacture;
    private double volume;

    public Car(String model, String brand, int yearOfManufacture) {
        this.model = model;
        this.brand = brand;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", volume=" + volume +
                '}';
    }

    public static void main(String[] args) {
        Car car1 = new Car("X", "Tesla", 2010);
        Car car2 = new Car("X5", "BMW", 2015);
        Car car3 = new Car("A8", "Audi", 2013);
        Car car4 = new Car("Megane", "renault", 2007);

        List<Car> cars = new ArrayList<>() {{
            add(car1);
            add(car2);
            add(car3);
            add(car4);
        }};
        cars.sort(new CarSortYear());
        System.out.println(cars);

        car1.setVolume(1.5);
        car2.setVolume(0.0);
        car3.setVolume(3.6);
        car4.setVolume(0.5);

        TreeSet<Car> carsTree = new TreeSet<Car>(new CarSortVolume());
        carsTree.add(car1);
        carsTree.add(car2);
        carsTree.add(car3);
        carsTree.add(car4);
        System.out.println(cars);

    }
}
