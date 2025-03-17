import java.util.Scanner;

public class BanglaSeasonSwitch {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a month number
        System.out.print("Enter the month number (1 for January, 2 for February, ... 12 for December): ");
        int month = scanner.nextInt();

        // Determine the season using switch
        switch (month) {
            case 1:
            case 2:
                System.out.println("Season: শীত (Winter)");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Season: বসন্ত (Spring)");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Season: গ্রীষ্ম (Summer)");
                break;
            case 9:
            case 10:
                System.out.println("Season: বর্ষা (Monsoon)");
                break;
            case 11:
            case 12:
                System.out.println("Season: শরৎ (Autumn)");
                break;
            default:
                System.out.println("Invalid month number!");
                break;
        }

        // Close the scanner
        scanner.close();
    }
}
