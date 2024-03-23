package org.example;

import org.example.config.AppConfig;
import org.example.dto.Account;
import org.example.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);

        List<Account> accounts = accountService.getAll();

        accountService.transfer(1, 2, 100);

        accountService.deposit(1, 100);

        for(Account a : accounts) {
            System.out.println(a.getId() + " " + a.getName() + " " + a.getAmount());
        }


    }
}