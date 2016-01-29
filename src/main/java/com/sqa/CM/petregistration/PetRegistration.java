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
	private static boolean hasRabies;
	private static char[] genders;
	private static Scanner scanner = new Scanner(System.in);

	/**
	 * Static Helper Method which asks user specified question and return the
	 * input to user.
	 *
	 * @return Input given from user.
	 */
	public static String getString(String question) {
		// Local variable to hold temporary number
		String input;
		// Ask the user a question to get relative input
		System.out.print(question);
		// Set the number based on what the user enters on their
		// keyboard
		input = scanner.nextLine();
		// Return input user has entered
		return input;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numPets = RequestInput.getInt("How many pets would you like to register? ");
		// Register number of pets chosen
		registerPets();
		// Display registered pets to the user
		displayPets();
		// Exit the system
		exitPetRegApp();

	}

	/**
	 *
	 */
	private static void displayPets() {
		// TODO Auto-generated method stub

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
	 * Method to register a bird into the system
	 *
	 * @return
	 */
	private static boolean registerBird() {
		// Local variables
		boolean willRegister;
		// Tell the user the price to register the bird
		System.out.println("To register a bird it is $60 a year.");
		// Set the willRegister local variable to what the helper method will
		// return for supplied question
		willRegister = RequestInput.getBoolean("Would you like to register the bird? ");
		// return the set variable for if the user will register the animal
		return willRegister;
	}

	/**
	 * Method to register a cat into the system
	 *
	 * @return
	 */
	private static boolean registerCat() {
		// Local variables
		boolean willRegister;
		// Tell the user the price to register the cat
		System.out.println("To register a cat it is $105 a year.");
		// Set the willRegister local variable to what the helper method will
		// return for supplied question
		willRegister = RequestInput.getBoolean("Would you like to register the cat? ");
		// return the set variable for if the user will register the animal
		return willRegister;
	}

	/**
	 * Method to register a dog into the system
	 *
	 * @return
	 */
	private static boolean registerDog() {
		// Local variables
		boolean willRegister;
		// Tell the user the price to register the dog
		System.out.println("To register a dog it is $120 a year.");
		// Set the willRegister local variable to what the helper method will
		// return for supplied question
		willRegister = RequestInput.getBoolean("Would you like to register the dog? ");
		// return the set variable for if the user will register the animal
		return willRegister;
	}

	/**
	 * Method to register a fish into the system
	 *
	 * @return
	 */
	private static boolean registerFish() {
		// Local variables
		boolean willRegister;
		// Tell the user the price to register the fish
		System.out.println("To register a fish it is $10 a year.");
		// Set the willRegister local variable to what the helper method will
		// return for supplied question
		willRegister = RequestInput.getBoolean("Would you like to register the fish? ");
		// return the set variable for if the user will register the animal
		return willRegister;
	}

	/**
	 * Method to register a horse into the system
	 *
	 * @return
	 */
	private static boolean registerHorse() {
		// Local variables
		boolean willRegister;
		// Tell the user the price to register the horse
		System.out.println("To register a dog it is $540 a year.");
		// Set the willRegister local variable to what the helper method will
		// return for supplied question
		willRegister = RequestInput.getBoolean("Would you like to register the horse? ");
		// return the set variable for if the user will register the animal
		return willRegister;
	}

	/**
	 * Method to register a reptile into the system
	 *
	 * @return
	 */
	private static boolean registerReptile() {
		// Local variables
		boolean willRegister;
		// Tell the user the price to register the reptile
		System.out.println("To register a reptile it is $85 a year.");
		// Set the willRegister local variable to what the helper method will
		// return for supplied question
		willRegister = RequestInput.getBoolean("Would you like to register the reptile? ");
		// return the set variable for if the user will register the animal
		return willRegister;
	}
	
	/**
	 * Method which iterates through loops setting pet value
	 */
	private static void registerPets() {
		// Setup variable to create continuous loop based on invalid pet type
		boolean hasInvalidPet = true;
		// Loop until valid pet type is entered
		while (hasInvalidPet) {
			// TODO Auto-generated method stub
			String type = RequestInput.getString("What type of pets do you have? ");
			switch (type) {
			case "dog":
				registerDog();
				hasInvalidPet = false;
				break;
			case "cat":
				System.out.println("Add a cat");
				hasInvalidPet = false;
				break;
			case "fish":
				System.out.println("Add a fish");
				hasInvalidPet = false;
				break;
			case "horse":
				System.out.println("Add a horse");
				hasInvalidPet = false;
				break;
			case "reptile":
				System.out.println("Add a reptile.");
				hasInvalidPet = false;
				break;
			case "bird":
				System.out.println("Add a bird.");
				hasInvalidPet = false;
				break;
			default:
				System.out.println("Invalid Animal.");
				break;

			}
		}
	}
}