import java.util.Scanner;

// FizzBuzz Problem
// -----------------------------------------------------------------
// 1. Enter a number.
// 2. If the number is divisible by 5, print "Fizz".
// 3. If the number is divisible by 3, print "Buzz".
// 4. If the number is divisible by both 5 and 3, print "FizzBuzz."
// 5. If the number is not divisible by 5 or 3, print the number."
// -----------------------------------------------------------------

public class Main {

	public static void main(String[] args) {
		byte DIVISIBLE_BY_5 = 5;
		byte DIVISIBLE_BY_3 = 3;
		Scanner scanner = new Scanner(System.in);
		
		// Get the number from the user
		int userNumber = getNumber(scanner);
		
		// Check divisibility of number
		// Always check most specific case first before checking generic cases*
		if (checkDivisibility(userNumber, DIVISIBLE_BY_5) && (checkDivisibility(userNumber, DIVISIBLE_BY_3))) {
			System.out.println("FizzBuzz");
		} else if (checkDivisibility(userNumber, DIVISIBLE_BY_5)) {
			System.out.println("Fizz");
		} else if (checkDivisibility(userNumber, DIVISIBLE_BY_3)) {
			System.out.println("Buzz");
		} else {
			System.out.println(userNumber);
		}
		
		// Close scanner
		scanner.close();
	}
	
	public static int getNumber(Scanner scanner) {
		System.out.print("Number: ");
		return scanner.nextInt();
	}
	
	public static boolean checkDivisibility(int userNumber, byte divisibleNumber) {
		return (userNumber % divisibleNumber == 0);	
	}
}
