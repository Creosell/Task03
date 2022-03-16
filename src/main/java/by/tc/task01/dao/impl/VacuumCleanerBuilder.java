package by.tc.task01.dao.impl;

import by.tc.task01.entity.VacuumCleaner;

public class VacuumCleanerBuilder extends ApplianceBuilder {
    @Override
    VacuumCleaner build(String line) {
        VacuumCleaner vacuumCleaner = new VacuumCleaner();
        String[] parameters = findParameters(line);

        vacuumCleaner.setPowerConsumption(Integer.parseInt(parameters[0]));
        vacuumCleaner.setFilterType(parameters[1]);
        vacuumCleaner.setBagType(parameters[2]);
        vacuumCleaner.setWandType(parameters[3]);
        vacuumCleaner.setMotorSpeedRegulation(Integer.parseInt(parameters[4]));
        vacuumCleaner.setCleaningWidth(Integer.parseInt(parameters[5]));
        return vacuumCleaner;
    }
}
