package by.tc.task01.dao.impl.builder;

import by.tc.task01.entity.Refrigerator;

public class RefrigeratorBuilder extends ProductBuilder {
    private final String lineWithParameters;

    public RefrigeratorBuilder(final String lineWithParameters) {
        this.lineWithParameters = lineWithParameters;
    }

    @Override
    public Refrigerator build() {
        String[] parameters = findParameters(lineWithParameters);
        String manufacturer = parameters[6];
        double price = Double.parseDouble(parameters[7]);
        int powerConsumption = Integer.parseInt(parameters[0]);
        int weight = Integer.parseInt(parameters[1]);
        double height = Double.parseDouble(parameters[4]);
        double width = Double.parseDouble(parameters[5]);
        Refrigerator refrigerator = new Refrigerator(manufacturer, price, powerConsumption, weight, height, width);

        if (parameters[2] != null && parameters[3] != null) {
            refrigerator.setFreezerCapacity(Double.parseDouble(parameters[2]));
            refrigerator.setOverallCapacity(Double.parseDouble(parameters[3]));
        }

        return refrigerator;
    }
}
