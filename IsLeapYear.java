// coding exercise: Is Leap Year 5
// A leap year is a year that is divisible by 4, but not by 100
import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {
        int year = getYear();
        boolean isLeap = isLeapYear(year);
        if (isLeap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static int getYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        scanner.close();
        return year;
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
