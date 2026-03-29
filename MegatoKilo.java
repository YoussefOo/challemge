import java.util.Scanner;

public class MegatoKilo {
    public static void main(String[] args) {
        double mega = getmega();
        double kilo = convertmegatokilo(mega);
        System.out.println(mega + " megabytes is equal to " + kilo + " kilobytes.");
    }

    public static double getmega() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value in megabytes: ");
        double mega = scanner.nextDouble();
        scanner.close();
        return mega;
    }


    public static double convertmegatokilo(double mega) {
        final double MEGA_TO_KILO_CONVERSION_FACTOR = 1024;
        return mega * MEGA_TO_KILO_CONVERSION_FACTOR;
    }
}
