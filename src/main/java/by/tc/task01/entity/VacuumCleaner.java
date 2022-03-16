package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Locale;

public class VacuumCleaner implements Appliance {
    private  int powerConsumption;
    private  String filterType;
    private  String bagType;
    private  String wandType;
    private  int motorSpeedRegulation;

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public VacuumCleaner() {
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

    private  int cleaningWidth;

    public VacuumCleaner(int powerConsumption, String filterType, String bagType, String wandType, int motorSpeedRegulation, int cleaningWidth) {
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public String toString() {
        return String.format(Locale.ENGLISH,"%s : [%s=%d, %s=%s, %s=%s, %s=%s, %s=%d, %s=%d]",
                this.getClass().getSimpleName(),
                SearchCriteria.VacuumCleaner.POWER_CONSUMPTION, powerConsumption,
                SearchCriteria.VacuumCleaner.FILTER_TYPE, filterType,
                SearchCriteria.VacuumCleaner.BAG_TYPE, bagType,
                SearchCriteria.VacuumCleaner.WAND_TYPE, wandType,
                SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION, motorSpeedRegulation,
                SearchCriteria.VacuumCleaner.CLEANING_WIDTH, cleaningWidth);
    }
}
