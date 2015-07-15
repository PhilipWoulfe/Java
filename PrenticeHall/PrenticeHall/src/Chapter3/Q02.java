/*
 * (Game: add three numbers) The program in Listing 3.1, AdditionQuiz.java, generates
 * two integers and prompts the user to enter the sum of these two integers.
 * Revise the program to generate three single-digit integers and prompt the user to
 * enter the sum of these three integers.
 */
package Chapter3;

import java.util.Scanner;

/**
 *
 * @author Phil
 */
public class Q02 {
    public static void main(String[] args)
    {
        // generate three random numbers
        int num1 = (int) (Math.random() * 100);
        int num2 = (int) (Math.random() * 100);
        int num3 = (int) (Math.random() * 100);
        
        int answer;
        
        Scanner sc = new Scanner(System.in);
        
        do
        {
            
        
            // Prompt user to enter answer
            System.out.print(num1 + " + " + num2 + " + " + num3 + " = ");
        
            answer = sc.nextInt();
        
        }
        while(answer != num1 + num2 + num3);
        
        System.out.println("Well done!");
    }
}
