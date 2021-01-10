package com.company.transaction;

public class SingleTransactionBetweenGivenDates implements AbstractTransaction {

    @Override
    public void generate() {
        System.out.println("SingleTransactionBetweenGivenDates");
    }
}
