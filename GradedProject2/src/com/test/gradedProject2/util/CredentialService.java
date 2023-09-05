package com.test.gradedProject2.util;

import com.test.gradedProject2.Employee;

public class CredentialService {
	
	public String generateEmailAddress(Employee employee, String department, String companyName) {
		return employee.getFirstName()+ employee.getLastName() + "@" +department +"."+companyName + ".com";
	}

	public String generatePassword() {
		return PasswordUtils.getPassword(10);
	}
	
	public void showCredentials(Employee employee, String email, String password) {
		System.out.println("Dear "+employee.getFirstName() + ",your generated credentials are as follows");
		System.out.println("Email    --> "+ email);
		System.out.println("Password --> "+ password);
	}
}
