package edu.cnm.deepdive.recursion;

import java.math.BigInteger;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	} //end main method
	
	public static BigInteger fibNumber(int n) {
		if (n <=0) {
			return BigInteger.ZERO;			
		} //end if
		if (n == 1) {
			return BigInteger.ONE;	
		} //end if
		return fibNumber(n-1).add(fibNumber(n-2));
		
	} //end fibNumber method

} // end Fibonacci class
