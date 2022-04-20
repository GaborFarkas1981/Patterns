package com.gfarkas.pattern.creational.abstractfactory;

public class JuniorSavingsAccount implements BankAccount{
    @Override
    public void deposit(long deposit) {
        System.out.println(deposit + "EUR deposit to junior savings account");
    }

    public void withdraw(long withdraw) {
        System.out.println(withdraw + "EUR withdraw from junior savings account");
    }
}
