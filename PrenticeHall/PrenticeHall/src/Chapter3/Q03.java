/*
 * (Algebra: solve 2 * 2 linear equations) A linear equation can be solved using
 * Cramer’s rule given in Programming Exercise 1.13. Write a program that prompts
 * the user to enter a, b, c, d, e, and f and displays the result. If ad - bc is 0, report
 * that “The equation has no solution.”
 */
package Chapter3;

import Chapter1.Cramer;
import java.util.Scanner;
/**
 *
 * @author Phil
 */
public class Q03 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Cramer cr = new Cramer();
        
        String output;
        
        // prompt user for input
        System.out.println("Enter a, b, c, d, e, f:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();
        
        
        if (a * d - b * c == 0)
        {
            output = "The equation has no solution!";
        }
        else {
            cr.cramer(a, b, c, d, e, f);
        
            double x = cr.getX();
            double y = cr.getY();
            
            output = " x is " + x + " and y is " + y;
        }
        
        System.out.println(output);
        
        
        
    }
}


