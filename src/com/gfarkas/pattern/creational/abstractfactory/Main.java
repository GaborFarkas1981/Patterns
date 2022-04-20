package com.gfarkas.pattern.creational.abstractfactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory accountFactory = FactoryProducer.getFactory(false);
        BankAccount checkingAccount = accountFactory.getBankAccount("CHECKING");
        checkingAccount.deposit(100L);
        checkingAccount.withdraw(100L);

        System.out.println("----------------------------------------------");

        accountFactory = FactoryProducer.getFactory(false);
        BankAccount savingsAccount = accountFactory.getBankAccount("SAVINGS");
        savingsAccount.deposit(100L);
        savingsAccount.withdraw(100L);

        System.out.println("----------------------------------------------");

        accountFactory = FactoryProducer.getFactory(true);
        BankAccount juniorCheckingAccount = accountFactory.getBankAccount("CHECKING");
        juniorCheckingAccount.deposit(50L);
        juniorCheckingAccount.withdraw(50L);

        System.out.println("----------------------------------------------");

        accountFactory = FactoryProducer.getFactory(true);
        BankAccount juniorSavingsAccount = accountFactory.getBankAccount("SAVINGS");
        juniorSavingsAccount.deposit(50L);
        juniorSavingsAccount.withdraw(50L);
    }
}
