package com.chennai.bullion.service;
// TransactionService.java
import com.chennai.bullion.model.Transaction;
import com.chennai.bullion.repo.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> getLedgerTransactions(String ledgerId) {
        return transactionRepository.findByLedgerId(ledgerId);
    }

    public Transaction createTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }
}