package Threads;

public class MyThread implements Runnable{
    private int id;

    public MyThread(int id) {
        this.id = id;
    }

    @Override
    public void run(){
        System.out.println("############### Starting task : "+this.id+" ------- Using Thread : "+Thread.currentThread().getName());

        for(int i = 0; i<10; i++){
            System.out.println("Task id : "+this.id+" Count = "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("################ Finished task : "+this.id);
    }
}
