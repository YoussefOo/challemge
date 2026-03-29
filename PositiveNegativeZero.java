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

// public class PositiveNegativeZero {
//     // write code here
//     public static void checkNumber ( int number){
        
//         System.out.println(number>0?"positive":(number<0 ? "negative": "zero"));
//     }
    
// }
// the expression (condition ? value_if_true : value_if_false) is a ternary operator that evaluates the condition and returns one of two values based on whether the condition is true or false. In this case, it checks if the number is greater than 0, less than 0, or equal to 0 and returns the corresponding string ("positive", "negative", or "zero") accordingly.

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