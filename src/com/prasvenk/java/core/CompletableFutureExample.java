package com.prasvenk.java.core;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public static void main(String[] args) throws InterruptedException {
        int a = 5;
        int b = 6;

        CompletableFuture<Integer> call1 = CompletableFuture.supplyAsync(()-> {
            try {
                return sum(a,b);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        CompletableFuture<Integer> call2 = CompletableFuture.supplyAsync(()-> {
            try {
                return subtract(a,b);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        CompletableFuture.allOf(call1, call2);
        System.out.println(call1.join() + " " + call2.join());
    }

    private static int subtract(int a, int b) throws InterruptedException {
        System.out.println("Entered subtract");
        Thread.sleep(5000);
        System.out.println("Exiting Subtract");
        return a-b;
    }

    private static int sum(int a, int b) throws InterruptedException {
        System.out.println("Entered Sum");
        Thread.sleep(2000);
        System.out.println("Exiting Sum");
        return a+b;
    }
}
