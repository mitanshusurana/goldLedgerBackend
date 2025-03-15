package com.chennai.bullion.repo;

import com.chennai.bullion.model.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TransactionRepository extends MongoRepository<Transaction, String> {
    List<Transaction> findByLedgerId(String ledgerId);
}