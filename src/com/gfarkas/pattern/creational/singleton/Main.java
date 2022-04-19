package com.gfarkas.pattern.creational.singleton;

import static com.gfarkas.pattern.creational.singleton.SingletonEnum.INSTANCE;

public class Main {

    public static void main(String[] args) {
        INSTANCE.setName("Joe");
        System.out.println(INSTANCE.getName());
        INSTANCE.setName("Smith");
        System.out.println(INSTANCE.getName());
    }
}
