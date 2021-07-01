package lesson4.vehicle;

import java.util.ArrayList;
import java.util.List;

public class Garage<T extends Vehicle> {
    List<T> transport = new ArrayList();

    public T get(int i) {
        return transport.get(i);
    }

    public void add(T t) {
        transport.add(t);
    }

    public List<T> getByType(Class<T> t) {
        List<T> transport = new ArrayList();
         return null;
    }

    public static void main(String[] args) {
        Garage<Vehicle> garage = new Garage<>();
        Vehicle car = new Car();
        List list = garage.getByType(Vehicle.class);
    }
}
