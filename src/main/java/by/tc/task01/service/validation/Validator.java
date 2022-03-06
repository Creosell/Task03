package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

public class Validator {

    public static boolean criteriaValidator(Criteria criteria) {
        int counter = 0;
        int numberOfCriteria = criteria.getCriteria().size();

        for (String s : criteria.getCriteria().keySet()) {
            loop:
            for (Class<?> aClass : SearchCriteria.class.getClasses()) {
                for (Object enumConstant : aClass.getEnumConstants()) {
                    if (aClass.getSimpleName().equals(criteria.getGroupSearchName()) && s.equals(enumConstant.toString())) {
                        counter++;
                        break loop;
                    }
                }
            }
        }
        return counter == numberOfCriteria;
    }
}

//you may add your own new classes