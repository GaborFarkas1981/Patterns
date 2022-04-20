package com.gfarkas.pattern.creational.abstractfactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean junior) {
        if (junior) {
            return new JuniorBankAccountFactory();
        } else {
            return new BankAccountFactory();
        }
    }
}
