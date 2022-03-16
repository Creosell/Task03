package by.tc.task01.dao.impl;

import by.tc.task01.entity.Oven;

 class OvenBuilder extends ApplianceBuilder {
    @Override
    Oven build(String line) {
        Oven oven = new Oven();
        String[] parameters = findParameters(line);

        oven.setPowerConsumption(Integer.parseInt(parameters[0]));
        oven.setWeight(Integer.parseInt(parameters[1]));
        oven.setCapacity(Integer.parseInt(parameters[2]));
        oven.setDepth(Integer.parseInt(parameters[3]));
        oven.setHeight(Double.parseDouble(parameters[4]));
        oven.setWidth(Double.parseDouble(parameters[5]));
        return oven;
    }
}
