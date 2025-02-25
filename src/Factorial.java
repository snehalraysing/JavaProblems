import java.util.Scanner;

public class Factorial {
    public static int FactorialOfNumber(int n1){
        int result = 1;
        for(int i=n1; i>=1; i--){
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number To Generate Factorial: ");
        int num = sc.nextInt();

        int fact = FactorialOfNumber(num);
        System.out.println("Factorial of number " + num + " is: " + fact);
        sc.close();
    }
}
