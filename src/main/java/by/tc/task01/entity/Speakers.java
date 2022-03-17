package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Locale;

public class Speakers extends Multimedia {
    private int powerOutput;
    private int numberOfSpeakers;
    private double cordLength;

    public void setPowerOutput(int powerOutput) {
        this.powerOutput = powerOutput;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public String toString() {
        return String.format(Locale.ENGLISH,
                "%s : [%s=%d, %s=%s, %s=%s, %s=%.1f, %s=%s, %s=%.1f]",
                this.getClass().getSimpleName(),
                SearchCriteria.Speakers.POWER_OUTPUT, powerOutput,
                SearchCriteria.Speakers.NUMBER_OF_SPEAKERS, numberOfSpeakers,
                SearchCriteria.Speakers.FREQUENCY_RANGE, getFrequencyRange(),
                SearchCriteria.Speakers.CORD_LENGTH, cordLength,
                SearchCriteria.Speakers.MANUFACTURER, getManufacturer(),
                SearchCriteria.Speakers.PRICE, getPrice());
    }
}
