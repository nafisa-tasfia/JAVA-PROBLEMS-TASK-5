# JAVA-PROBLEMS-TASK-5
Post Lab Exercise:
6.a. Write a Java program to convert temperature from Fahrenheit to Celsius
degree.
Test Data
Input a degree in Fahrenheit: 212
Expected Output :
212.0 degree Fahrenheit is equal to 100.0 in Celsius
Explanation:
This program helps to convert temperatures from Fahrenheit to Celsius. To do this, first the program create a Scanner object which is used to take user input. In a looped section of the code, the program waits for the user to provide a temperature measurement in Fahrenheit, or to issue a command that states “exit” in order to break the loop. If the input received from the user is a valid number, it is transferred to the ConvertToCelsius method, and from there, the conversion is done through the following formula:Celsius=(Fahrenheit−32)×5/9.Then the  result is printed with 2 decimal places for better understanding using printf. The program stops running when “exit” is typed, and if an unrepresentable input is given, which includes letters or symbols, the program will automatically prompt and tell the user that a valid number is required. While the user is converting the values, the loop makes it easier, so that the program does not need to be restarted every time the user wants to perform a different measurement. The program is closed properly by using the scanner.close() command when the user decides to exit. The overall structure and logic in this program makes it fast, user friendly and straightforward to follow. The input is 212.0  fahrenheit and the output is 100.0 celsius.

1. Write a program to test a year if it is leap year or not.
Explanation:
This Java program checks if the specified year is a leap year or not. At first it initializes a Scanner object to capture the user's input. It asks the user to input a year and saves that value in the year variable.To determine if the year is a leap year, the program follows these rules:
A year will be a leap year if it follows the following conditions:
it is evenly divided by 4, it is not evenly divided by 100 unless it is divided by 400.
A year that is divided by 400 will be a leap year.If a year is divided by 100 but not divided by 400, then that year will not be a leap year.If a year can be divided by 4, but not divided by 100, then that year will be a leap year.In any other case, that year will not be a leap year.The program will then confirm and display if the user-defined year is a leap year. In the end, the Scanner is closed so it can release the resources used in the system. The program is user-friendly, ensuring that it gives precise results in determining leap years.Input 2001 output its not leap year.


2.Write a program to evaluate the following series
1^2+3^2+5^2+............................ Up to n terms.
Explanation:
This Java program calculates the sum of squares of the first n odd numbers in the series 1^2+3^2+5^2+…… up to n terms. It first takes user input for n and checks if it's positive. The program initializes sum to 0 and currentOdd to 1 (the first odd number). After that Using a loop, it squares each odd number and adds it to sum, then increments currentOdd by 2 to get the next odd number. Finally, it prints the total sum. The program ensures proper resource handling by closing the Scanner.The the input is 3 and the output is 35



3. Write a program to evaluate the following series
1-2+3-4+............................ Up to n terms

Explanation:
This Java program calculates the sum of an alternating series in the form 1−2+3+4+5…up to n terms. The program begins by collecting the user to input the number of terms n. It initializes a variable sum to 0, which will store the result. A loop iterates through the numbers from 1 to n, checking if the current number is odd or even. If  i is odd, it adds 1  to the sum, and if i is even, it subtracts 1 from the sum. After the loop completes, the program outputs the calculated sum. The Scanner object is used to capture user input and is closed after use.
The input is 4 and the output is -2
   
4. Write a program to find the factorial of a number.
  
  
6. Write a program to find the power for a given base and exponent.
7. Write a program to find the Bangla season form a given month using
if/switch.
8. Write a program to find the largest number in a list of Array.
9. Write a program to sort some number in ascending order.
