/**
 * 
 */
package edu.cnm.deepdive.recursion;

/**
 * @author davem
 *
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String rawString = args[0].toLowerCase();
		String scrubString = rawString.replaceAll("[^a-z0-9]", "");
		System.out.println(isPalindrome(scrubString));
		// TODO Auto-generated method stub
		

	}//end main method
	
	public static boolean isPalindrome (String input){
		
		if (input.length() <= 1) {
			return true;			
		}  //end if
		if (input.charAt(0) != input.charAt(input.length() - 1)) {
			return false;
		} //end if
		return isPalindrome(input.substring(1,  input.length() - 1));
	
		
	} // end boolean method

} //end of class
