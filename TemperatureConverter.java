import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input temperature in Fahrenheit
        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        
        // Convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;
        
        // Display result
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
        
        scanner.close();
    }
}