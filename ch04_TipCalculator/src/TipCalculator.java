import java.math.BigDecimal;
import java.util.Scanner;

public class TipCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the tip calculator! \n");

		String choice;
		//all this is gonna print at least once
		do {
			System.out.println("Enter cost of meal: ");
			BigDecimal cost = sc.nextBigDecimal();
			BigDecimal tipIncrement = new BigDecimal("0.05");
			BigDecimal lastTip = new BigDecimal("0.25");
			
			//for loop
			//must use methods, not other things
			for (BigDecimal tipPercent = new BigDecimal("0.15");
					tipPercent.compareTo(lastTip) == -1;
					tipPercent = tipPercent.add(tipIncrement)) {
					BigDecimal tipAmount = cost.multiply(tipPercent);
					BigDecimal totalCost = cost.add(tipAmount);
					
					System.out.println(percent.format(tipPercent));
					Object currency;
					System.out.println("Tip amount: " + currency.format(tipAmount));
					System.out.println("Total amount: " + format(totalCost));
			}
					
			
			
		System.out.println("Continue? (y/n)");
		choice = sc.next();
		
		} while (choice.equalsIgnoreCase("y"));
	}

}
