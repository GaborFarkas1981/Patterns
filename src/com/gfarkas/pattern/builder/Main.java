package com.gfarkas.pattern.builder;

public class Main {

    public static void main(String[] args) throws InvalidBurgerException {
        Burger cheeseBurger = new Burger.BurgerBuilder("Cheeseburger", 0, Bun.NORMAL, Patty.BEEF, Cheese.EDAMI, Sauce.NORMAL)
                .tomato(1).build();
    }
}
