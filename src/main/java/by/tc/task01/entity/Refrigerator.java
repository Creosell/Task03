package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Locale;

public class Refrigerator extends Appliance {
    private int powerConsumption;
    private int weight;
    private double freezerCapacity;
    private double overallCapacity;
    private double height;
    private double width;

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFreezerCapacity(double freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
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
                "%s : [%s=%d, %s=%s, %s=%.1f, %s=%.1f, %s=%.1f, %s=%.1f, %s=%s, %s=%.1f]",
                this.getClass().getSimpleName(),
                SearchCriteria.Refrigerator.POWER_CONSUMPTION, powerConsumption,
                SearchCriteria.Refrigerator.WEIGHT, weight,
                SearchCriteria.Refrigerator.FREEZER_CAPACITY, freezerCapacity,
                SearchCriteria.Refrigerator.OVERALL_CAPACITY, overallCapacity,
                SearchCriteria.Refrigerator.HEIGHT, height,
                SearchCriteria.Refrigerator.WIDTH, width,
                SearchCriteria.Appliance.MANUFACTURER, getManufacturer(),
                SearchCriteria.Appliance.PRICE, getPrice());
    }
}
