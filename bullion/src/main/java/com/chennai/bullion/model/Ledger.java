package com.chennai.bullion.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "ledgers")
public class Ledger {
    @Id
    private String id;
    private String name;
    private double metalBalance;
    private double cashBalance;
    private LocalDateTime lastUpdated;

    // Getters and Setters
}