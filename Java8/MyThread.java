package Java8;

//Here using lambda expression we are able to create a thread without using an implementation class of the Runnable interfcase
public class MyThread {
    Runnable runnable = () -> {
        for(int i=0; i<10; i++){
            System.out.println(i);
        }
    };
}
