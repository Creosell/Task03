package by.tc.task01.dao.impl.builder;

import by.tc.task01.entity.Oven;

public class OvenBuilder extends ProductBuilder {
    private final String lineWithParameters;

    public OvenBuilder(final String lineWithParameters) {
        this.lineWithParameters = lineWithParameters;
    }

    @Override
    public Oven build() {
        String[] parameters = findParameters(lineWithParameters);
        String manufacturer = parameters[6];
        double price = Double.parseDouble(parameters[7]);
        int powerConsumption = Integer.parseInt(parameters[0]);
        int weight = Integer.parseInt(parameters[1]);
        double height = Double.parseDouble(parameters[4]);
        double width = Double.parseDouble(parameters[5]);
        Oven oven = new Oven(manufacturer, price, powerConsumption, weight, height, width);

        if (parameters[2] != null && parameters[3] != null) {
            oven.setCapacity(Integer.parseInt(parameters[2]));
            oven.setDepth(Integer.parseInt(parameters[3]));
        }

        return oven;
    }
}
