package ch05_ins_Calculator;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String choice = null;
		
		do {
			
			System.out.print("Enter first operand: ");
			int operand1 = sc.nextInt();
			System.out.print("Enter second operand: ");
			int operand2 = sc.nextInt();
			System.out.println("Enter operation (+ - * /) ");
			String operation = sc.next();
			
			Object answer;
			switch (operation) {
			case "+":
				answer = sum(operand1,operand2);
				break;
			} case "-":
				answer = 
			
			System.out.println("The answer is " + answer);
			
			System.out.println("Continue? (y/n");
		} while (choice.equalsIgnoreCase("y"));
	
	private static int sum(int op1, int op2);
	System.out.println("In sum method");
	
	int result = op1 + op2;
	
	return result;
}

	private static Object sum(int operand1, int operand2) {
		// TODO Auto-generated method stub
		return null;
	}
}
