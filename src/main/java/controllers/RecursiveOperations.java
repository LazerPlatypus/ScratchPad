package controllers;

public class RecursiveOperations {

	/**
	 * Takes an int (base) and raises it to the power of the exponent (power) recursively
	 * @param base - The number to be raised to a power
	 * @param power - The exponent (the power to which you raise the base)
	 * @return The product of raising the base to the power
	 */
	public static long toPower(int base, int power) {
		if (power < 0) {
			throw new IllegalArgumentException("Power cannot be less than 0");
		}
		if (power==0) {
			return 1;
		}
		long baseToHalfOfPower = toPower(base, power/2);
		if (power%2==1) {
			return base*baseToHalfOfPower*baseToHalfOfPower;
		}
		else {
			return baseToHalfOfPower*baseToHalfOfPower;
		}
	}
	
	/**
	 * Finds the greatest common factor (gcf) between two numbers using Euclid's recursive algorithm
	 * @param x - The first of two inputs into Euclid's algorithm
	 * @param y - The second of two inputs into Euclid's algorithm
	 * @return The greatest common factor of the two inputs
	 */
	public static int gcf(int x, int y) {
		return y == 0 ? x : gcf(y, x%y);
	}
	
	/**
	 * Analyzes a String for whether it is considered a palindrome. Analysis ignores all white space throughout the String.
	 * @param input - The String to be analyzed
	 * @return A boolean signifying whether the input is a palindrome (excluding white space)
	 */
	public static boolean isPalindrome(String input) {
		if (input==null) {
			return false;
		}
		input = input.trim().toLowerCase();
		boolean result = false;
		int lenOfInputMinusOne = input.length()-1;
		if (lenOfInputMinusOne < 1) {
			result = true;
		}
		else if (input.charAt(0)==input.charAt(lenOfInputMinusOne)) {
			result = isPalindrome(input.substring(1, lenOfInputMinusOne));
		}
		return result;
	}
	
	/**
	 * Using the Fibonacci sequence, calculates the value at the nth position. This method assumes that the sequence starts
	 * with positions 0 and 1 containing the values 0 and 1 respectively.
	 * @param n - The position of the value desired. Positions are 0-based
	 * @return The value at position n
	 * 0 
	 */
	public static int calculateFibonacciValue(int n) {
		if (n<0) {
			throw new IllegalArgumentException("n cannot be less than zero");
		}
		if (n>40) {
			throw new IllegalArgumentException("n is too big, it will overflow int");
		}
		int result = n;
		if (result>1) {
			result = calculateFibonacciValue(n-1)+calculateFibonacciValue(n-2);
		}
		return result;
	}
	
	public static long calculateFactorial(long n) {
		if (n<0) {
			throw new IllegalArgumentException("n cannot be less than zero");
		}
		if (n>19) {
			throw new IllegalArgumentException("n is too big, the result will overflow long");
		}
		long result = n;
		if (result>1) {
			result = result*calculateFactorial(result-1);
		}
		return result;
	}
	/*
	 * Recursive Function
	 * a(n) = n * a(n-1) * a(n-2) * a(n-3) * a(n-4) ... * a(n-n)
	 * a(n) = n * a(n-1)
	 * 0 = 0
	 * 1 = 1
	 * 2 = 2
	 * 3 = 6
	 * 4 = 24
	 * 5 = 120
	 * 6 = 720
	 * 
	 * Base Case(s)
	 * 1 = 1
	 * 0 = 1
	 * 
	 * Acceptable Inputs
	 * n where n >= 0
	 * 
	.*/
	/**
	 * Given a starting principal, monthly interest, and number of months, calculates the new principal given compound
	 * interest accrual over those months.
	 * @param principal - The starting amount
	 * @param monthlyInterest - The amount of interest accrued per month
	 * @param numberOfMonths - The number of months over which interest is accrued
	 * @return The sum total of original principal and all compounded interest value over the number of months specified
	 */
	public static double calculateCompoundInterest(double principal, float monthlyInterest, int numberOfMonths) {
		if (principal < 0) {
			throw new IllegalArgumentException("principal cannot be less than 0");
		}
		double result = principal;
		if (numberOfMonths>0) {
			result = calculateCompoundInterest(principal*monthlyInterest/100+principal, monthlyInterest, numberOfMonths-1);
		}
		return result;
	}
}
