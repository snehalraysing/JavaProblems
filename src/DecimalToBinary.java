import java.util.Scanner;
import java.util.Stack;

public class    DecimalToBinary {

    public static String DirectConvertor(int num) {
        return Integer.toBinaryString(num);
    }

    public static String UsingStack(int num) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder binary = new StringBuilder();

        while (num > 0) {
            stack.push(num % 2);
            num = num / 2;
        }

        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        return binary.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();

        String result1 = DirectConvertor(num);
        String result2 = UsingStack(num);

        System.out.println("Binary (Direct Conversion): " + result1);
        System.out.println("Binary (Using Stack): " + result2);

        sc.close();
    }
}
