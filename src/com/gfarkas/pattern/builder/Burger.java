package com.gfarkas.pattern.builder;

public class Burger {
    private final String name; // required
    private final int price; // required
    private final Bun bun; // required
    private final Patty patty; // required
    private final Cheese cheese; // required
    private final Sauce sauce; // required
    private final boolean salad; // optional
    private final int tomato; // optional
    private final int onion; // optional
    private final int cucumber; // optional
    private final int grilledBacon; // optional
    private final int redOnion; // optional
    private final int jalapeno; // optional
    private final boolean mastard; // optional
    private final boolean blueberryChatney; // optional
    private final int bloomingOnion; // optional
    private final int grilledOnion; // optional
    private final int onionRings; // optional
    private final int friedEggs; // optional

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
    //All getter, and NO setter to provde immutability

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Bun getBun() {
        return bun;
    }

    public Patty getPatty() {
        return patty;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public boolean isSalad() {
        return salad;
    }

    public int getTomato() {
        return tomato;
    }

    public int getOnion() {
        return onion;
    }

    public int getCucumber() {
        return cucumber;
    }

    public int getGrilledBacon() {
        return grilledBacon;
    }

    public int getRedOnion() {
        return redOnion;
    }

    public int getJalapeno() {
        return jalapeno;
    }

    public boolean isMastard() {
        return mastard;
    }

    public boolean isBlueberryChatney() {
        return blueberryChatney;
    }

    public int getBloomingOnion() {
        return bloomingOnion;
    }

    public int getGrilledOnion() {
        return grilledOnion;
    }

    public int getOnionRings() {
        return onionRings;
    }

    public int getFriedEggs() {
        return friedEggs;
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

        public BurgerBuilder grilledBacon(int grilledBacon) {
            this.grilledBacon = grilledBacon;
            return this;
        }

        public BurgerBuilder grilledOnion(int grilledOnion) {
            this.grilledOnion = grilledOnion;
            return this;
        }

        public BurgerBuilder onionRings(int onionRings) {
            this.onionRings = onionRings;
            return this;
        }

        public BurgerBuilder bloomingOnion(int bloomingOnion) {
            this.bloomingOnion = bloomingOnion;
            return this;
        }

        public BurgerBuilder redOnion(int redOnion) {
            this.redOnion = redOnion;
            return this;
        }


        public BurgerBuilder cucumber(int cucumber) {
            this.cucumber = cucumber;
            return this;
        }

        public BurgerBuilder blueberryChatney(boolean blueberryChatney) {
            this.blueberryChatney = blueberryChatney;
            return this;
        }

        public BurgerBuilder jalapeno(int jalapeno) {
            this.jalapeno = jalapeno;
            return this;
        }

        public BurgerBuilder mastard(boolean mastard) {
            this.mastard = mastard;
            return this;
        }

        public BurgerBuilder friedEggs(int friedEggs) {
            this.friedEggs = friedEggs;
            return this;
        }

        // Returns the finally constructed Burger object
        public Burger build() {
            burgerValidator();
            return new Burger(this);
        }

        private void burgerValidator() {
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