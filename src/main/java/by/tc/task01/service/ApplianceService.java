package by.tc.task01.service;

import by.tc.task01.entity.Product;
import by.tc.task01.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceService {

    List<Product> find(Criteria criteria);
}
