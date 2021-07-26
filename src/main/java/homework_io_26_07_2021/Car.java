package homework_io_26_07_2021;

public class Car {
    private String brand;
    private String model;
    private String colour;
    private SpeedMax speedMax;
    private Engine engine;
    private int seatingCapacity;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public SpeedMax getSpeedMax() {
        return speedMax;
    }

    public void setSpeedMax(SpeedMax speedMax) {
        this.speedMax = speedMax;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", speedMax=" + speedMax +
                ", engine=" + engine +
                ", seatingCapacity=" + seatingCapacity +
                '}';
    }
}
