import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ListInterface {
    public static void main(String[] args) {

        //Creating the List
        List<Integer> list = new ArrayList<Integer>();

        //Adding elements to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //Printing elements of the list
        for(Integer x: list){
            System.out.println(x);
        }

        //Updating elements of the list
        list.set(1, 2);

        //Accessing elements of a list by index
        System.out.println(list.get(1));

        //Removing an element from the list
        list.remove(3);

        list.add(2,10);

        //Printing a list
        System.out.println(list);


        System.out.println(list.contains(2));

        System.out.println(list.indexOf(2));
        list.add(2);
        System.out.println(list.lastIndexOf(2));

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);

        System.out.println(list.containsAll(list2));

        list2.add(10);
        list2.add(3);
        list2.add(2);

        System.out.println(list);
        System.out.println(list2);
        System.out.println(list.equals(list2));



        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);

        System.out.println(list3.size());
        System.out.println(list3);

        list3.add(2);
        list3.add(3);
        list3.add(4);
        list3.add(5);
        list3.add(6);

        System.out.println();
        System.out.println(list3);
        list3.remove(2);
        System.out.println("Removed element at index 2");
        System.out.println(list3);
        list3.remove(Integer.valueOf(2));
        System.out.println("Removed Integer 2");
        System.out.println(list3);

    }
}
