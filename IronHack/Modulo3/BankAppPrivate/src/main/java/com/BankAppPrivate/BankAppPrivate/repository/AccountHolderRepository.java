package com.BankAppPrivate.BankAppPrivate.repository;

import com.BankAppPrivate.BankAppPrivate.model.AccountHolder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountHolderRepository extends JpaRepository<AccountHolder, Long> {
}
