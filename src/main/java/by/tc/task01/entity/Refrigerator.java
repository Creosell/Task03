package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Locale;

public class Refrigerator extends Appliance {
    private double freezerCapacity;
    private double overallCapacity;

    public void setFreezerCapacity(double freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    @Override
    public String toString() {
        return String.format(Locale.ENGLISH,
                "%s : [%s=%d, %s=%s, %s=%.1f, %s=%.1f, %s=%.1f, %s=%.1f, %s=%s, %s=%.1f]",
                this.getClass().getSimpleName(),
                SearchCriteria.Refrigerator.POWER_CONSUMPTION, getPowerConsumption(),
                SearchCriteria.Refrigerator.WEIGHT, getWeight(),
                SearchCriteria.Refrigerator.FREEZER_CAPACITY, freezerCapacity,
                SearchCriteria.Refrigerator.OVERALL_CAPACITY, overallCapacity,
                SearchCriteria.Refrigerator.HEIGHT, getHeight(),
                SearchCriteria.Refrigerator.WIDTH, getWidth(),
                SearchCriteria.Refrigerator.MANUFACTURER, getManufacturer(),
                SearchCriteria.Refrigerator.PRICE, getPrice());
    }
}
