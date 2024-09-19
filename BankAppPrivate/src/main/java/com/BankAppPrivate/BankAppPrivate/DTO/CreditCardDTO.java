package com.BankAppPrivate.BankAppPrivate.DTO;

import com.BankAppPrivate.BankAppPrivate.model.AccountHolder;
import com.BankAppPrivate.BankAppPrivate.model.Money;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class CreditCardDTO {
    private Money balance;
    private AccountHolder primaryOwner;
    private AccountHolder secondaryOwner;
    private String secretKey;
    private BigDecimal interestRate;
    private BigDecimal creditLimit;
}
