package org.example.dao;

import org.example.dto.Account;

import java.util.List;

public interface AccountDao {
    public List<Account> getAll();
    public Account getById(int id);
    public void updateAccount(Account account);
}
