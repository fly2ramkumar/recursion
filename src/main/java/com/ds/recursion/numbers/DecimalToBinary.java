package com.ds.recursion.numbers;

public class DecimalToBinary {

	private static int toBinary(int num) {
		
		
		if(num == 0)
			return 0;
		
		// 1 + 10 * (27/2) - 
		
		return num % 2 + 10* toBinary(num/2);
		
		// 11 + 0 + 0 + 1
	}
	
	public static void main(String[] args) {
		System.out.println(toBinary(27));
	}
}
