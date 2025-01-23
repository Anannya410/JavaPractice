package Threads;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuturePrac {
    public static void main(String[] args) {
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() ->{
            System.out.println("Started async thread : "+Thread.currentThread().getName());
            try{
                Thread.sleep(5000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            return "OK";
        });

        System.out.println("Main function working on thread : "+Thread.currentThread().getName());
        System.out.println(completableFuture.getNow("Hello World"));
        System.out.println("Main function working on thread : "+Thread.currentThread().getName());
        try {
            System.out.println(completableFuture.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
