package by.tc.task01.entity;

import java.util.Objects;

public abstract class ComputerElectronics extends Product {
    private double batteryCapacity;
    private int memoryRom;
    private double displayInches;

    public ComputerElectronics() {
    }

    public ComputerElectronics(String manufacturer, double price, double batteryCapacity, int memoryRom, double displayInches) {
        super(manufacturer, price);
        this.batteryCapacity = batteryCapacity;
        this.memoryRom = memoryRom;
        this.displayInches = displayInches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComputerElectronics that = (ComputerElectronics) o;
        return Double.compare(that.getBatteryCapacity(), getBatteryCapacity()) == 0 && getMemoryRom() == that.getMemoryRom() && Double.compare(that.getDisplayInches(), getDisplayInches()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBatteryCapacity(), getMemoryRom(), getDisplayInches());
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }
}
