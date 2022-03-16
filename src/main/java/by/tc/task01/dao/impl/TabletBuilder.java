package by.tc.task01.dao.impl;

import by.tc.task01.entity.TabletPC;

public class TabletBuilder extends ApplianceBuilder {
    @Override
    TabletPC build(String line) {
        TabletPC tabletPC = new TabletPC();
        String[] parameters = findParameters(line);

        tabletPC.setBatteryCapacity(Integer.parseInt(parameters[0]));
        tabletPC.setDisplayInches(Double.parseDouble(parameters[1]));
        tabletPC.setMemoryRom(Integer.parseInt(parameters[2]));
        tabletPC.setFlashMemoryCapacity(Integer.parseInt(parameters[3]));
        tabletPC.setColor(parameters[4]);
        return tabletPC;
    }
}
