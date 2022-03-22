package by.tc.task01.entity;

public abstract class Appliance extends Product {
    private int powerConsumption;
    private int weight;
    private double height;
    private double width;

    public Appliance(String manufacturer, double price, int powerConsumption, int weight, double height, double width) {
        super(manufacturer, price);
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.height = height;
        this.width = width;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
