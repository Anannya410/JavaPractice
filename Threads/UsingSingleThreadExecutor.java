package Threads;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingSingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        for(int i = 0; i < 4; i++){
            executor.execute(new MyThread(i));
        }

        executor.shutdown();
   }
}

