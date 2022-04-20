package com.gfarkas.pattern.creational.abstractfactory;

public class JuniorCheckingAccount implements BankAccount{
    @Override
    public void deposit(long deposit) {
        System.out.println(deposit + "EUR deposit to junior checking account");
    }

    public void withdraw(long withdraw) {
        System.out.println(withdraw + "EUR withdraw from junior checking account");
    }
}
