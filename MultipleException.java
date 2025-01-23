import java.util.Scanner;

public class MultipleException {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 200;
        int b;
        System.out.println("Enter divisor");
        b = sc.nextInt();
        int[] arr = {1,2,3,4};

        System.out.println("Enter array index");
        int i = sc.nextInt();
        int result;

        try{
            result = a/b + arr[i];
        }
        catch (ArithmeticException e){
            System.out.println("Can not divide a number by 0");
            System.out.println(e);
            result = a + arr[i];
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The array only have index 0 to 3");
            System.out.println(e);
            i = 0;
            result = a/b + arr[i];
        }
        //this code will create issue if both Exceptions occur at once because of result being calculated again in the catch block

        System.out.println();
        System.out.printf("\na = %d,\tb = %d,\tarr[%d] = %d\n",a,b,i,arr[i]);
        System.out.println("Result = "+result);

        sc.close();
    }
}
