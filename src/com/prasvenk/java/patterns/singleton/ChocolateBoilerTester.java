package com.prasvenk.java.patterns.singleton;

public class ChocolateBoilerTester {
    public static void main(String[] args) {
        // Can't create instance because of private constructor
        //ChocolateBoiler chocolateBoiler = new ChocolateBoiler();
        // so use static method

        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
        chocolateBoiler.fill();
        chocolateBoiler.boil();
        chocolateBoiler.drain();

        //Using enum is the simplest way of creating singleton
        ChocolateBoilerEnum chocolateBoilerEnum = ChocolateBoilerEnum.UNIQUE_INSTANCE;
        chocolateBoilerEnum.fill();
        chocolateBoilerEnum.boil();
        chocolateBoilerEnum.drain();
    }
}
