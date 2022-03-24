package by.tc.task01.entity;

import java.io.Serializable;
import java.util.Locale;
import java.util.Objects;

public class Oven extends Appliance implements Serializable {
    private int capacity;
    private int depth;

    public Oven() {
    }

    public Oven(String manufacturer, double price, int powerConsumption, int weight, double height, double width) {
        super(manufacturer, price, powerConsumption, weight, height, width);
    }

    public Oven(String manufacturer, double price, int powerConsumption, int weight, double height, double width, int capacity, int depth) {
        super(manufacturer, price, powerConsumption, weight, height, width);
        this.capacity = capacity;
        this.depth = depth;
    }

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
                "POWER_CONSUMPTION", getPowerConsumption(),
                "WEIGHT", getWeight(),
                "CAPACITY", capacity,
                "DEPTH", depth,
                "HEIGHT", getHeight(),
                "WIDTH", getWidth(),
                "MANUFACTURER", getManufacturer(),
                "PRICE", getPrice());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oven oven = (Oven) o;
        return capacity == oven.capacity && depth == oven.depth;
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacity, depth);
    }
}
