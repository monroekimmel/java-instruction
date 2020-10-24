
public class PersonManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the person manager!");

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			String custOrEmp = Console.getString("Create customer or employee?");
			
			boolean isValid = false;
			if (custOrEmp.equalsIgnoreCase("C") || custOrEmp.equalsIgnoreCase("E")) {
				isValid = true;
				
			}
			
			if (!isValid) {
				System.out.println("Error! This entry is required. Try again.");
				continue;
				
			}
			String firstName = Console.getString("First name:   ")
			String lastName = Console.getString("Last name:   ")
			
			if (custOrEmp.equalsIgnoreCase("C")) {
				String custNum = Console.getString("Customer number:   ")
						
				Customer customer = new Customer(firstName, lastName, custNum);
				
				System.out.println("You entered a new customer");
				System.out.println(customer);
			} else {
				String ssn = Console.getString("SSN:   ");
				
				Employee employee = new Employee(firstName, lastName, ssn);
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
		}
	}

}
