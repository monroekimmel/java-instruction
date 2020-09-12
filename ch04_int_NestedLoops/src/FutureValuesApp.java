import java.text.NumberFormat;

public class FutureValuesApp {

	public static void main(String[] args) {
		// get the formatters
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getCurrencyInstance();
		percent.setMinimumFractionDigits(1);
		
		// set the display monthly payment
		int monthlyInvestment = 100;
		System.out.println("Monthly investment: " + currency.format(monthlyInvestment) + "\n");
		
		// create header
		String table = **;
		String headerRow + "Year      ";
		
		for (double rate = 5.0; rate < 7.0; rate += 0.5) {
			headerRow += percent.format(rate / 100) + "      ";
			
		}

		table += headerRow + "\n";
		
		//loop thru the years
		for (int year = 1; year < 7; year ++) {
			//add year to the start of the row
			String row = year + "      ";
			
			//start nested loop
			for (double rate = 5.0; rate < 7.0; rate += 0.5) {
				int month = year * 12;
				double monthlyInterestRate = rate/12/100;
				
				double futureValue = 0.0;
						for (int i = 1; 1 <= months; i++)
						{futureValue = (futureValue + monthlyInterestRate) * (1 + monthlyInterestRate);
						}
						
						row += currency.format(futureValue) + "    ";
						}
			table += row "\n";
		}
		System.out.println(table);
	}

}
