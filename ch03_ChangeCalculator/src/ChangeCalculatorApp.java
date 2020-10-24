import java.util.Scanner;

public class ChangeCalculatorApp {

	public static void main(String[] args) {
		final int CENTS_PER_QUARTER = 25;
		final int CENTS_PER_DIME = 10;
		final int CENTS_PER_NICKEL = 5;

		System.out.println("Welcome to the Change Calculator!");
		System.out.println();
		
		Scanner sc = new Scanner(System.in); 

		String choice = "y"; 
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter number of cents (0-99): ");
			int cents = sc.nextInt();
			
			int numQuarters = cents / CENTS_PER_QUARTER;
			
			cents = cents % CENTS_PER_QUARTER;
			
			int numDimes = cents / CENTS_PER_DIME;
			
			cents = cents % CENTS_PER_DIME;
			
			int numNickels = cents / CENTS_PER_NICKEL;
			
			cents = cents % CENTS_PER_NICKEL;
			
			int numPennies = cents;
			
			System.out.print("Quarters: " +numQuarters + ". ");
			System.out.print("Dimes: " +numDimes + ". ");
			System.out.print("Nickels: " +numNickels + ". ");
			System.out.print("Pennies: " +numPennies + ". ");
			
			System.out.println("Continue? (y/n)");
			choice = sc.next();
		}
	}
	
}
