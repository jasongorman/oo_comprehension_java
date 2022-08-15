package com.codemanship.comprehension;

public class Program {

    public static void main(String[] args) {
        RestockLevel restockLevel = new RestockLevel(
                productId -> new Product(811, 14),
                new ThirtyDayAverageSales((productId, startDate, endDate) -> 45)
        );

        System.out.println(restockLevel.calculate(811));

        // What will the program output?
    }
}
