package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingCachedThreadPool {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        for(int i = 0; i < 4; i++){
            executor.execute(new MyThread(i));
        }

        executor.execute(new MyThread(10));

        executor.shutdown();
    }
}
