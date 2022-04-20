package com.gfarkas.pattern.creational.abstractfactory;


public class JuniorBankAccountFactory extends AbstractFactory{
    @Override
    BankAccount getBankAccount(String accountType) {
        if (accountType.equalsIgnoreCase("CHECKING")){
            return new JuniorCheckingAccount();
        } else if(accountType.equalsIgnoreCase("SAVINGS")){
            return new JuniorSavingsAccount();
        }
        return null;
    }
}
