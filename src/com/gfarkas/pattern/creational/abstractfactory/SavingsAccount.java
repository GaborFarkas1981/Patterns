package com.gfarkas.pattern.creational.abstractfactory;

public class SavingsAccount implements BankAccount{
    @Override
    public void deposit(long deposit) {
        System.out.println(deposit + "EUR deposit to savings account");
    }

    public void withdraw(long withdraw) {
        System.out.println(withdraw + "EUR withdraw from savings account");
    }
}
