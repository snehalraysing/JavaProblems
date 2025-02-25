import java.util.LinkedHashSet;
import java.util.Scanner;

public class StringCompression {
    public static String compressString(String str){
        StringBuilder newString = new StringBuilder();
        LinkedHashSet<Character> seen = new LinkedHashSet<>();

        for(int i = 0; i<str.length();i++ ){
            char ch = str.charAt(i);

            if(Character.isLetter(ch) && !seen.contains(ch)){
                newString.append(ch);
                seen.add(ch);
            }
        }
        return newString.toString();

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        String compressedString = compressString(str);
        System.out.println("Compression of string "+str+" is: " + compressedString);
    }
}
