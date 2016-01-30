/**
 *   File Name: PetRegistration.java<br>
 *
 *   Mallapre, Christian<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Jan 27, 2016
 *
 */

package com.sqa.CM.petregistration;

import java.util.Scanner;

import com.sqa.CM.util.helper.RequestInput;

/**
 * PetRegistration //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Mallapre, Christian
 * @version 1.0.0
 * @since 1.0
 *
 */
/*
 * Create an application which registered a local pet into the pet data system.
 * The application should ask how many pets they would like to register. For
 * each pet they should be asked what type(dog,cat,fish,bird,reptile,or horse).
 * If the type is not a valid registerable pet it should let the user know. If
 * it is,it should echo the price to register the pet for 1 year and confirm
 * price with user. (Use a switch statement).If the user decides to follow
 * through with the registration process, they should than enter the pets
 * Name(String),Address(String),Age(int), Whether they have a Rabies
 * shot(boolean),Yearly Pet Fees(double),and Gender(char). The number of pets
 * that will be entered into the array should be determined at the start of the
 * application. Upon exiting the registered pet details should be echoed to the
 * user.Good Luck!
 */

public class PetRegistration {

	// Declare class static variables
	private static int numPets;
	private static String[] types;
	private static String[] names;
	private static String[] addresses;
	private static int[] ages;
	private static boolean[] hasRabies;
	private static double[] petFees;
	private static char[] genders;
	private static Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Register number of pets chosen
		registerPets(RequestInput.getInt("How many pets would you like to register? "));
		// Display registered pets to the user
		displayPets();
		// Exit the system
		exitPetRegApp();

	}

	/**
	 *
	 */
	private static void displayPets() {
		// Iterate types array for Displaying of Pets
		if (types != null) {
			// Iterate types array and display strings
			for (int i = 0; i < types.length; i++) {
				System.out.println("Animal: " + types[i] + " - " + names[i]);
				System.out.println("\tAge: " + ages[i]);
				System.out.println("\tGender: " + genders[i]);
				System.out.println("\tFees: " + petFees[i]);
				System.out.println("\tHas Rabies shot: " + hasRabies[i]);
				System.out.println("\tAddress: " + addresses[i]);
			}
		} else {
			// Let user know they have not registered any pets
			System.out.println("You have not registered any animals");
		}
	}

	/**
	 *
	 */
	private static void exitPetRegApp() {
		// TODO Auto-generated method stub
		scanner.close();
		System.out.println("Thank you for using the Register Pets Application!\n Good Bye.");
	}

	/**
	 * Method which asks user how many pets they would like to register into the
	 * system and return back that number
	 */
	private static int getNumRegPets() {
		int numPets;
		while (true) {
			try {
				// Ask the user how many pets they would like to register
				System.out.print("How many pets would you like to register? ");
				// Set the number of pets based on what the user enters on their
				// keyboard
				numPets = Integer.parseInt(scanner.nextLine());
				// Break out of the infinite loop
				break;
			} catch (NumberFormatException e) {
				// Output to the user that the number is not valid
				System.out.println("You have not entered a valid number.");
				// Continue the infinite loop to get a valid number conversion
				continue;
			}
		}
		// Return number of pets user has entered
		return numPets;
	}

	/**
	 *
	 */
	private static void registerAnimal(String type, double regPrice) {
		// Local variables
		boolean willRegister;

		// Tell the user the price to register the dog
		System.out.println("To register a " + type.toUpperCase() + " it is $" + regPrice + " a year.");
		// Set the willRegister local variable to what the helper method will
		// return for supplied question
		willRegister = RequestInput.getBoolean("Would you like to register the " + type.toUpperCase() + "?");
		// If the user has requested to register the pet
		if (willRegister == true) {
			// Add the type of animal being registered to the types array
			types = RequestInput.addStringElement(types, type);
			// else they did not want to register their pet
		} else {
			// Give them a message noting they won't be registering it
			System.out.println("Sorry to hear you do not want to register your " + type.toUpperCase());
		}
	}

	/**
	 * @param numPets
	 *
	 */
	private static void registerPets(int numPets) {
		// Register number of pets based on
		for (int i = 0; i < numPets; i++) {
			// Register Pets
			validatePetRegistration();
		}
		requestAnimalDetails();
	}

	/**
	 *
	 */
	private static void requestAnimalDetails() {
		names = new String[types.length];
		addresses = new String[types.length];
		genders = new char[types.length];
		ages = new int[types.length];
		hasRabies = new boolean[types.length];
		petFees = new double[types.length];
		// Request details for all animal inside the types array
		for (int i = 0; i < types.length; i++) {
			// Let the user know what they will be entering into the system
			System.out.println(
					"It seems you are registering a " + types[i] + ", could you please provide the following details");
			// Capture the name of the animal inside of the names array
			names[i] = RequestInput.getString("Please provide the " + types[i].toLowerCase() + "'s name: ");
			genders[i] = RequestInput.getChar("What is the animal's gender: ", 'M', 'm', 'F', 'f');
			ages[i] = RequestInput.getInt("How old is " + names[i].toLowerCase() + " :");
			petFees[i] = RequestInput.getDouble("How much is " + names[i] + " cost you per year?");
			hasRabies[i] = RequestInput.getBoolean("Does your " + types[i] + " has a Rabies shot?");
			addresses[i] = RequestInput.getString("Finally, can you please provide a valid mailing address: ");
		}

	}

	/**
	 * Method which iterates through loops setting pet value
	 */
	private static void validatePetRegistration() {
		// Setup variable to create continuous loop based on invalid pet type
		boolean hasInvalidPet = true;
		// Loop until valid pet type is entered
		while (hasInvalidPet) {
			// TODO Auto-generated method stub
			String type = RequestInput.getString("What type of pets do you have? ");
			switch (type.toLowerCase()) {
			case "dog":
				registerAnimal(type, 120.00);
				hasInvalidPet = false;
				break;
			case "cat":
				registerAnimal(type, 110.00);
				hasInvalidPet = false;
				break;
			case "fish":
				registerAnimal(type, 5.00);
				hasInvalidPet = false;
				break;
			case "horse":
				registerAnimal(type, 550.00);
				hasInvalidPet = false;
				break;
			case "reptile":
				registerAnimal(type, 30.00);
				hasInvalidPet = false;
				break;
			case "bird":
				registerAnimal(type, 20.00);
				hasInvalidPet = false;
				break;
			default:
				System.out.println("Invalid Animal.");
				break;

			}
		}
	}
}