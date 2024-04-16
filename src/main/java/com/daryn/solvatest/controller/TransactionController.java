package com.daryn.solvatest.controller;

import com.daryn.solvatest.entity.Transaction;
import com.daryn.solvatest.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
    private final TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping
    public List<Transaction> finaAllTransaction(){
        return transactionService.findAllTransaction();
    }

    @PostMapping("/add")
    public Transaction saveTransaction(@RequestBody Transaction transaction){
        return transactionService.saveTransaction(transaction);
    }

    @GetMapping("/exceeded")
    public List<Transaction> getTransactionsExceedingLimits() {
        return transactionService.getTransactionsExceedingLimits();
    }
}
