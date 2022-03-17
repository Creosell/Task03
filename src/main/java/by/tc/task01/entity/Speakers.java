package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Locale;

public class Speakers extends Appliance {
    private int powerConsumption;
    private int numberOfSpeakers;
    private String frequencyRange;
    private double cordLength;

    public Speakers() {
        super("Unnamed", 0);
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public String toString() {
        return String.format(Locale.ENGLISH, "%s : [%s=%d, %s=%s, %s=%s, %s=%.1f, %s=%s, %s=%.1f]",
                this.getClass().getSimpleName(),
                SearchCriteria.Speakers.POWER_CONSUMPTION, powerConsumption,
                SearchCriteria.Speakers.NUMBER_OF_SPEAKERS, numberOfSpeakers,
                SearchCriteria.Speakers.FREQUENCY_RANGE, frequencyRange,
                SearchCriteria.Speakers.CORD_LENGTH, cordLength,
                SearchCriteria.Appliance.MANUFACTURER, getManufacturer(),
                SearchCriteria.Appliance.PRICE, getPrice());
    }
}
