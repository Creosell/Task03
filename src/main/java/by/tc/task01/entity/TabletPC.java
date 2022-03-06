package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TabletPC extends Appliance {
    private final String batteryCapacity;
    private final String displayInches;
    private final String memoryRom;
    private final String flashMemoryCapacity;
    private final String color;

    public TabletPC(String batteryCapacity, String displayInches, String memoryRom, String flashMemoryCapacity, String color) {
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    @Override
    public Map<String, String> getParametersMap() {
        Map<String, String> map = new LinkedHashMap<>();

        map.put(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString(), batteryCapacity);
        map.put(SearchCriteria.TabletPC.DISPLAY_INCHES.toString(), displayInches);
        map.put(SearchCriteria.TabletPC.MEMORY_ROM.toString(), memoryRom);
        map.put(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString(), flashMemoryCapacity);
        map.put(SearchCriteria.TabletPC.COLOR.toString(), color);
        return map;
    }
}
