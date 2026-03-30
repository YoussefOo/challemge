// // coding exercise: Decimal Comparator 6
// // Write a method areEqualByThreeDecimalPlaces with two parameters of type double. 
// // The method should return boolean and it needs to return true if two double numbers are the same up to

// import java.util.Scanner;

// public class DesimalComparator {

//     public static void main (String[] args) {
//         long number1 = getNumber1();
//         long number2 = getNumber2();
//         boolean result = areEqualByThreeDecimalPlaces(number1, number2);
//         System.out.println(result);

    
//     }

//     public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
//         return (int) (num1 * 1000) == (int) (num2 * 1000);
//     }

//     public static long getNumber1() {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the first number: ");
//         double number1 = scanner.nextDouble();
//         scanner.close();
//         return (long) (number1 * 1000);
//     }

//     public static long getNumber2() {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the second number: ");
//         double number2 = scanner.nextDouble();
//         scanner.close();
//         return (long) (number2 * 1000);
//     }
// }

import java.util.Scanner;

public class DecimalComparator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // One scanner for the whole program

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        boolean result = areEqualByThreeDecimalPlaces(num1, num2);
        System.out.println("Are they equal up to 3 decimal places? " + result);
        
        scanner.close(); // Close it once at the very end
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        // Casting to int truncates the decimal part, effectively "dropping" 
        // everything after the third decimal place.
        return (int) (num1 * 1000) == (int) (num2 * 1000);
    }
}