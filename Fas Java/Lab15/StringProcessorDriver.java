public class StringProcessorDriver {
	
	public static void main(String[] args) {
		String test1 = "hello";
		System.out.println();
		System.out.println(test1 + " reversed = " + StringProcessor.reverse(test1)); // should return elloh
		System.out.println("Expected: elloh");
		System.out.println();
		
		System.out.println("----------------------");
		System.out.println();
		String test2 = "navan";
		String test3 = "cavan";
		
		System.out.println(test2 + " is pallindrome = " + StringProcessor.isPallindrome(test2)); 	// should return true
		System.out.println("Expected: true");
		System.out.println();
		System.out.println(test3 + " is pallindrome = " + StringProcessor.isPallindrome(test3));	// should return false
		System.out.println("Expected: false");
		System.out.println();
		
		
		System.out.println("----------------------");
		
		String test4 = "hello";
		String test5 = "he110"; // has digit ones instead of ls
		String test6 = "1234";
		
		System.out.println(test4 + " is all letters = " + StringProcessor.isAllLetters(test4));	// should return true
		System.out.println("Expected: true");
		System.out.println();
		System.out.println(test5 + " is all letters = " + StringProcessor.isAllLetters(test5));	// should return false
		System.out.println("Expected: false");
		System.out.println();
		System.out.println(test6 + " is all letters = " + StringProcessor.isAllLetters(test6));	// should return false
		System.out.println("Expected: false");
		System.out.println();
		
		System.out.println("----------------------");
		
		System.out.println();
		
		String test7 = "Philip Woulfe";
		String test8 = "Ben O'Mara";
		String test9 = "Phi1ip Woulfe"; // has digit ones instead of ls
		String test10 = "Philip Thomas Woulfe";
		String test11 = "Philip  Thomas Woulfe";
		
		System.out.println(test7 + " is name = " + StringProcessor.isName(test7));// should return true
		System.out.println("Expected: true");
		System.out.println();
		System.out.println(test8 + " is name = " + StringProcessor.isName(test8));// should return true
		System.out.println("Expected: true");
		System.out.println();
		System.out.println(test9 + " is name = " + StringProcessor.isName(test9));// should return false
		System.out.println("Expected: false");
		System.out.println();
		System.out.println(test10 + " is name = " + StringProcessor.isName(test10));// should return true
		System.out.println("Expected: true");
		System.out.println();
		System.out.println(test11 + " is name = " + StringProcessor.isName(test11));// should return false
		System.out.println("Expected: false (because of double space)");
		System.out.println();
		
	}
}