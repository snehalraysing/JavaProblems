public class LeapYear{
    public static void main(String[] args) {
        int year = 2025;

        if((year%4 == 0 && year%100!=0) || (year%400 == 0)){
            System.out.println("Year " + year +" is a LeapYear");
        }else{
            System.out.println("Not a LeapYear");
        }
    }
}
