// ### This program checks if a number is positive, negative, or zero and prints the appropriate message.
// Section 5 lessons 53.

import java.util.Scanner;

// public class PositiveNegativeZero {
//     double number = 292920;
//     public static void Checknumber(double number) {
//         if (number > 0) {
//             System.out.println(number + " is a positive number.");
//         } else if (number < 0) {
//             System.out.println(number + " is a negative number.");
//         } else {
//             System.out.println("The number is zero.");
//         }
//     }
        
// }   

public class PositiveNegativeZero {
    public static void main(String[] args) {
        double number = getNumber();
        Checknumber(number);
    }

    public static double getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        scanner.close();
        return number;
    }

    public static void Checknumber(double number) {
        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}   