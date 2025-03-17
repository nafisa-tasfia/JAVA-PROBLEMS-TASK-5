import java.util.Scanner;

public class LargestInArray {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array to store the numbers
        int[] numbers = new int[n];

        // Prompt the user to enter the numbers
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Find the largest number in the array
        int largest = numbers[0];  // Assume the first element is the largest initially
        for (int i = 1; i < n; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];  // Update the largest number if a larger one is found
            }
        }

        // Output the largest number
        System.out.println("The largest number in the array is: " + largest);

        // Close the scanner
        scanner.close();
    }
}
