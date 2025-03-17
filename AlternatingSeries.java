import java.util.Scanner;

public class AlternatingSeries {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of terms
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        // Initialize the sum
        int sum = 0;

        // Loop to calculate the sum of the alternating series
        for (int i = 1; i <= n; i++) {
            // Add the current number if it's odd, subtract it if it's even
            if (i % 2 != 0) {
                sum += i;  // Add for odd numbers
            } else {
                sum -= i;  // Subtract for even numbers
            }
        }

        // Output the result
        System.out.println("The sum of the series is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
