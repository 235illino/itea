package product;

public class Tv extends Product {
    private String brand;
    private String model;
    private String category;
    private double price;
    private int id;


    public Tv(int id) {
        this.id = id;
    }

    public Tv(int id, String brand) {
        this.id = id;
        this.brand = brand;

    }

    public Tv(int id, String brand, String category) {
        this.id = id;
        this.brand = brand;
        this.category = category;

    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

}
