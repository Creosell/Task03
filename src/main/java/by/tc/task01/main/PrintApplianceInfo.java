package by.tc.task01.main;

import by.tc.task01.entity.Product;

import java.util.List;

public class PrintApplianceInfo {

    public static void print(List<Product> product) {
        if (!product.isEmpty()) {
            for (Product entity : product) {
                System.out.println(entity.toString());
            }
            System.out.println();
        } else {
            System.out.println("Results are not found");
        }
    }
}
