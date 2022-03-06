package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.LinkedHashMap;
import java.util.Map;

public class Oven extends Appliance {
    private final String powerConsumption;
    private final String weight;
    private final String capacity;
    private final String depth;
    private final String height;
    private final String width;

    public Oven(String powerConsumption, String weight, String capacity, String depth, String height, String width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    @Override
    public Map<String, String> getParametersMap() {
        Map<String, String> map = new LinkedHashMap<>();

        map.put(SearchCriteria.Oven.POWER_CONSUMPTION.toString(), powerConsumption);
        map.put(SearchCriteria.Oven.WEIGHT.toString(), weight);
        map.put(SearchCriteria.Oven.CAPACITY.toString(), capacity);
        map.put(SearchCriteria.Oven.DEPTH.toString(), depth);
        map.put(SearchCriteria.Oven.HEIGHT.toString(), height);
        map.put(SearchCriteria.Oven.WIDTH.toString(), width);
        return map;
    }
}
