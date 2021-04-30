import java.util.Scanner;
import java.text.NumberFormat;

public class FutureValueWithMethodApp {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (!choice.equalsIgnoreCase("n")) {
            System.out.print("Enter monthly investment:   ");
            double monthlyInvestment = sc.nextDouble();
            System.out.print("Enter yearly interest rate: ");
            double interestRate = sc.nextDouble();
            System.out.print("Enter number of years:      ");
            int years = sc.nextInt();

            double monthlyInterestRate = interestRate / 12 / 100;
            int months = years * 12;

            double futureValue = calculateFutureValue(monthlyInvestment,
                    monthlyInterestRate, months);

            NumberFormat currency = NumberFormat.getCurrencyInstance();
            System.out.println("Future value:               "
                    + currency.format(futureValue));
            System.out.println();

            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
    }

    private static double calculateFutureValue(double monthlyInvestment,
            double monthlyInterestRate, int months) {
        double futureValue = 0.0;
        for (int i = 1; i <= months; i++) {
            futureValue = (futureValue + monthlyInvestment)
                    * (1 + monthlyInterestRate);
        }
        return futureValue;
    }
}