package by.tc.task01.dao.impl.builder;

import by.tc.task01.entity.VacuumCleaner;

public class VacuumCleanerBuilder extends ApplianceBuilder {
    private final String lineWithParameters;


    public VacuumCleanerBuilder(String lineWithParameters) {
        this.lineWithParameters = lineWithParameters;
    }

    @Override
    public VacuumCleaner build() {
        String[] parameters = findParameters(lineWithParameters);
        String manufacturer = parameters[9];
        double price = Double.parseDouble(parameters[10]);
        int powerConsumption = Integer.parseInt(parameters[0]);
        int weight = Integer.parseInt(parameters[1]);
        double height = Double.parseDouble(parameters[2]);
        double width = Double.parseDouble(parameters[3]);
        VacuumCleaner vacuumCleaner = new VacuumCleaner(manufacturer, price, powerConsumption, weight, height, width);

        vacuumCleaner.setFilterType(parameters[4]);
        vacuumCleaner.setBagType(parameters[5]);
        vacuumCleaner.setWandType(parameters[6]);
        vacuumCleaner.setMotorSpeedRegulation(Integer.parseInt(parameters[7]));
        vacuumCleaner.setCleaningWidth(Integer.parseInt(parameters[8]));
        return vacuumCleaner;
    }
}