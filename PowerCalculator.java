
import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the base
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();

        // Prompt the user to enter the exponent
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        // Calculate the power using a loop
        double result = 1;
        for (int i = 1; i <= Math.abs(exponent); i++) {
            result *= base;  // Multiply base by itself exponent times
        }

        // If exponent is negative, take the reciprocal
        if (exponent < 0) {
            result = 1 / result;
        }

        // Output the result
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        // Close the scanner
        scanner.close();
    }
}
