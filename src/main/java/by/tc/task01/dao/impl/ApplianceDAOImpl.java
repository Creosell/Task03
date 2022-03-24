package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.impl.builder.*;
import by.tc.task01.entity.Product;
import by.tc.task01.entity.criteria.Criteria;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
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

        try (BufferedReader fileReader = new BufferedReader(new FileReader(Objects.requireNonNull(getClass().getResource("/appliances_db.txt")).getPath()))) {
            int numberOfNeededCriteria = criteria.getCriteria().size();
            int foundCriteria;

            while (fileReader.ready()) {
                String lineWithObjectParameters = fileReader.readLine();
                foundCriteria = 0;

                if (lineWithObjectParameters.matches(criteria.getGroupSearchName() + ".+")) {
                    for (Map.Entry<String, Object> criteriaMap : criteria.getCriteria().entrySet()) {
                        if (lineWithObjectParameters.matches(".+" + criteriaMap.getKey() + "=" + criteriaMap.getValue().toString() + "(|(,.+))")) {
                            foundCriteria++;
                        }
                        if (foundCriteria == numberOfNeededCriteria) {
                            productList.add(createObject(lineWithObjectParameters, criteria.getGroupSearchName()));
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Can't get access to file appliances_db.txt or file not found.", e);
        } catch (IOException e) {
            throw new RuntimeException("Exception while working with file appliances_db.txt", e);
        }
        return productList;
    }

    private Product createObject(final String lineWithObjectParameters, final String className) {

        switch (className) {
            case "Laptop":
                return new LaptopBuilder(lineWithObjectParameters).build();
            case "Oven":
                return new OvenBuilder(lineWithObjectParameters).build();
            case "Refrigerator":
                return new RefrigeratorBuilder(lineWithObjectParameters).build();
            case "Speakers":
                return new SpeakersBuilder(lineWithObjectParameters).build();
            case "TabletPC":
                return new TabletPCBuilder(lineWithObjectParameters).build();
            case "VacuumCleaner":
                return new VacuumCleanerBuilder(lineWithObjectParameters).build();
            default:
                throw new RuntimeException("No builder can be called to create an object of product.");
        }
    }
}

