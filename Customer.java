package com.company;

public class Customer {

    private int customerId;

    public Customer(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    @Override
    public String toString() {
        return "Customer-"+
                 + customerId;
    }
}
