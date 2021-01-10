package com.company.transaction;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionHandler {

    private Map<TransactionType, List<AbstractTransaction>> collectionOfTransactionsOfGivenTransactionType =
            new HashMap<>();

    public TransactionHandler(Map<TransactionType, List<AbstractTransaction>> collectionOfTransactionsOfGivenTransactionType) {
        this.collectionOfTransactionsOfGivenTransactionType = collectionOfTransactionsOfGivenTransactionType;
    }

    public void process() {
        for (Map.Entry<TransactionType, List<AbstractTransaction>> transactionTypeListEntry : collectionOfTransactionsOfGivenTransactionType.entrySet()) {
            TransactionType transactionType = transactionTypeListEntry.getKey();
            List<AbstractTransaction> transactions = collectionOfTransactionsOfGivenTransactionType.get(transactionType);
            System.out.println("Transaction Type: "+transactionType.toString());
            for (AbstractTransaction abstractTransaction : transactions) {
                abstractTransaction.generate();
            }
        }
    }


}
