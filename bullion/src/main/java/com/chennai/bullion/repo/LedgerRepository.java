package com.chennai.bullion.repo;// LedgerRepository.java
import com.chennai.bullion.model.Ledger;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface LedgerRepository extends MongoRepository<Ledger, String> {
    List<Ledger> findByNameContainingIgnoreCase(String query);
}

