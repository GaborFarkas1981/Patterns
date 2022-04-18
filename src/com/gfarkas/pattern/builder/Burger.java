package com.gfarkas.pattern.builder;

public class Burger {
    private final String name;
    private final int price;
    private final Bun bun;
    private final Patty patty;
    private final Cheese cheese;
    private final Sauce sauce;
    private boolean salad;
    private int tomato;
    private int onion;
    private int cucumber;
    private int grilledBacon;
    private int redOnion;
    private int jalapeno;
    private boolean mastard;
    private boolean blueberryChatney;
    private int bloomingOnion;
    private int grilledOnion;
    private int onionRings;
    private int friedEggs;

    private Burger(BurgerBuilder burgerBuilder) {
        this.name = burgerBuilder.name;
        this.price = burgerBuilder.price;
        this.bun = burgerBuilder.bun;
        this.patty = burgerBuilder.patty;
        this.cheese = burgerBuilder.cheese;
        this.sauce = burgerBuilder.sauce;
        this.salad = burgerBuilder.salad;
        this.tomato = burgerBuilder.tomato;
        this.onion = burgerBuilder.onion;
        this.cucumber = burgerBuilder.cucumber;
        this.grilledBacon = burgerBuilder.grilledBacon;
        this.redOnion = burgerBuilder.redOnion;
        this.jalapeno = burgerBuilder.jalapeno;
        this.mastard = burgerBuilder.mastard;
        this.blueberryChatney = burgerBuilder.blueberryChatney;
        this.bloomingOnion = burgerBuilder.bloomingOnion;
        this.grilledOnion = burgerBuilder.grilledOnion;
        this.onionRings = burgerBuilder.onionRings;
        this.friedEggs = burgerBuilder.friedEggs;
    }

    public static class BurgerBuilder {
        private final String name;
        private final int price;
        private final Bun bun;
        private final Patty patty;
        private final Cheese cheese;
        private final Sauce sauce;
        private boolean salad;
        private int tomato;
        private int onion;
        private int cucumber;
        private int grilledBacon;
        private int redOnion;
        private int jalapeno;
        private boolean mastard;
        private boolean blueberryChatney;
        private int bloomingOnion;
        private int grilledOnion;
        private int onionRings;
        private int friedEggs;

        public BurgerBuilder(String name, int price, Bun bun, Patty patty, Cheese cheese, Sauce sauce) {
            this.name = name;
            this.price = price;
            this.bun = bun;
            this.patty = patty;
            this.cheese = cheese;
            this.sauce = sauce;
        }

        public BurgerBuilder salad(boolean salad) {
            this.salad = salad;
            return this;
        }

        public BurgerBuilder tomato(int tomato) {
            this.tomato = tomato;
            return this;
        }

        public BurgerBuilder onion(int onion) {
            this.onion = onion;
            return this;
        }

        public BurgerBuilder grilledOnion(int grilledOnion) {
            this.grilledOnion = BurgerBuilder.this.grilledOnion;
            return this;
        }

        public BurgerBuilder onionRings(int onionRings) {
            this.onionRings = BurgerBuilder.this.onionRings;
            return this;
        }

        public BurgerBuilder bloomingOnion(int bloomingOnion) {
            this.bloomingOnion = BurgerBuilder.this.bloomingOnion;
            return this;
        }
        public BurgerBuilder redOnion(int redOnion) {
            this.redOnion = BurgerBuilder.this.redOnion;
            return this;
        }


        public BurgerBuilder cucumber(int cucumber) {
            this.cucumber = cucumber;
            return this;
        }

        public BurgerBuilder blueberryChatney(int blueberryChatney) {
            this.blueberryChatney = BurgerBuilder.this.blueberryChatney;
            return this;
        }

        public BurgerBuilder jalapeno(int jalapeno) {
            this.jalapeno = BurgerBuilder.this.jalapeno;
            return this;
        }

        public BurgerBuilder mastard(int mastard) {
            this.mastard = BurgerBuilder.this.mastard;
            return this;
        }

        public BurgerBuilder friedEggs(int friedEggs) {
            this.friedEggs = BurgerBuilder.this.friedEggs;
            return this;
        }

        public Burger build() throws InvalidBurgerException {
            burgerValidator();
            return new Burger(this);
        }

        private void burgerValidator() throws InvalidBurgerException {
            StringBuilder sb = new StringBuilder();
            if (name == null) {
                sb.append("Enter name of the burger");
            }
            if (price < 1) {
                sb.append("Price must be greater than zero.");
            }
            if (bun == null) {
                sb.append("Select hamburger bun!");
            }
            if (patty == null) {
                sb.append("Select hamburger patty!");
            }
            if (cheese == null) {
                sb.append("Select cheese!");
            }
            if (sauce == null) {
                sb.append("Select sauce!");
            }
            if (sb.length() > 0) {
                throw new IllegalStateException(sb.toString());
            }
        }
    }

}