package com.BankAppPrivate.BankAppPrivate.DTO;

import com.BankAppPrivate.BankAppPrivate.model.AccountHolder;
import com.BankAppPrivate.BankAppPrivate.model.Money;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CheckingAccountDTO {
    private Money balance;
    private AccountHolder primaryOwner;
    private AccountHolder secondaryOwner;
    private String secretKey;
}
