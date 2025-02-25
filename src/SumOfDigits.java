import java.util.Scanner;

public class SumOfDigits {
    public static int digitsSum(int n){
        int sum =0;
        int remainder ;
        while(n>0){
           remainder = n%10;
           sum = sum + remainder;
           n=n/10;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int ans = digitsSum(num);
        System.out.println("Sum of digits of a number: "+ans);
        sc.close();
    }
}
