package com.codemanship.comprehension;

public class RestockLevel {

    private final Warehouse warehouse;
    private final AverageDailySales averageDailySales;

    public RestockLevel(Warehouse warehouse, AverageDailySales averageDailySales) {
        this.warehouse = warehouse;
        this.averageDailySales = averageDailySales;
    }

    public int calculate(int productId) {
        Product product = warehouse.fetchProduct(productId);
        return (int) Math.ceil(averageDailySales.forProduct(productId) * product.getLeadTime());
    }
}
