package com.company.transaction;

public class DailyTransaction implements AbstractTransaction{

    @Override
    public void generate() {
        System.out.println("DailyTransaction");
    }
}
