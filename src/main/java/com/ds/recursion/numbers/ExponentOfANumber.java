package com.ds.recursion.numbers;

public class ExponentOfANumber {
	
	
	private static int calculateExponent(int base, int pow) {
		
		if(pow == 0)
			return 1;
		
		
		return base * calculateExponent(base, pow-1);		
	}
	
	public static void main(String[] args) {
		System.out.println(calculateExponent(2, 3));
	}
	
}