package com.company.transaction;

public class MonthlyTransaction implements AbstractTransaction {

    @Override
    public void generate() {
        System.out.println("MonthlyTransaction");
    }
}
