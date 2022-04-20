package com.gfarkas.pattern.creational.abstractfactory;

public class CheckingAccount implements BankAccount{

    @Override
    public void deposit(long deposit) {
        System.out.println(deposit + "EUR deposit to checking account");
    }

    public void withdraw(long withdraw) {
        System.out.println(withdraw + "EUR withdraw from checking account");
    }
}
