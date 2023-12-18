package com.ds.recursion.numbers;

public class ModuloWithRecursion {
	
	private static int mod(int dividend, int divisor) {
		
		if (divisor == 0) {
            System.out.println("divisor cannot be 0");
            return -1;
        }
		
		if(dividend < divisor) {
			return dividend;
		}
				
		return mod(dividend - divisor, divisor);		
	}
	
	public static void main(String[] args) {
		System.out.println(mod(17, 3));
	}

}
