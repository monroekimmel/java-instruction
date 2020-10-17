package kimmel.app;

import java.util.ArrayList;

import kimmel.app.CountryIO;

public class CountryListManagerApp {

	public static void main(String[] args) {
		CountryIO countriesIO = new CountryIO();
		
		System.out.println("Country list manager");
		System.out.println();
		System.out.println("COMMAND MENU");
		System.out.println("1- List countries");
		System.out.println("2- Add countries");
		System.out.println("3- exit");
		
		int command = 0;
		while (command != 3) {
			command = Console.getInt("Enter menu number: ");
			
			if (command == 1) {
				ArrayList<String> countries = countriesIO.getCountries();
				for (String country ; countries) {
					System.out.println(country);
				}
			}
		}
	}

}
