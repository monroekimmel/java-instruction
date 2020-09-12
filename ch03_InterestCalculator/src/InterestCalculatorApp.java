import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class InterestCalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Interest Calculator!");
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			//do the stuffs
		System.out.print("Enter loan amount: ");
		BigDecimal loanAmount = sc.nextBigDecimal();
		
		System.out.print("Enter interest rate: ");
		BigDecimal interestRate = sc.nextBigDecimal();
		
		//now for the maths
		BigDecimal interest = loanAmount.multiply(interestRate);
		interest.setScale(2, RoundingMode.HALF_UP);
		
		//display results
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
		NumberFormat percentFormatter = NumberFormat.getPercentInstance();
		percentFormatter.setMaximumFractionDigits(3);
		
		String loanAmountStr = currencyFormatter.format(loanAmount);
		String interestRateStr = percentFormatter.format(interestRate);
		String interestStr = currencyFormatter.format(interest);
		
		String outputMessage = 
				"Loan Amount: " + loanAmountStr + "\n" + 
				"Interest rate: " + interestRateStr + "\n" +
				"Interest: " + interestStr + "\n";
		
		System.out.println(outputMessage);
		
		//prompt to continue
		System.out.print("Continue? (y/n)");
		choice = sc.next();
		}

		System.out.println("Bye!");
	}

}
