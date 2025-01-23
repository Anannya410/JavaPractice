package Threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class UsingFixedThreadPool {

    public static void main(String[] args){
        ExecutorService executor = Executors.newFixedThreadPool(4);

        for(int i = 0; i<8; i++){
            executor.execute(new MyThread(i));
        }

        executor.shutdown();
    }
}

// When we use the fixedThreadPool it creates a fixed number of threads as specified and any task that can not be given a thread is kept in a LinkedBlockingQueue.
// As soon as a thread finishes up its current task it will take up a task from the queue.