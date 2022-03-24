package by.tc.task01.main;

import by.tc.task01.entity.Product;
import by.tc.task01.entity.VacuumCleaner;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

import java.util.List;

import static by.tc.task01.entity.criteria.SearchCriteria.Oven;
import static by.tc.task01.entity.criteria.SearchCriteria.TabletPC;

public class Main {

    public static void main(String[] args) {
        List<Product> product;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        //////////////////////////////////////////////////////////////////

        Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"
        criteriaOven.add(Oven.CAPACITY.toString(), 3);

        product = service.find(criteriaOven);

        PrintApplianceInfo.print(product);

        //////////////////////////////////////////////////////////////////

        criteriaOven = new Criteria(Oven.class.getSimpleName());
        criteriaOven.add(Oven.HEIGHT.toString(), 200);
        criteriaOven.add(Oven.DEPTH.toString(), 300);

        product = service.find(criteriaOven);

        PrintApplianceInfo.print(product);

        //////////////////////////////////////////////////////////////////

        Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
        criteriaTabletPC.add(TabletPC.COLOR.toString(), "Blue");
        criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
        criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 8000);

        product = service.find(criteriaTabletPC);// find(Object...obj) changed object to Tablet PC

        PrintApplianceInfo.print(product);

        //////////////////////////////////////////////////////////////////

        Criteria criteriaVacuumCleaner = new Criteria(VacuumCleaner.class.getSimpleName());
        criteriaVacuumCleaner.add(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString(),"C");
        criteriaVacuumCleaner.add(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString(),30);
        criteriaVacuumCleaner.add(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString(),90);

        product = service.find(criteriaVacuumCleaner);

        PrintApplianceInfo.print(product);
    }
}
