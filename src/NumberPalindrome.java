public class NumberPalindrome {
    public static boolean findPalindrome(int num){
        int remainder;

        for(int i=0; i<=num;i++){
            remainder = num%10;
        }
    }
    public static void main(String[] args) {
        int n=5665;
        if(findPalindrome(n)==true){
            System.out.println("Number is palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
