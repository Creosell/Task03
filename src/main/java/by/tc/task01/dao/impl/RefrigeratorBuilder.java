package by.tc.task01.dao.impl;

import by.tc.task01.entity.Refrigerator;

public class RefrigeratorBuilder extends ApplianceBuilder {
    @Override
    Refrigerator build(String line) {
        Refrigerator refrigerator = new Refrigerator();
        String[] parameters = findParameters(line);

        refrigerator.setPowerConsumption(Integer.parseInt(parameters[0]));
        refrigerator.setWeight(Integer.parseInt(parameters[1]));
        refrigerator.setFreezerCapacity(Double.parseDouble(parameters[2]));
        refrigerator.setOverallCapacity(Double.parseDouble(parameters[3]));
        refrigerator.setHeight(Double.parseDouble(parameters[4]));
        refrigerator.setWidth(Double.parseDouble(parameters[5]));
        refrigerator.setManufacturer(parameters[6]);
        refrigerator.setPrice(Double.parseDouble(parameters[7]));
        return refrigerator;
    }
}
