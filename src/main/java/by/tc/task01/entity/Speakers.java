package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Speakers extends Appliance {
    private final String powerConsumption;
    private final String numberOfSpeakers;
    private final String frequencyRange;
    private final String cordLength;

    public Speakers(String powerConsumption, String numberOfSpeakers, String frequencyRange, String cordLength) {
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    @Override
    public Map<String, String> getParametersMap() {
        Map<String, String> map = new LinkedHashMap<>();

        map.put(SearchCriteria.Speakers.POWER_CONSUMPTION.toString(), powerConsumption);
        map.put(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString(), numberOfSpeakers);
        map.put(SearchCriteria.Speakers.FREQUENCY_RANGE.toString(), frequencyRange);
        map.put(SearchCriteria.Speakers.CORD_LENGTH.toString(), cordLength);
        return map;
    }
}
