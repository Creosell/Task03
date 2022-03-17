package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Locale;

public class TabletPC extends ComputerElectronics {
    private int flashMemoryCapacity;
    private String color;

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format(Locale.ENGLISH,
                "%s : [%s=%.1f, %s=%s, %s=%d, %s=%d, %s=%s, %s=%s, %s=%.1f]",
                this.getClass().getSimpleName(),
                SearchCriteria.TabletPC.BATTERY_CAPACITY, getBatteryCapacity(),
                SearchCriteria.TabletPC.DISPLAY_INCHES, getDisplayInches(),
                SearchCriteria.TabletPC.MEMORY_ROM, getMemoryRom(),
                SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY, flashMemoryCapacity,
                SearchCriteria.TabletPC.COLOR, color,
                SearchCriteria.TabletPC.MANUFACTURER, getManufacturer(),
                SearchCriteria.TabletPC.PRICE, getPrice());
    }
}
