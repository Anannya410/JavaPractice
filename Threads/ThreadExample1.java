package Threads;

class MyThread extends Thread{
    public void run(){
        System.out.println("MyThread is running");
    }
}

public class ThreadExample1 {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
