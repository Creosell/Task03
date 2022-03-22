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
        String manufacturer = parameters[6];
        double price = Double.parseDouble(parameters[7]);
        int powerConsumption = Integer.parseInt(parameters[0]);
        int weight = Integer.parseInt(parameters[1]);
        double height = Double.parseDouble(parameters[2]);
        double width = Double.parseDouble(parameters[3]);
        VacuumCleaner vacuumCleaner = new VacuumCleaner(manufacturer, price, powerConsumption, weight, height, width);

        vacuumCleaner.setPowerConsumption(Integer.parseInt(parameters[0]));
        vacuumCleaner.setFilterType(parameters[1]);
        vacuumCleaner.setBagType(parameters[2]);
        vacuumCleaner.setWandType(parameters[3]);
        vacuumCleaner.setMotorSpeedRegulation(Integer.parseInt(parameters[4]));
        vacuumCleaner.setCleaningWidth(Integer.parseInt(parameters[5]));
        vacuumCleaner.setManufacturer(parameters[6]);
        vacuumCleaner.setPrice(Double.parseDouble(parameters[7]));
        return vacuumCleaner;
    }
}
