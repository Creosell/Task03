package by.tc.task01.entity;

public abstract class ComputerElectronics extends Product {
    private double batteryCapacity;
    private int memoryRom;
    private double displayInches;

    public ComputerElectronics(String manufacturer, double price, double batteryCapacity, int memoryRom, double displayInches) {
        super(manufacturer, price);
        this.batteryCapacity = batteryCapacity;
        this.memoryRom = memoryRom;
        this.displayInches = displayInches;
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
