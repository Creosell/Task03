package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Set;

public class Validator {

    public static boolean criteriaValidator(Criteria criteria) {
        int numberOfUserCriteria = criteria.getCriteria().size();
        String targetClassName = criteria.getGroupSearchName();
        Set<String> setOfUserSearchCriteria = criteria.getCriteria().keySet();
        int foundCriteria = 0;

        for (String currentCriteria : setOfUserSearchCriteria) {
            for (Class<?> currentEnum : SearchCriteria.class.getClasses()) {
                if (currentEnum.getSimpleName().equals(targetClassName)) {
                    if (checkForMatchesInEnum(currentEnum, currentCriteria)) {
                        foundCriteria++;
                    }
                }
            }
        }
        return foundCriteria == numberOfUserCriteria;
    }

    private static boolean checkForMatchesInEnum(Class<?> currentEnum, String currentCriteria) {
        boolean result = false;

        for (Object enumParameter : currentEnum.getEnumConstants()) {
            if (currentCriteria.equals(enumParameter.toString())) {
                result = true;
            }
        }
        return result;
    }
}