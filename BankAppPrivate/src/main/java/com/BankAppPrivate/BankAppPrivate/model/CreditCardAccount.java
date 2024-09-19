package com.BankAppPrivate.BankAppPrivate.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
public class CreditCardAccount extends Account {

    private static final BigDecimal DEFAULT_CREDIT_LIMIT = new BigDecimal("100");
    private static final BigDecimal MAX_CREDIT_LIMIT = new BigDecimal("100000");
    private static final BigDecimal DEFAULT_INTEREST_RATE = new BigDecimal("0.2");
    private static final BigDecimal MIN_INTEREST_RATE = new BigDecimal("0.1");

    private BigDecimal creditLimit;
    private BigDecimal interestRate;

    public CreditCardAccount(Money balance, AccountHolder primaryOwner, AccountHolder secondaryOwner, String secretKey, BigDecimal creditLimit, BigDecimal interestRate) {
        super(balance, primaryOwner, secondaryOwner, secretKey);
        this.creditLimit = (creditLimit != null && creditLimit.compareTo(DEFAULT_CREDIT_LIMIT) >= 0 && creditLimit.compareTo(MAX_CREDIT_LIMIT) <= 0) ? creditLimit : DEFAULT_CREDIT_LIMIT;
        this.interestRate = (interestRate != null && interestRate.compareTo(MIN_INTEREST_RATE) >= 0 && interestRate.compareTo(DEFAULT_INTEREST_RATE) <= 0) ? interestRate : DEFAULT_INTEREST_RATE;
    }
}
