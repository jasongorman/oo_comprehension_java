package com.codemanship.comprehension;

import java.time.LocalDate;

public class ThirtyDayAverageSales implements AverageDailySales {
    private SalesHistory salesHistory;

    public ThirtyDayAverageSales(SalesHistory salesHistory) {
        this.salesHistory = salesHistory;
    }

    @Override
    public double forProduct(int productId) {
        LocalDate endDate = LocalDate.now();
        LocalDate startDate = endDate.minusDays(30);
        return salesHistory.withinDateRange(productId, startDate, endDate)/30.0;
    }
}
