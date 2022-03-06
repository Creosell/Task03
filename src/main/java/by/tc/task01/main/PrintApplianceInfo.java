package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

import java.util.List;
import java.util.Map;

public class PrintApplianceInfo {

    public static void print(List<Appliance> appliance) {
        if (!appliance.isEmpty()) {
            StringBuilder builder = new StringBuilder();
            for (Appliance entity : appliance) {
                builder.append(entity.getClass().getSimpleName()).append(": ");
                for (Map.Entry<String, String> parameters : entity.getParametersMap().entrySet()) {
                    builder.append(parameters.getKey()).append("=").append(parameters.getValue()).append(", ");
                }
                builder.setLength(builder.length() - 2);
                builder.append("\n");
            }
            System.out.println(builder);
        } else {
            System.out.println("Results are not found");
        }
    }

    // you may add your own code here
}
