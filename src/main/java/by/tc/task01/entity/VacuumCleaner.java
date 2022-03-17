package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Locale;

public class VacuumCleaner extends Appliance {
    private String filterType;
    private String bagType;
    private String wandType;
    private int motorSpeedRegulation;
    private int cleaningWidth;

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public void setMotorSpeedRegulation(int motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public void setCleaningWidth(int cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public String toString() {
        return String.format(Locale.ENGLISH,
                "%s : [%s=%d, %s=%s, %s=%s, %s=%s, %s=%d, %s=%d, %s=%s, %s=%.1f]",
                this.getClass().getSimpleName(),
                SearchCriteria.VacuumCleaner.POWER_CONSUMPTION, getPowerConsumption(),
                SearchCriteria.VacuumCleaner.FILTER_TYPE, filterType,
                SearchCriteria.VacuumCleaner.BAG_TYPE, bagType,
                SearchCriteria.VacuumCleaner.WAND_TYPE, wandType,
                SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION, motorSpeedRegulation,
                SearchCriteria.VacuumCleaner.CLEANING_WIDTH, cleaningWidth,
                SearchCriteria.VacuumCleaner.MANUFACTURER, getManufacturer(),
                SearchCriteria.VacuumCleaner.PRICE, getPrice());
    }
}
