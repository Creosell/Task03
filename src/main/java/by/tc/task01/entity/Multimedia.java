package by.tc.task01.entity;

public abstract class Multimedia extends Product {
    private String frequencyRange;

    public Multimedia(String manufacturer, double price, String frequencyRange) {
        super(manufacturer, price);
        this.frequencyRange = frequencyRange;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }
}
