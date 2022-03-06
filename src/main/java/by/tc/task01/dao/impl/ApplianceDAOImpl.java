package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ApplianceDAOImpl implements ApplianceDAO {

    @Override
    public List<Appliance> find(Criteria criteria) {
        List<Appliance> applianceList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/appliances_db.txt"))) {
            int numberOfCriteria = criteria.getCriteria().size();
            int counter;

            while (reader.ready()) {
                String line = reader.readLine();
                counter = 0;

                if (line.matches(criteria.getGroupSearchName() + ".+")) {
                    for (Map.Entry<String, Object> entry : criteria.getCriteria().entrySet()) {
                        if (line.matches(".+" + entry.getKey() + "=" + entry.getValue().toString().toLowerCase() + "(|(,.+))")) {
                            counter++;
                        }
                        if (counter == numberOfCriteria) {
                            applianceList.add(createObject(line, criteria.getGroupSearchName()));
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return applianceList;
    }

    private Appliance createObject(String line, String className) {
        String[] parameters = findParameters(line);

        switch (className) {
            case "Laptop":
                return new Laptop(parameters[0], parameters[1], parameters[2], parameters[3], parameters[4], parameters[5]);
            case "Oven":
                return new Oven(parameters[0], parameters[1], parameters[2], parameters[3], parameters[4], parameters[5]);
            case "Refrigerator":
                return new Refrigerator(parameters[0], parameters[1], parameters[2], parameters[3], parameters[4], parameters[5]);
            case "Speakers":
                return new Speakers(parameters[0], parameters[1], parameters[2], parameters[3]);
            case "TabletPC":
                return new TabletPC(parameters[0], parameters[1], parameters[2], parameters[3], parameters[4]);
            case "VacuumCleaner":
                return new VacuumCleaner(parameters[0], parameters[1], parameters[2], parameters[3], parameters[4], parameters[5]);
            default:
                return null;
        }
    }

    private String[] findParameters(String line) {
        char[] charArray = line.toCharArray();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '=') {
                while (charArray[i] != ',' && i < charArray.length - 1) {
                    i++;
                    builder.append(charArray[i]);
                }
            }
        }
        return builder.toString().split(",");
    }
}

//you may add your own new classes