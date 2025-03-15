package com.chennai.bullion.controller;// LedgerController.java
import com.chennai.bullion.model.Ledger;
import com.chennai.bullion.service.LedgerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ledgers")
public class LedgerController {
    @Autowired
    private LedgerService ledgerService;

    @GetMapping
    public List<Ledger> getLedgers() {
        return ledgerService.getLedgers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ledger> getLedger(@PathVariable String id) {
        Ledger ledger = ledgerService.getLedger(id);
        return ledger != null ? ResponseEntity.ok(ledger) : ResponseEntity.notFound().build();
    }

    @GetMapping("/search")
    public List<Ledger> searchLedgers(@RequestParam String q) {
        return ledgerService.searchLedgers(q);
    }

    @PostMapping
    public String createLedger(@RequestBody Ledger name) {
        return ledgerService.createLedger(name);
    }
}
