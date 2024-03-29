package com.in28minutes.ifstatement.examples;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Number 1: ");
		int number1 = scanner.nextInt();
		
		System.out.println("Enter Number 2");
		int number2 = scanner.nextInt();
		
		System.out.println("Choose an operation" + "\n"
				+ "1 - Add" + "\n"
				+ "2 - Subtract" +"\n"
				+ "3 - Divide" + "\n"
				+ "4 - Multiply");
		int number3 = scanner.nextInt();
		System.out.println("The first number you picked is: " + number1);
		System.out.println("The second number you picked is: " + number2);
		System.out.println("The choice you picked is: " + number3);
		
		performOperationUsingSwitch(number1, number2, number3);
	}

	private static void performOperationUsingNestedIfElse(int number1, int number2, int number3) {
		if(number3 == 1) {
			int sum = number1 + number2;
			System.out.println(number1 + " + " + number2 + " = " + sum);
		} else if (number3 == 2) {
			int difference = number1 - number2;
			System.out.println(number1 + " - " + number2 + " = " + difference);
		} else if (number3 == 3) {
			int quotient = number1 / number2;
			System.out.println(number1 + " / " + number2 + " = " + quotient);
		} else if (number3 == 4) {
			int product = number1 * number2;
			System.out.println(number1 + " * " + number2 + " = " + product);
		} else {
			System.out.println("You did not choose a number from 1 to 4 ...");
		}
	}
	
	private static void performOperationUsingSwitch(int number1, int number2, int number3) {
		
		switch(number3) {
		case 1: 
			int sum = number1 + number2;
			System.out.println(number1 + " + " + number2 + " = " + sum);
			break;
		case 2:
			int difference = number1 - number2;
			System.out.println(number1 + " - " + number2 + " = " + difference);
			break;
		case 3:
			int quotient = number1 / number2;
			System.out.println(number1 + " / " + number2 + " = " + quotient);
			break;
		case 4:
			int product = number1 * number2;
			System.out.println(number1 + " * " + number2 + " = " + product);
			break;
		default : 
			System.out.println("You did not choose a number from 1 to 4 ...");
			break;
		}
	}
}
