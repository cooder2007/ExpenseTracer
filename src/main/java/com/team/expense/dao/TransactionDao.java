package com.team.expense.dao;

import com.team.expense.model.Transaction;
import java.util.List;
import java.util.Optional;

public interface TransactionDao {
    void add(Transaction transaction);
    List<Transaction> getAll();
    Optional<Transaction> getById(int id);
    void update(Transaction transaction);
    void delete(int id);
}