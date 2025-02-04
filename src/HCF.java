//HCF without using recursion
//HCF(a,b) = HCF(b,a%b) --Euclidean Algorithm

//Solving by Brute Force method

import java.util.Scanner;

public class HCF {
    //By Brute Force Methond
    public static int findHCF(int n1, int n2) {

        int min = Math.min(n1, n2);

        for (int i = min; i >= 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                return i;
            }
        }return  1;
    }

    //BY Euclidean Algorithms
    public static int HCFWithoutRecursion(int n1, int n2){
        int min = Math.min(n1,n2);
        while(n2!=0){
            int temp = n2;
            n2 = n1%n2;
            n1 = temp;
        }
        return n1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter Second Number: ");
        int num2 = sc.nextInt();

        //int hcf = findHCF(num1, num2);
        //System.out.println("HCF of " + num1 + "and " + num2 +" is: " + hcf);

        int hcf1 = HCFWithoutRecursion(num1, num2);
        System.out.println("HCF of " + num1 + "and " + num2 +" is: " + hcf1);
        sc.close();
    }




}
