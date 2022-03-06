package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Laptop extends Appliance {
    private final String batteryCapacity;
    private final String os;
    private final String memoryRom;
    private final String systemMemory;
    private final String cpu;
    private final String displayInchs;

    public Laptop(String batteryCapacity, String os, String memoryRom, String systemMemory, String cpu, String displayInchs) {
        this.batteryCapacity = batteryCapacity;
        this.os = os;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInchs = displayInchs;
    }


    @Override
    public Map<String, String> getParametersMap() {
        Map<String, String> map = new LinkedHashMap<>();

        map.put(SearchCriteria.Laptop.BATTERY_CAPACITY.toString(), batteryCapacity);
        map.put(SearchCriteria.Laptop.OS.toString(), os);
        map.put(SearchCriteria.Laptop.MEMORY_ROM.toString(), memoryRom);
        map.put(SearchCriteria.Laptop.SYSTEM_MEMORY.toString(), systemMemory);
        map.put(SearchCriteria.Laptop.CPU.toString(), cpu);
        map.put(SearchCriteria.Laptop.DISPLAY_INCHS.toString(), displayInchs);
        return map;
    }
}
