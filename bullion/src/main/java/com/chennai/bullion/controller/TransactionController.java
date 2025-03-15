package com.chennai.bullion.controller;
// TransactionController.java
import com.chennai.bullion.model.Transaction;
import com.chennai.bullion.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ledgers/{ledgerId}/transactions")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @GetMapping
    public List<Transaction> getLedgerTransactions(@PathVariable String ledgerId) {
        return transactionService.getLedgerTransactions(ledgerId);
    }

    @PostMapping
    public Transaction createTransaction(@PathVariable String ledgerId, @RequestBody Transaction transaction) {
        transaction.setLedgerId(ledgerId);
        return transactionService.createTransaction(transaction);
    }
}