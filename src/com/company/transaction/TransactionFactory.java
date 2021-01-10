package com.company.transaction;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionFactory {

    public AbstractTransaction produce(KindOfTransaction kindOfTransaction) {
        AbstractTransaction result=null;
        switch (kindOfTransaction) {
            case DAILY:
                result = new DailyTransaction();
                break;
            case MONTHLY:
                result = new MonthlyTransaction();
                break;
            case YEARLY:
                result = new YearlyTransaction();
                break;
            case SATURDAY:
                result = new SaturdayTransaction();
                break;
            case OCCASIONALLY:
                result = new OccasionallyTransaction();
                break;
            case SINGLE_BETWEEN_GIVEN_DATES:
                result = new SingleTransactionBetweenGivenDates();
                break;
        }
        return result;
    }
}
