package by.tc.task01.dao.impl;

import by.tc.task01.entity.Laptop;

public class LaptopBuilder extends ApplianceBuilder {
    @Override
    Laptop build(String line) {
        Laptop laptop = new Laptop();
        String[] parameters = findParameters(line);

        laptop.setBatteryCapacity(Double.parseDouble(parameters[0]));
        laptop.setOs(parameters[1]);
        laptop.setMemoryRom(Integer.parseInt(parameters[2]));
        laptop.setSystemMemory(Integer.parseInt(parameters[3]));
        laptop.setCpu(Double.parseDouble(parameters[4]));
        laptop.setDisplayInches(Double.parseDouble(parameters[5]));
        laptop.setManufacturer(parameters[6]);
        laptop.setPrice(Double.parseDouble(parameters[7]));
        return laptop;
    }
}
