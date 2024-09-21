package com.BankAppPrivate.BankAppPrivate.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
public class CheckingAccount extends Account {

    private static final BigDecimal MINIMUM_BALANCE = new BigDecimal("250");
    private static final BigDecimal MONTHLY_MAINTENANCE_FEE = new BigDecimal("12");

    private BigDecimal minimumBalance;
    private BigDecimal monthlyMaintenanceFee;

    public CheckingAccount(Money balance, AccountHolder primaryOwner, AccountHolder secondaryOwner, String secretKey) {
        super(balance, primaryOwner, secondaryOwner, secretKey);
        this.minimumBalance = MINIMUM_BALANCE;
        this.monthlyMaintenanceFee = MONTHLY_MAINTENANCE_FEE;
    }
}
