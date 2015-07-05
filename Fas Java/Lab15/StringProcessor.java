/*
Philip Woulfe
Fas Java 2014/12/15

Write a public class called StringProcessor.  Write a number of class methods
in your class.

> 	reverse() – takes in a string and returns a string which is the reversed version 
	of that string 
> 	isPalindrome() - takes in a string and returns a boolean (true or false) if the 
	string is a palindrome or not.  i.e., "noon" is a palindrome, it is spelled the 
	same forwards and backwards 
> 	isAllLetters() – takes in a string and returns a boolean (true or false) if the 
	string only contains letters or not.  i.e., passing in "Joe" will return true, 	
	passing in "Joe123" will return false
> 	isName() - takes in a string and returns a boolean (true or false) if the string 
	only contains letters or not.  i.e., passing in "Joe" will return true, passing in 
	"Joe123" will return false – the apostraphy ( ' ) used in many names e.g., 
	"O'Reilly" will be allowed.   One Space between each word is also allowed, 
	e.g., "John Paul O'Reilly" would return true.

Write at least one separate "driver" class to test each of the methods of your 
StringProcessor class.  Try to test each method well to make sure it is robust. 

Record the test cases for each method.  This would be used in your company's 
documentation, to record that adequate testing of your class took place.
*/

public class StringProcessor {
	
	// reverses input string
	public static String reverse(String str) {
		
		// declare variables
		String output = "";
		
		// trim input
		str = str.trim();
		
		// reverse str with a loop
		for (int i = str.length() - 1; i >= 0; i--) { 	// start at last character and count down
			output += str.charAt(i); 					// add characters from the end to the start of a new string 
		} // end for loop
		
		return output;
		
		
	}
	
	
	// checks if string is the same backwards and forwards
	public static boolean isPallindrome(String str) {
		
		// trim
		str = str.trim();
		
		return str.equals(StringProcessor.reverse(str)); // if str is equal to str reversed, return true
	}
	
	
	// checks that all characters in a string are letters
	public static boolean isAllLetters(String str) {
		
		// trim and uppercase
		str = str.trim();
		str = str.toUpperCase();
		
		boolean result = false;
		
		
		for (int i = 0; i < str.length(); i++) { 						// count through each index loaction of str starting at 0
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') { 			// if char is between A and Z
				result = true; 													// it is a letter
			} else { 														// otherwise 
				result = false;													// it is not
				break;															// break out of loop
			}
		} // end loop
		
		return result;
	}
	
	
	// checks that a string only has letters apostrophes and no more that on space between words
	public static boolean isName(String str) {
		
		// trim and uppercase
		str = str.trim();
		str = str.toUpperCase();
		
		boolean result = false;
		
		for (int i = 0; i < str.length(); i++) { // count through each index loaction of str starting at 0
		
			if (str.indexOf("  ") != -1) { 														// if a double space is found in the string
				result = false; 																	// there are too many spaces
				break;																				// break loop
			} else if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || str.charAt(i) == '\'' 
							|| str.charAt(i) == ' ') { 											// else if char is a letter or an apostrophy or a space
				result = true; 																		// it is part of a name
			} else { 																			// otherwise
				result = false;																		// it is not
				break; 																				// break out of loop
			}
		} // end loop
		
		return result;
	}
	
}