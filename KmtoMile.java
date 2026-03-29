// coding exercise: Convert Kilometers to Miles 2

import java.util.Scanner;
import java.math.*;

public class KmtoMile {
    public static void main(String[] args) {
        double km = getKm();
        double mile = convertKmToMile(km);
        System.out.println(km + " kilometers is equal to " + mile + " miles.");
    }

    public static double getKm() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double km = scanner.nextDouble();
        scanner.close();
        return km;
    }

    public static double convertKmToMile(double km) {
        final double KM_TO_MILE_CONVERSION_FACTOR = 0.621371;
        return km * KM_TO_MILE_CONVERSION_FACTOR;
    }   
    
}
