package Threads;

public class ThreadExample4 {
    public static void main(String[] args) {
        Runnable runnable = () ->{
            String threadName = Thread.currentThread().getName();
            System.out.println("The thread named " + threadName + " is running");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("The thread named " + threadName + " is stopped");
        };

        Thread thread = new Thread(runnable, "Thread1");
        thread.start();
        Thread thread2 = new Thread(runnable, "Thread2");
        thread2.start();
    }
}
