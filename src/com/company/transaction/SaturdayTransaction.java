package com.company.transaction;

public class SaturdayTransaction implements AbstractTransaction {

    @Override
    public void generate() {
        System.out.println("SaturdayTransaction");
    }
}
