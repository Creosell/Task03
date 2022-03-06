package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Refrigerator extends Appliance {
    private final String powerConsumption;
    private final String weight;
    private final String freezerCapacity;
    private final String overallCapacity;
    private final String height;
    private final String width;

    public Refrigerator(String powerConsumption, String weight, String freezerCapacity, String overallCapacity, String height, String width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
    }

    @Override
    public Map<String, String> getParametersMap() {
        Map<String, String> map = new LinkedHashMap<>();

        map.put(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString(), powerConsumption);
        map.put(SearchCriteria.Refrigerator.WEIGHT.toString(), weight);
        map.put(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString(), freezerCapacity);
        map.put(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString(), overallCapacity);
        map.put(SearchCriteria.Refrigerator.HEIGHT.toString(), height);
        map.put(SearchCriteria.Refrigerator.WIDTH.toString(), width);
        return map;
    }
}
