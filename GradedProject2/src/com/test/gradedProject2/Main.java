package com.test.gradedProject2;

import java.util.Scanner;

import com.test.gradedProject2.util.Constants;
import com.test.gradedProject2.util.CredentialService;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Enter you first name: ");
		Scanner sc = new Scanner(System.in);
		String firstName = sc.nextLine();
		System.out.println("Enter you last name: ");
		String lastName = sc.nextLine();
		System.out.println("Please enter the department from the following.");
		for (int i = 0 ; i < Constants.DEPARTMENTS.length; i++) {
			System.out.println((i + 1)+". "+Constants.DEPARTMENTS[i]);
		}
		int department = sc.nextInt();
		
		Employee employee = new Employee(firstName, lastName);
		CredentialService cred = new CredentialService();
		
		String email = cred.generateEmailAddress(employee, Constants.DEPARTMENTS_EMAIL[department - 1],
				Constants.COMPANY);
		String password = cred.generatePassword();
		
		cred.showCredentials(employee, email, password);
	}

}
