package com.revature.driver;
import java.util.Scanner;
import com.revature.beans.Validate;

public class Driver {

// Scanner to take in user input
	public static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		MainMenu();

	}
	
// Menu Switch case
	public static void MainMenu () {
		System.out.println("----------------------------------");
		System.out.println("What would you like to create?");
		System.out.println("----------------------------------");
		System.out.println("1) Human");
		System.out.println("2) Animal");
		
		// Store input in usable variable
		String reply = userInput.nextLine();

		// Check User error
		int checkedReply = 0;
		if (Validate.CheckInt(reply, "Please enter your response in whole number format.")) {
			checkedReply = Integer.parseInt(reply);
		}
		
	switch (checkedReply) {
	default: 
		MainMenu();
		break;
	case 1:
		break;
	case 2:
		break;	
	}
}
	
//

// Methods to return the average age of all creatures
public static int AverageAge (int a, int b) {
	return (a + b) / 2;
}

public static int AverageAge (int a, int b, int c) {
	return (a + b + c) / 3;
}

public static int AverageAge (int a, int b, int c, int d) {
	return (a + b + c + d) / 4;
}

// Loops through the array to find average
public static int AverageAge (int...v) {
	int avg = 0;
	for (int i : v) {
		avg += i;
	}
	
	return avg / v.length;
}
}

