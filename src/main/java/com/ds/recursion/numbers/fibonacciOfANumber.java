package com.ds.recursion.numbers;

public class fibonacciOfANumber {
	
	private static int fibonacci(int num) {
		
		if(num <= 1)
			return num;
		
		return  fibonacci(num-1) + fibonacci(num-2);
		
	}

	public static void main(String[] args) {
		int input = 5;
        System.out.println("Fibonacci sequence for the first " + input + " elements is:");

        int i = 0;
        while (i <= input) {
            System.out.print(fibonacci(i) + " ");
            i++;
        }
	}
	
}
