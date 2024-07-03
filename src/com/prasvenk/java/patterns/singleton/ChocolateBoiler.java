package com.prasvenk.java.patterns.singleton;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler () {
        empty = true;
        boiled = false;
    }


    public static ChocolateBoiler getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new ChocolateBoiler();
        }
        return uniqueInstance;
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    public void fill () {
        if(isEmpty()) {
            System.out.println("Filling");
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if(!isEmpty() && isBoiled()) {
            System.out.println("Draining");
            empty = true;
        }
    }

    public void boil() {
        if(!isEmpty() && !isBoiled()) {
            System.out.println("Boiling");
            boiled = true;
        }
    }
}
