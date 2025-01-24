import java.util.Scanner;
import java.util.stream.Stream;

public class StringMethods11 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a string: ");
//        String str = sc.nextLine();

        String str = "   Hello \n I am Anannya Hiteshi";

        if(str.isBlank()){
            System.out.println("This is an empty string");
            return;
        }

        System.out.println("Here is the string broken in lines");
        Stream<String> lines = str.lines();
        lines.forEach(n-> System.out.println(n));

        System.out.println("Removed spaces : \n"+str.strip());
        // we can also use str.stripLeading() and  str.stripTrailing

        System.out.println("Repeated the string 4 times : "+str.repeat(4));

    }
}
