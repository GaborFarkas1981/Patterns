package com.gfarkas.pattern.creational.builder;

public class Main {

    public static void main(String[] args) {
        Burger cheeseBurger =
                new Burger.BurgerBuilder("Cheese Burger", 8, Bun.NORMAL, Patty.BEEF, Cheese.EDAMI, Sauce.NORMAL)
                        .tomato(1).build();
        Burger baconBurger =
                new Burger.BurgerBuilder("Bacon Burger", 12, Bun.NORMAL, Patty.BEEF, Cheese.CHEDDAR, Sauce.NORMAL)
                        .grilledBacon(2)
                        .salad(true)
                        .tomato(1)
                        .redOnion(1)
                        .cucumber(1)
                        .build();
    }
}
