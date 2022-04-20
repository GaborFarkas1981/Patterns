package com.gfarkas.pattern.creational.abstractfactory;


public class BankAccountFactory extends AbstractFactory{
    @Override
    BankAccount getBankAccount(String accountType) {
        if (accountType.equalsIgnoreCase("CHECKING")){
            return new CheckingAccount();
        } else if(accountType.equalsIgnoreCase("SAVINGS")){
            return new SavingsAccount();
        }
        return null;
    }
}
