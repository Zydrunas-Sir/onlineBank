package com.example.onlinebanking.service;

import com.example.onlinebanking.model.PrimaryAccount;
import com.example.onlinebanking.model.SavingsAccount;

import java.security.Principal;


public interface AccountService {

    PrimaryAccount createPrimaryAccount();

    SavingsAccount createSavingsAccount();

    void deposit(String accountType, double amount, Principal principal);

    void withdraw(String accountType, double amount, Principal principal);

}