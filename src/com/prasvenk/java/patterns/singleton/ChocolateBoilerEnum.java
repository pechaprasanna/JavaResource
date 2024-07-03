package com.prasvenk.java.patterns.singleton;

public enum ChocolateBoilerEnum {
    UNIQUE_INSTANCE;
    private boolean empty;
    private boolean boiled;
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
