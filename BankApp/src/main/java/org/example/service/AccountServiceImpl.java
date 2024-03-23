package org.example.service;

import org.example.dao.AccountDao;
import org.example.dto.Account;
import org.example.exception.BackAccountNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "accountService")
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountDao accountDao;

    public AccountServiceImpl(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public List<Account> getAll() {
        return accountDao.getAll();
    }

    @Override
    public Account getById(int id) {
        Account account = accountDao.getById(id);
        if(account == null) {
            throw new BackAccountNotFoundException("Bank account not found with id " + id);
        }
        return account;
    }

    @Override
    public void transfer(int fromId, int toId, double amount) {
        Account fromAcc = accountDao.getById(fromId);
        Account toAcc = accountDao.getById(toId);

        fromAcc.setAmount(fromAcc.getAmount() - amount);
        toAcc.setAmount(toAcc.getAmount() + amount);
//        accountDao.updateAccount(fromAcc);
//        accountDao.updateAccount(toAcc);
    }

    @Override
    public void deposit(int fromId, double amount) {
        Account acc = accountDao.getById(fromId);
        acc.setAmount(acc.getAmount() + amount);
    }

    @Override
    public void withdraw(int fromId, double amount) {
        Account acc = accountDao.getById(fromId);
        acc.setAmount(acc.getAmount() - amount);
    }
}
