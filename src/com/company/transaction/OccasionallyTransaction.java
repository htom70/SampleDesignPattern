package com.company.transaction;

public class OccasionallyTransaction implements AbstractTransaction{

    @Override
    public void generate() {
        System.out.println("OccasionallyTransaction");
    }
}
