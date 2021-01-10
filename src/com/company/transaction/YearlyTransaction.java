package com.company.transaction;

public class YearlyTransaction implements AbstractTransaction{

    @Override
    public  void generate() {
        System.out.println("YearlyTransaction");
    }
}
