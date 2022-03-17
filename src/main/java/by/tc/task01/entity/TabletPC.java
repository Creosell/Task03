package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Locale;

public class TabletPC extends Appliance {
    private int batteryCapacity;
    private double displayInches;
    private int memoryRom;
    private int flashMemoryCapacity;
    private String color;

    public TabletPC() {
        super("Unnamed", 0);
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format(Locale.ENGLISH,
                "%s : [%s=%d, %s=%s, %s=%d, %s=%d, %s=%s, %s=%s, %s=%.1f]",
                this.getClass().getSimpleName(),
                SearchCriteria.TabletPC.BATTERY_CAPACITY, batteryCapacity,
                SearchCriteria.TabletPC.DISPLAY_INCHES, displayInches,
                SearchCriteria.TabletPC.MEMORY_ROM, memoryRom,
                SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY, flashMemoryCapacity,
                SearchCriteria.TabletPC.COLOR, color,
                SearchCriteria.Appliance.MANUFACTURER, getManufacturer(),
                SearchCriteria.Appliance.PRICE, getPrice());
    }
}
