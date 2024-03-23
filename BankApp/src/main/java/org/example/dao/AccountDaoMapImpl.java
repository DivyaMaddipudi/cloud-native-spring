package org.example.dao;

import org.example.dto.Account;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@Repository
public class AccountDaoMapImpl implements AccountDao{
    private HashMap<Integer, Account> accounts = new HashMap<>();

    public AccountDaoMapImpl() {
        accounts.put(1, new Account(1, "Divya", 10000.0));
        accounts.put(2, new Account(2, "Satya", 9000.0));
    }

    @Override
    public List<Account> getAll() {
        System.out.println("Getting all accounts");
        return new ArrayList<>(accounts.values());
    }

    @Override
    public Account getById(int id) {
        return accounts.get(id);
    }

    @Override
    public void updateAccount(Account account) {
        accounts.put(account.getId(), account);
    }
}
