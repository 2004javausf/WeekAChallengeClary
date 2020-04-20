package com.revature.driver;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.beans.Animal;
import com.revature.beans.Human;
import com.revature.beans.Validate;

public class Driver {

// Scanner to take in user input
	public static Scanner userInput = new Scanner(System.in);
	
// Lists to store objects
	static List<Human> humans = new ArrayList<Human>();
	static List<Animal> animals = new ArrayList<Animal>();
	static List<Integer> ages = new ArrayList<Integer>();
	
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
		System.out.println("3) Average Human's Age");
		
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
		// Create a new person to add features to
		Human person = new Human();
		
		// Get name
		System.out.println("What is your humans name?");
		person.setName(userInput.nextLine());	
		
		// Get age
		System.out.println("\nWhat is " + person.getName() + "'s age?");
		String age = userInput.nextLine();
		if (Validate.CheckInt(age,"Please enter your response in whole number format.")) {
			person.setAge(Integer.parseInt(age));
		}else {person.setAge(0);}
		ages.add(person.getAge());
		
		// Get gender
		System.out.println("\nWhat is " + person.getName() + "'s gender?");
		person.setGender(userInput.nextLine());
		
		// Add new person
		humans.add(person);
		
		// Loop back to the menu
		System.out.println("\n\n\n\n\n");
		MainMenu();
		break;
		
	case 2:
		// Create a new animal to add features to
		Animal pet = new Animal();
		
		// Get name
		System.out.println("What is the animals name?");
		pet.setName(userInput.nextLine());
		
		// Get species
		System.out.println("What is " + pet.getName() + "'s species?");
		pet.setSpecies(userInput.nextLine());
		
		// Get color
		System.out.println("What is " + pet.getName() + "'s color?");
		pet.setColor(userInput.nextLine());
		
		// Add new animal
		animals.add(pet);
		
		// Loop back to the menu
	    System.out.println("\n\n\n\n\n");
		MainMenu();
		break;
		
	case 3:
		// Loop through the ages List and get the average
		int average = 0;
		for (int i : ages) {
			average += i;
		}
		System.out.println("\n" + average / ages.size());
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

