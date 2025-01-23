
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsPrac {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "mango");
        Stream<String> stream = list.stream();
        stream.forEach(n-> System.out.print(n+", "));

        System.out.println();
        String[] array = {"apple", "banana", "mango"};
        Stream<String> stream2 = Arrays.stream(array);
        stream2.forEach(n -> System.out.print(n+", "));

        System.out.println();
        Stream<Integer> stream3 = Stream.of(1, 2, 3);
        stream3.forEach(n -> System.out.print(n+", "));

        System.out.println();
        Stream<Integer> stream4 = Stream.iterate(0, n -> n + 1).limit(10);
        stream4.forEach(n -> System.out.print(n+", "));

        /*
        System.out.println();
        stream4.forEach(n -> System.out.print(n+", "));
        */
        //this will give runtime exception
        //Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed

        System.out.println();
        List<Integer> nums = Arrays.asList(3, 2, 4, 5, 1, 6, 9, 7, 8);
        Stream<Integer> numsStream = nums.stream();
        Stream<Integer> doubled = numsStream.map(n-> n*2);
        doubled.forEach(n->System.out.print(n+", "));

        //Writing the same in a compact way
        System.out.println();
        nums.stream().map(n->n*2).forEach(n->System.out.print(n+", "));
        //this will not return any stream as the forEach loop has already used it
        /*
        Stream<Integer> doubledData = nums.stream().map(n->n*2).forEach(n->System.out.println(n));
        */
        //This code will give an error.

        System.out.println();

        nums.stream()
                .filter(n->n%2==0) //this will pass all values that fulfill this filter predicate
                .sorted()
                .map(n->n*2)
                .forEach(n->System.out.print(n+", "));


        //a longer way of applying filter using Predicate
        Predicate<Integer> predi = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                if(n%2 == 0) return true;
                return false;
            }
        };
        System.out.println();

        nums.stream()
                .filter(predi)
                .forEach(n->System.out.print(n+", "));


        //using the reduce function
        System.out.println();
        int result = nums.stream().reduce(0, (c,e)->c+e);
        System.out.println("Addition = "+result);

    }
}
