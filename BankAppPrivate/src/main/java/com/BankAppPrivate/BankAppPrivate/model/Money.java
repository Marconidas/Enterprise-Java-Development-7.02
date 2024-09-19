package com.BankAppPrivate.BankAppPrivate.model;

import jakarta.persistence.Embeddable;
import lombok.Data;
import java.math.BigDecimal;

@Data
@Embeddable
public class Money {

    private BigDecimal amount;

    public Money() {}

    public Money(BigDecimal amount) {
        this.amount = amount;
    }

    public void increaseAmount(BigDecimal addedAmount) {
        this.amount = this.amount.add(addedAmount);
    }

    public void decreaseAmount(BigDecimal subtractedAmount) {
        this.amount = this.amount.subtract(subtractedAmount);
    }
}
