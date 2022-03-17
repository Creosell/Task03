package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Locale;

public class Laptop extends ComputerElectronics {
    private String os;
    private int systemMemory;
    private double cpu;

    public void setOs(String os) {
        this.os = os;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return String.format(Locale.ENGLISH,
                "%s : [%s=%.1f, %s=%s, %s=%d, %s=%d, %s=%.1f, %s=%.1f, %s=%s, %s=%.1f]",
                this.getClass().getSimpleName(),
                SearchCriteria.Laptop.BATTERY_CAPACITY, getBatteryCapacity(),
                SearchCriteria.Laptop.OS, os,
                SearchCriteria.Laptop.MEMORY_ROM, getMemoryRom(),
                SearchCriteria.Laptop.SYSTEM_MEMORY, systemMemory,
                SearchCriteria.Laptop.CPU, cpu,
                SearchCriteria.Laptop.DISPLAY_INCHES, getDisplayInches(),
                SearchCriteria.Laptop.MANUFACTURER, getManufacturer(),
                SearchCriteria.Laptop.PRICE, getPrice());
    }
}
