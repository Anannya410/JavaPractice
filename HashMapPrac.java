import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapPrac {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();

        System.out.println("Enter an array of integers and enter -1 to end the array");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while(x != -1) {
            map.put(x, map.getOrDefault(x, 0) + 1);
            x = sc.nextInt();
        }

        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            System.out.println("Total number of "+ e.getKey()+" entered = "+e.getValue());
        }

        System.out.println("The Hash Code for the map is: "+map.hashCode());
    }
}
