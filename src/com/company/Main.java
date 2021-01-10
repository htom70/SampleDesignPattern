package com.company;

import com.company.transaction.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<TransactionType, List<AbstractTransaction>> transactionTypes = new HashMap<>();
        transactionTypes.put(TransactionType.POS, new ArrayList<>(Arrays.asList(new OccasionallyTransaction(), new SaturdayTransaction())));
        transactionTypes.put(TransactionType.NET, new ArrayList<>(Arrays.asList(new DailyTransaction(), new MonthlyTransaction())));
        transactionTypes.put(TransactionType.ATM, new ArrayList<>(Arrays.asList(new YearlyTransaction())));
        TransactionHandler transactionHandler = new TransactionHandler(transactionTypes);
        transactionHandler.process();
    }
}
