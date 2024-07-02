package web.model;

public class Car {
    private String brand;
    private String modelName;
    private int price;

    public Car(String brand, String modelName, int price) {
        this.brand = brand;
        this.modelName = modelName;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
