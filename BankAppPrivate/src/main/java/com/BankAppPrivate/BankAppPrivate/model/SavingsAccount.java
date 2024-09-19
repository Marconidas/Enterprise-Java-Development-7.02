package com.BankAppPrivate.BankAppPrivate.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
public class SavingsAccount extends Account {

    private static final BigDecimal DEFAULT_INTEREST_RATE = new BigDecimal("0.0025");
    private static final BigDecimal MAX_INTEREST_RATE = new BigDecimal("0.5");
    private static final BigDecimal DEFAULT_MINIMUM_BALANCE = new BigDecimal("1000");

    private BigDecimal interestRate;
    private BigDecimal minimumBalance;

    public SavingsAccount(Money balance, AccountHolder primaryOwner, AccountHolder secondaryOwner, String secretKey, BigDecimal interestRate, BigDecimal minimumBalance) {
        super(balance, primaryOwner, secondaryOwner, secretKey);
        this.interestRate = (interestRate != null && interestRate.compareTo(MAX_INTEREST_RATE) <= 0) ? interestRate : DEFAULT_INTEREST_RATE;
        this.minimumBalance = (minimumBalance != null && minimumBalance.compareTo(new BigDecimal("100")) >= 0) ? minimumBalance : DEFAULT_MINIMUM_BALANCE;
    }
}
