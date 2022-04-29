package com.bridgelabz.regex;

import java.util.Scanner;

/*
 * author Rohit
 * valid First Name - First name starts with Cap and has minimum 3 characters
 */
public class RegexMain {

	public static void main(String[] args) {
		System.out.println("-----Welcome message to user registration program------");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		// Create object of ValidateUserRegistration class
		ValidateUserRegistration validate = new ValidateUserRegistration();

		validate.validateFirstName("Rohit");
		
		validate.validateFirstName("rohit");
		
		System.out.println("Enter First name: ");
		String firstName = sc.nextLine();
		// method call to validate user first name
		validate.validateFirstName(firstName);
	}

}
