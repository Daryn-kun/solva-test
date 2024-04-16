package com.daryn.solvatest.service.impl;

import com.daryn.solvatest.entity.Transaction;
import com.daryn.solvatest.repository.TransactionRepository;
import com.daryn.solvatest.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TransactionServiceImpl implements TransactionService {
    private final TransactionRepository transactionRepository;

    @Autowired
    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public List<Transaction> findAllTransaction(){
        return transactionRepository.findAll();
    }

    @Override
    public Transaction saveTransaction(Transaction transaction) {
        transaction.setDatetime(new Date());
        return transactionRepository.save(transaction);
    }

    @Override
    public List<Transaction> getTransactionsExceedingLimits() {
        return transactionRepository.findAll()
                .stream()
                .filter(Transaction::getLimitExceeded)
                .collect(Collectors.toList());
    }
}
