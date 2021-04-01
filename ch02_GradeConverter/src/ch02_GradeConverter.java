import java.util.Scanner;

public class ch02_GradeConverter {

	public static void main(String[] args) {
		//welcome message
		//RIGHT CLICK SCANNER
		
		System.out.println("Welcome to the letter grade converter!");
		Scanner sc = new Scanner(System.in);
				
		
		//get user input
		//while loop - loop while 'choice' == 'y'
		//note else if statement
		//basing off of lower bounds of grades
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
			System.out.print("Enter a numerical grade: ");
			int numericalGrade = sc.nextInt();
			String letterGrade = " ";
					
			if (numericalGrade >= 88) {
				letterGrade = "A";
			}
			else if (numericalGrade >= 80) {
				letterGrade = "B";
			}
			else if (numericalGrade >= 67) {
				letterGrade = "C";
			}
			else if (numericalGrade >= 60) {
				letterGrade = "D";
			}
			else {
				letterGrade = "F";
			}
			System.out.println("letter grade: "+letterGrade);
			System.out.println("Continue?");
			choice = sc.next();
		}

		//goodbye message
		
		System.out.println("Goodbye!");
	}

}
