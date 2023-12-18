package com.ds.recursion.numbers;

public class CheckPrimeNumber {
	
	private static boolean isPrime(int num, int i) {
		
		System.out.println("num - "+num+" i - "+ i);
		
		if(num == 2)
			return true;
		
		if(i > num/2)
			return true;
		
		if(num % i == 0) {
			return false;
		}
		
		return isPrime(num, i+1);
		
	}
	
	public static void main(String[] args) {
		System.out.println(isPrime(9, 2));
	}

}
