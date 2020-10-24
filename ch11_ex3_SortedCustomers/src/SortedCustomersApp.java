import java.util.Arrays;

public class SortedCustomersApp {

    public static void main(String[] args) {
    	Customer[] customers = new Customer[3];
    	customers[0] = new Customer("person@gmail.com", "Person", "Man");
    	customers[1] = new Customer("anotherperson@gmail.com", "Person2", "Man2");
    	customers[2] = new Customer("athirdperson@gmail.com", "Person3", "Man3");
    	
    	Arrays.sort(customers);
    	//else if loop
    	for (Customer c : customers) {
    		System.out.println(c.getEmail() + " " + c.getFirstName() + " " + c.getLastName());
    	}
    }
}
