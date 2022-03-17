package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Locale;

public class Oven extends Appliance {
    private int capacity;
    private int depth;

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    @Override
    public String toString() {
        return String.format(Locale.ENGLISH,
                "%s : [%s=%d, %s=%s, %s=%d, %s=%d, %s=%.1f, %s=%.1f, %s=%s, %s=%.1f]",
                this.getClass().getSimpleName(),
                SearchCriteria.Oven.POWER_CONSUMPTION, getPowerConsumption(),
                SearchCriteria.Oven.WEIGHT, getWeight(),
                SearchCriteria.Oven.CAPACITY, capacity,
                SearchCriteria.Oven.DEPTH, depth,
                SearchCriteria.Oven.HEIGHT, getHeight(),
                SearchCriteria.Oven.WIDTH, getWidth(),
                SearchCriteria.Oven.MANUFACTURER, getManufacturer(),
                SearchCriteria.Oven.PRICE, getPrice());
    }
}
