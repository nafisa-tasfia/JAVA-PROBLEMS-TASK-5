import java.util.Scanner;

public class OddPowerSeries {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of terms
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        // Initialize variables
        int sum = 0;
        int currentOdd = 1;  // The first odd number

        // Loop to calculate the sum of squares of odd numbers up to n terms
        for (int i = 1; i <= n; i++) {
            sum += currentOdd * currentOdd;  // Add square of current odd number to sum
            currentOdd += 2;  // Move to the next odd number
        }

        // Output the result
        System.out.println("The sum of the series is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
