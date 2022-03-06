package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class VacuumCleaner extends Appliance {
    private final String powerConsumption;
    private final String filterType;
    private final String bagType;
    private final String wandType;
    private final String motorSpeedRegulation;
    private final String cleaningWidth;

    public VacuumCleaner(String powerConsumption, String filterType, String bagType, String wandType, String motorSpeedRegulation, String cleaningWidth) {
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public Map<String, String> getParametersMap() {
        Map<String, String> map = new LinkedHashMap<>();

        map.put(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString(), powerConsumption);
        map.put(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString(), filterType);
        map.put(SearchCriteria.VacuumCleaner.BAG_TYPE.toString(), bagType);
        map.put(SearchCriteria.VacuumCleaner.WAND_TYPE.toString(), wandType);
        map.put(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString(), motorSpeedRegulation);
        map.put(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString(), cleaningWidth);
        return map;
    }
}
