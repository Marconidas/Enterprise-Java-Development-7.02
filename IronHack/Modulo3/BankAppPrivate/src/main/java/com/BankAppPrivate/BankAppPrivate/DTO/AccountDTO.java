package com.BankAppPrivate.BankAppPrivate.DTO;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class AccountDTO {
    private BigDecimal balance;
    private Long primaryOwnerId;
    private Long secondaryOwnerId;
    private String secretKey;
}
