package by.tc.task01.dao.impl.builder;

import by.tc.task01.entity.Laptop;

public class LaptopBuilder extends ApplianceBuilder {
    private final String lineWithParameters;

    public LaptopBuilder(String lineWithParameters) {
        this.lineWithParameters = lineWithParameters;
    }


    @Override
    public Laptop build() {
        String[] parameters = findParameters(lineWithParameters);
        String manufacturer = parameters[6];
        double price = Double.parseDouble(parameters[7]);
        double batteryCapacity = Double.parseDouble(parameters[0]);
        int memoryRom = Integer.parseInt(parameters[2]);
        double displayInches = Double.parseDouble(parameters[5]);
        Laptop laptop = new Laptop(manufacturer, price, batteryCapacity, memoryRom, displayInches);

        if (parameters[1] != null && parameters[3] != null && parameters[4] != null) {
            laptop.setOs(parameters[1]);
            laptop.setSystemMemory(Integer.parseInt(parameters[3]));
            laptop.setCpu(Double.parseDouble(parameters[4]));
        }

        return laptop;
    }
}
