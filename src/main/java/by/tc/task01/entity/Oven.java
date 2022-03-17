package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Locale;

public class Oven extends Appliance {
    private int powerConsumption;
    private int weight;
    private int capacity;
    private int depth;
    private double height;
    private double width;

    public Oven() {
        super("Unknown", 0);
    }


    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return String.format(Locale.ENGLISH,
                "%s : [%s=%d, %s=%s, %s=%d, %s=%d, %s=%.1f, %s=%.1f, %s=%s, %s=%.1f]",
                this.getClass().getSimpleName(),
                SearchCriteria.Oven.POWER_CONSUMPTION, powerConsumption,
                SearchCriteria.Oven.WEIGHT, weight,
                SearchCriteria.Oven.CAPACITY, capacity,
                SearchCriteria.Oven.DEPTH, depth,
                SearchCriteria.Oven.HEIGHT, height,
                SearchCriteria.Oven.WIDTH, width,
                SearchCriteria.Appliance.MANUFACTURER, getManufacturer(),
                SearchCriteria.Appliance.PRICE, getPrice());
    }
}
