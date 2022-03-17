package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Product;
import by.tc.task01.entity.criteria.Criteria;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ApplianceDAOImpl implements ApplianceDAO {

    @Override
    public List<Product> find(Criteria criteria) {
        List<Product> productList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(Objects.requireNonNull(getClass().getResource("/appliances_db.txt")).getPath()))) {
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
                            productList.add(createObject(line, criteria.getGroupSearchName()));
                        }
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Unexpected error");
        }
        return productList;
    }

    private Product createObject(final String line, final String className) {

        switch (className) {
            case "Laptop":
                return new LaptopBuilder().build(line);
            case "Oven":
                return new OvenBuilder().build(line);
            case "Refrigerator":
                return new RefrigeratorBuilder().build(line);
            case "Speakers":
                return new SpeakersBuilder().build(line);
            case "TabletPC":
                return new TabletBuilder().build(line);
            case "VacuumCleaner":
                return new VacuumCleanerBuilder().build(line);
            default:
                throw new RuntimeException("Error while creating object");
        }
    }
}

