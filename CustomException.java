import java.util.Scanner;

class DivisorGreaterException extends Exception{
    public DivisorGreaterException(String string){
        super(string);
    }
}

public class CustomException {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter dividend: ");
        int a = sc.nextInt();
        System.out.println("Enter divisor: ");
        int b = sc.nextInt();

        int result = 0;
        try{
            result = a/b;
            if(result == 0)
                throw new DivisorGreaterException("Divisor is greater than dividend");
        }
        catch(DivisorGreaterException e){
            System.out.println("We are doing integer division");
            System.out.println(e);
        }

        System.out.println("Result = "+result);

        sc.close();
    }
}
