package Threads;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuturePrac2 {
    public static void main(String[] args) {
        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Started async thread f1: " + Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "OK";
        });

        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Started async thread f2: " + Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "All Ok";
        });

        CompletableFuture<Void> f = CompletableFuture.allOf(f1, f2);
        f.join();
        System.out.println("Main");
    }
}
