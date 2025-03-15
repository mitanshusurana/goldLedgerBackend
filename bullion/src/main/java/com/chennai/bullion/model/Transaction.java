package com.chennai.bullion.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "transactions")
public class Transaction {
    @Id
    private String id;
    private String ledgerId;
    private String type; // "sale", "purchase", etc.
    private Double amount;
    private Double grossWeight;
    private Double pureWeight;
    private Double purity;
    private Double balance;
    private Double paidAmount;
    private Double roundedAmount;
    private Double rate;
    private LocalDateTime timestamp;

    // Getters and Setters
}