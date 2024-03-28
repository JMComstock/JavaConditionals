package com.in28minutes.ifstatement.examples;

public class IfStatementRunner {

	public static void main(String[] args) {
		int i = 26;
		
		
		if(i == 25) {
			System.out.println("i = 25");
		} else {
			System.out.println("i != 25");
		}
		
		// i is 24 
		// i is 25
		// i is neither 24 or 25
		// once a condition is matched in a if - else if, 
		// the block on the true condition is run and the program skips the rest of the else if's and else 
		
		if(i ==24) {
			System.out.println("i = 24");
		} else if (i == 25) {
			System.out.println("i = 25");
		} else {
			System.out.println("i is neither 24 or 25");
		}
		
		
	}
}
