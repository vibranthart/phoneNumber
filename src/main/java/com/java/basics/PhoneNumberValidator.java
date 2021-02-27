package com.java.basics;

import java.util.Scanner;


public class PhoneNumberValidator {
    //Create Scanner object as instance variable
	static Scanner sc = new Scanner(System.in);
	
    public static void main(String[] args) {
        //call the functions in the required sequence
    	
    	PhoneNumberValidator validate = new PhoneNumberValidator();
    	String string = validate.getInput();
    	int num = validate.validatePhoneNumber(string);
    	validate.displayResult(num);
    	validate.closeScanner();
    }

    public String getInput() {
        return sc.nextLine();
    }

    public void displayResult(int result) {
        //displays the result
    	if(result == 0 || result == -1)
    	{
    		System.out.println("INVALID");
    	}
    	else
    		System.out.println("VALID");
    }

    public int validatePhoneNumber(String input) {
    	int numCount = 0;
    	String specialCharacterString = "!@#$%&*()'+,./:;<=>?[]^_`{|}"; // list of special characters without the dash
    	if(input == null)
    	{
    		return -1;
    	}
    	else if(input != null)
    	{
    	
	        for(int i = 0; i < input.length();i++)
	        {
	        	if(Character.isLetter(input.charAt(i)) == true)
	        	{
	        		return 0;
	        	}
	        	
	        	if(specialCharacterString.contains(Character.toString(input.charAt(i))))
	        	{
	        		return 0;
	        	}
	        	
	        }
	        
	        for(int i = 0; i < input.length();i++)
	        {
	        	if(Character.isDigit(input.charAt(i)) == true)
	        	{
	        		numCount++;
	        	}
	        }
	        
	        if(numCount < 10 || numCount > 10)
	        {
	        	return 0;
	        }
    	}
    	
    	return 1;
    }
    
    public void closeScanner(){
        //close the Scanner object
    	sc.close();
    }
}
