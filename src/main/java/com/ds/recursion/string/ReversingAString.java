package com.ds.recursion.string;

public class ReversingAString {
	
	// "Hello World"
	
	private static String reverse(String inputString) {
		
		if(inputString == null || inputString.isEmpty()) {
			return "";
		}
		
		// custom implementation
		// return inputString.charAt(inputString.length() -1) + reverse(inputString.substring(0, inputString.length() -1));	
		
		//educative
		return reverse(inputString.substring(1)) + inputString.charAt(0);
	}

	public static void main(String[] args) {
		System.out.println(reverse("Hello World"));
	}
}
