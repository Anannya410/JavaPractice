package Threads;

public class ThreadExample2 {
    public static class MyRunnable implements Runnable {
        private int id;
        public MyRunnable(int id) {
            this.id = id;
        }

        public void run() {
            System.out.println("MyRunnable is running task "+this.id);
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable(1));
        thread.start();
        Thread thread2 = new Thread(new MyRunnable(2));
        thread2.start();
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
