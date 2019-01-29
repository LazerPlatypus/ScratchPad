package controllers;

public class RecursiveDemo {

	
	public static void run() {
		for (int i = 0; i < 4000; i++) {
			System.out.print(i);
			System.out.print(": ");
			System.out.println(fib(i));
		}
		
	}
	
	/*
	 * Recursive Function
	 * fub(n)=fib(n-1)fib(n-2)
	 * base case
	 * fib(0) = 0
	 * fib(1) = 0
	 * 
	 * Acceptable Inputs
	 * n for where n is an int and n >= 0
	 * 
	*/
	public static int fib(int n) {
		if (n<0) {
			throw new IllegalArgumentException("n cannot be less than zero");
		}
		if (n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		return fib(n-1)+fib(n-2);
	}
	
}
