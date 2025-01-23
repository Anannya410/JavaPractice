package Threads;

class ThreadInstance extends Thread{
    public void run(){
        System.out.println("MyThread is running");
    }
}

public class ThreadExample1 {
    public static void main(String[] args) {
        ThreadInstance thread = new ThreadInstance();
        thread.start();
    }
}
