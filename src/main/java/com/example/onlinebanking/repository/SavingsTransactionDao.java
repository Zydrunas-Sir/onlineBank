package com.example.onlinebanking.repository;

import com.example.onlinebanking.model.SavingsTransaction;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction, Long> {

    List<SavingsTransaction> findAll();
}