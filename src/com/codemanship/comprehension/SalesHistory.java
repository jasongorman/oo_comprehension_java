package com.codemanship.comprehension;

import java.time.LocalDate;

public interface SalesHistory {
    double withinDateRange(int productId, LocalDate startDate, LocalDate endDate);
}
