package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

import java.util.List;

public class PrintApplianceInfo {

    public static void print(List<Appliance> appliance) {
        if (!appliance.isEmpty()) {
            for (Appliance entity : appliance) {
                System.out.println(entity.toString());
            }
            System.out.println();
        } else {
            System.out.println("Results are not found");
        }
    }
}
