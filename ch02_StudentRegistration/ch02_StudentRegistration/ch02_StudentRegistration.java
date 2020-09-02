package ch02_StudentRegistration;

import java.util.Scanner;

public class ch02_StudentRegistration {

	public static void main(String[] args) {
		//welcome message
		//define scanners, right click scanner for that easy shit
		System.out.println("Student Registration Form");
		Scanner sc = new Scanner(System.in);
	
		//get user input, must ask user input BEFORE
		//now use scanners
		// println enters a new line and print is on the same line
		System.out.print("Enter first name: ");
		String firstName = sc.next();
		System.out.print("Enter last name: ");
		String lastName = sc.next();
		System.out.print("Enter year of birth: ");
		int Year = sc.nextInt();
		
		//biz logic
		String tempwd = firstName + "*" + Year; 
		
		//display layout
		System.out.println("Welcome "+firstName+" "+lastName+"!");
		System.out.println("Your registration is complete.");
		System.out.println("Your temporary password is: "+tempwd+"!");
		
		//goodbye message
		System.out.println("Bye!");
	}
}
