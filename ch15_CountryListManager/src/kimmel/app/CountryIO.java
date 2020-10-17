package kimmel.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class CountryIO {
	private final String countriesFileName = "countries.txt";
	public ArrayList<String> getCountries() {
		ArrayList<String> countries = new ArrayList<>();
		
		try (BufferedReader in = new BufferedReader(new FileReader(countriesFileName))){
			String line = in.readLine();
			while (line != null) {
				countries.add(Line);
				line = in.readLine();
			}
		}catch (IOException e) {
			System.err.println("Caught IOException. Msg: " + e.getMessage());
		}
		return countries;
	}
	public boolean saveCountries(ArrayList<String> countries) {
		return true;
	}
}
