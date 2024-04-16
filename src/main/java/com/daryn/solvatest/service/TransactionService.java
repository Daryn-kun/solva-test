package com.daryn.solvatest.service;

import com.daryn.solvatest.entity.Transaction;

import java.util.List;

public interface TransactionService {
    List<Transaction> findAllTransaction();

    List<Transaction> getTransactionsExceedingLimits();

    Transaction saveTransaction(Transaction transaction);
}
