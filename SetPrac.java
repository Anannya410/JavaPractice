import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class SetPrac {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        //Union operation
        Set<Integer> set3 = new HashSet<>(set1);
        set3.addAll(set2);
        System.out.println("Union Operation: " + set3);

        //Intersection operation
        set3.clear();
        set3.addAll(set1);
        set3.retainAll(set2);
        System.out.println("Intersection Operation: " + set3);

        //Difference operation
        set3.clear();
        set3.addAll(set1);
        set3.removeAll(set2);
        System.out.println("Difference Operation: " + set3);

        set2.add(4);


        HashSet<Integer> set4 = new HashSet<>(set1);

        //Using Iterator to traverse set
        Iterator<Integer> iterator = set4.iterator();
        System.out.println();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }

        //Using enhanced for loop to traverse set
        System.out.println();
        for(Integer x: set4){
            System.out.print(x + ", ");
        }
    }
}
