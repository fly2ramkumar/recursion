package com.ds.recursion.string;

public class RemoveDuplicates {
	
	private static String removeDuplicates(String inputString) {
	
		if(inputString == null || inputString.isEmpty() || inputString.length() <=1) {
			return inputString;
		}
				
		
		char firstChar = inputString.charAt(0);
		char secondChar = inputString.charAt(1);
		
		if(firstChar == secondChar) {
			return firstChar + removeDuplicates(inputString.substring(2));	 
		} else {
			return firstChar + removeDuplicates(inputString.substring(1));
		}

	}
	
	public static void main(String[] args) {
		System.out.println(removeDuplicates("Hello World"));
		System.out.println(removeDuplicates("Thiss iss a testt"));
	}

}
