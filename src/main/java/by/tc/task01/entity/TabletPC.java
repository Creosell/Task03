package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Locale;

public class TabletPC implements Appliance {
    private int batteryCapacity;
    private double displayInches;
    private int memoryRom;
    private int flashMemoryCapacity;
    private String color;


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
        return String.format(Locale.ENGLISH, "%s : [%s=%d, %s=%s, %s=%d, %s=%d, %s=%s]",
                this.getClass().getSimpleName(),
                SearchCriteria.TabletPC.BATTERY_CAPACITY, batteryCapacity,
                SearchCriteria.TabletPC.DISPLAY_INCHES, displayInches,
                SearchCriteria.TabletPC.MEMORY_ROM, memoryRom,
                SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY, flashMemoryCapacity,
                SearchCriteria.TabletPC.COLOR, color);
    }
}
