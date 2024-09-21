package com.BankAppPrivate.BankAppPrivate.repository;

import com.BankAppPrivate.BankAppPrivate.model.Account;
import com.BankAppPrivate.BankAppPrivate.model.AccountHolder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {
    List<Account> findByPrimaryOwnerOrSecondaryOwner(AccountHolder primaryOwner, AccountHolder secondaryOwner);
}
