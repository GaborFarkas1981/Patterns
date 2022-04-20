package com.gfarkas.pattern.creational.abstractfactory;

public abstract class AbstractFactory {
    abstract BankAccount getBankAccount(String AccountType);
}
