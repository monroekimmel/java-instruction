import java.text.NumberFormat;
import java.util.Scanner;

public class InvoiceApp {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String choice = "y";

        while (!choice.equalsIgnoreCase("n")) {
            // get the input from the user
            System.out.print("Enter customer type (r/c/t): ");
            String customerType = sc.next();
            System.out.print("Enter subtotal:   ");
            double subtotal = sc.nextDouble();

            // get the discount percent
            double discountPercent = 0.0;
            if (customer.equalsIgnoreCase("r")) {
            case "r":
            case "R":
            	System.out.println("In case r or R");
                if (subtotal < 100) {
                    discountPercent = 0.0;
                } else if (subtotal >= 100 && subtotal < 250) {
                    discountPercent = .1;
                    // change made here
                } else if (subtotal >= 250 && subtotal < 500) {
                    discountPercent = .2;
                } else if (subtotal >= 500) {
                	discountPercent = .3;
                }
                break;
                if (customer.equalsIgnoreCase("c")) {
            case "c":
            case "C":
            	System.out.println("In case c or C");
            	// make it so customers always get a 20% discount
                    discountPercent = .2;
                break;
                // always put a colon with cases
                if (customer.equalsIgnoreCase("t")) {
            case "t":
            case "T":
            	System.out.println("In case t or T");
            	if (subtotal < 500) {
            		discountPercent = .4;
            	}
            	else if (subtotal >= 500) {
            		discountPercent = .5;
            	}
            	break;
            default:
            	System.out.println("In default case");
                discountPercent = .0;
                break;
      
            
//            switch(customerType) {
//                case "r":
//                case "R":
//                	System.out.println("In case r or R");
//                    if (subtotal < 100) {
//                        discountPercent = 0.0;
//                    } else if (subtotal >= 100 && subtotal < 250) {
//                        discountPercent = .1;
//                        // change made here
//                    } else if (subtotal >= 250 && subtotal < 500) {
//                        discountPercent = .2;
//                    } else if (subtotal >= 500) {
//                    	discountPercent = .3;
//                    }
//                    break;
//                case "c":
//                case "C":
//                	System.out.println("In case c or C");
//                	// make it so customers always get a 20% discount
//                        discountPercent = .2;
//                    break;
//                    // always put a colon with cases
//                case "t":
//                case "T":
//                	System.out.println("In case t or T");
//                	if (subtotal < 500) {
//                		discountPercent = .4;
//                	}
//                	else if (subtotal >= 500) {
//                		discountPercent = .5;
//                	}
//                	break;
                	//make it so that if there is no type there is no discount

            }

            // calculate the discount amount and round to 2 decimals
            double discountAmount = subtotal * discountPercent;
            discountAmount = Math.ceil(discountAmount * 100) / 100;

            // calculate the total
            double total = subtotal - discountAmount;

            // format and display the results
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            NumberFormat percent = NumberFormat.getPercentInstance();
            System.out.println(
                "Discount percent: " + percent.format(discountPercent) + "\n"
              + "Discount amount:  " + currency.format(discountAmount) + "\n"
              + "Total:            " + currency.format(total) + "\n");

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
    }
}