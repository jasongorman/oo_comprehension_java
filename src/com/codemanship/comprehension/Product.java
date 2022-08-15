package com.codemanship.comprehension;

public class Product {
    private final int id;
    private final int leadTime;

    public Product(int id, int leadTime) {

        this.id = id;
        this.leadTime = leadTime;
    }

    public int getId() {
        return id;
    }

    public int getLeadTime() {
        return leadTime;
    }
}
