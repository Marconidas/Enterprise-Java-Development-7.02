package com.BankAppPrivate.BankAppPrivate.service;

import com.BankAppPrivate.BankAppPrivate.model.AccountHolder;
import com.BankAppPrivate.BankAppPrivate.repository.AccountHolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountHolderService {

    @Autowired
    private AccountHolderRepository accountHolderRepository;

    public AccountHolder getAccountHolderById(Long id) {
        return accountHolderRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Titular de cuenta no encontrado"));
    }

    public void saveAccountHolder(AccountHolder accountHolder) {
        accountHolderRepository.save(accountHolder);
    }

    public void deleteAccountHolder(Long id) {
        AccountHolder accountHolder = getAccountHolderById(id);
        accountHolderRepository.delete(accountHolder);
    }
}
