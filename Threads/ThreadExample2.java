package Threads;

public class ThreadExample2 {
    public static class MyRunnable implements Runnable {
        public void run() {
            System.out.println("MyRunnable");
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}

//public class ThreadExample2 {
//    public class MyRunnable implements Runnable{
//        public void run() {
//            System.out.println("MyRunnable");
//        }
//    }
//    public static void main(String[] args) {
//        ThreadExample2 outer = new ThreadExample2();
//
//        Thread thread = new Thread(outer.new MyRunnable());
//        thread.start();
//    }
//}
