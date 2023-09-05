package com.test.gradedProject2.util;

public class Constants {
	
	public static final String COMPANY = "testOrg";

	public static String[] DEPARTMENTS = new String[] {
			"Technical", "Admin", "Human Resources", "Legal"};
	

	public static String[] DEPARTMENTS_EMAIL = new String[] {
			"tech", "admin", "hr", "legal"};
	
	static char[] SYMBOLS = "^$*.[]{}()?-\"!@#%&/\\,><':;|_~`".toCharArray();
    static char[] LOWERCASE = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    static char[] UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    static char[] NUMBERS = "0123456789".toCharArray();
    static char[] ALL_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789^$*.[]{}()?-\"!@#%&/\\,><':;|_~`".toCharArray();

}
