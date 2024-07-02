package com.prasvenk.java.pattern.singleton;

public class SingletonPattern {

    private String data;

    private SingletonPattern () {
        System.out.println("Constructor");
        data = "Hello";
    }

    public static SingletonPattern getInstance() {
        return new SingletonPattern();
    }
}
