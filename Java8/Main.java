package Java8;

//public class Main {
//    public static void main(String[] args) {
//        Employee employee = new SoftwareDeveloper();
//        System.out.println(employee.getName());
//    }
//}

//Using lambda expression and functional interface we do not need to make the software developer class
public class Main {
    public static void main(String[] args) {
        Employee employee = () -> "Software Developer";
        //this lambda expression can only be made on functional interface because we have to write the implementation of that single abstract method
        System.out.println(employee.getName());

        Employee editor = () -> "Editor";
        System.out.println(editor.getName());
    }
}
//Now we don't need a separate class for software Developer
