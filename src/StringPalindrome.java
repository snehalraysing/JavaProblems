public class StringPalindrome {

    public static boolean findPalindrome(String str) {

        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }return true;
    }
        public static void main(String[] args){
            String newStr = "dad";

            if (findPalindrome(newStr) == true) {
                System.out.println("String is Palindrome");
            } else {
                System.out.println("String is not a Palindrome");
            }
        }

}