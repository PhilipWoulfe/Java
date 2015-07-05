/* 
Philip Woulfe
Fas Java 2014/11/26


*/

public class L9Q3DetermineOutput {
	
	public static void main(String[] args) {
		
		int a = 5, b = 6, c = 7, d = 4;
		System.out.println(a++ + "\t" + b + c);
		c += 3;
		System.out.println((a + ++b) + "\t" + c + d);
		a--; ++d;
		System.out.print(d % ++c);
		d -=3;
		System.out.print("\t" + a + b + (c + d));
	}
}