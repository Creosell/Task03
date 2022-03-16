package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Locale;

public class Laptop implements Appliance {
    private double batteryCapacity;
    private String os;
    private int memoryRom;
    private int systemMemory;
    private double cpu;
    private double displayInches;

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    @Override
    public String toString() {
        return String.format(Locale.ENGLISH, "%s : [%s=%.1f, %s=%s, %s=%d, %s=%d, %s=%.1f, %s=%.1f]",
                this.getClass().getSimpleName(),
                SearchCriteria.Laptop.BATTERY_CAPACITY, batteryCapacity,
                SearchCriteria.Laptop.OS, os,
                SearchCriteria.Laptop.MEMORY_ROM, memoryRom,
                SearchCriteria.Laptop.SYSTEM_MEMORY, systemMemory,
                SearchCriteria.Laptop.CPU, cpu,
                SearchCriteria.Laptop.DISPLAY_INCHES, displayInches);
    }
}
