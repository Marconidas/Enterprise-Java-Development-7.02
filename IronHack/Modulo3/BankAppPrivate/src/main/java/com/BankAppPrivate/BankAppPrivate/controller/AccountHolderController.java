package com.BankAppPrivate.BankAppPrivate.controller;

import com.BankAppPrivate.BankAppPrivate.model.AccountHolder;
import com.BankAppPrivate.BankAppPrivate.service.AccountHolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account-holders")
public class AccountHolderController {

    @Autowired
    private AccountHolderService accountHolderService;

    @GetMapping("/{id}")
    public AccountHolder getAccountHolderById(@PathVariable Long id) {
        return accountHolderService.getAccountHolderById(id);
    }

    @PostMapping
    public void createAccountHolder(@RequestBody AccountHolder accountHolder) {
        accountHolderService.saveAccountHolder(accountHolder);
    }

    @DeleteMapping("/{id}")
    public void deleteAccountHolder(@PathVariable Long id) {
        accountHolderService.deleteAccountHolder(id);
    }
}
