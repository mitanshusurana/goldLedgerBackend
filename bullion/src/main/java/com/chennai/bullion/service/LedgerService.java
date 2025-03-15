package com.chennai.bullion.service;// LedgerService.java
import com.chennai.bullion.model.Ledger;
import com.chennai.bullion.repo.LedgerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class LedgerService {
    @Autowired
    private LedgerRepository ledgerRepository;

    public List<Ledger> getLedgers() {
        return ledgerRepository.findAll();
    }

    public Ledger getLedger(String id) {
        return ledgerRepository.findById(id).orElse(null);
    }

    public List<Ledger> searchLedgers(String query) {
        return ledgerRepository.findByNameContainingIgnoreCase(query);
    }

    public String createLedger(Ledger name) {
        Ledger ledger = new Ledger();
        ledger.setName(name.getName());
        ledger.setMetalBalance(0);
        ledger.setCashBalance(0);
        ledger.setLastUpdated(LocalDateTime.now());
        return  ledgerRepository.save(ledger).getName();

    }
}
