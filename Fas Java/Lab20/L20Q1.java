/*
1. Find the daily High temperature for the last seven days.  

2. Create a standard one-dimentional array and enter each day’s temperature 

into the array.   It should contain seven elements when you are done.

3. Create an ArrayList and enter the same seven temperatures into it.

4. Use both the standard array and the ArrayList (in separate calculations / 

separate programs if you wish) to find the average temperature over that time.

5. Print each value to standard out.

6. Ensure the you have calculated the same value from each array type.

 Ensure that you are comfortable with using arrays.  What is valid and not valid 

syntax.

 Ensure that you are comfortable with using ArrayList and all its important 

methods.
*/
import java.util.ArrayList;
public class L20Q1 {
	
	public static void main(String[] args) {
		
		
		int[] temp = {11, 6, 3, 4, 5, 2, 5};
		
		ArrayList<Integer> tempList = new ArrayList<Integer>();
		tempList.add(11);
		tempList.add(6);
		tempList.add(3);
		tempList.add(4);
		tempList.add(5);
		tempList.add(2);
		tempList.add(5);
		
		System.out.printf("Array Average = %.2f\nArrayList Average = %.2f", average(temp), average(tempList));
		
	}
	
	public static double average(int[] iArray){
		int sum = 0;
		for (int i: iArray) {
			sum += i;
		}
		return sum / (double)(iArray.length);
	}
	
	public static double average(ArrayList<Integer> iArray) {
		int sum = 0;
		for (int i = 0; i < iArray.size(); i++) {
			sum += iArray.get(i);
		}
		return sum / (double)(iArray.size());
	}
}