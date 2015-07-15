/*
 * (Science: day of the week) Zellerfs congruence is an algorithm developed by
 * Christian Zeller to calculate the day of the week. The formula is
 * h = ‘q +
 * 26(m + 1)
 * 10 + k +
 * k
 * 4 +
 * j
 * 4 + 5j. % 7
 * where
 * ¡ h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4:
 * Wednesday, 5: Thursday, 6: Friday).
 * ¡ q is the day of the month.
 * ¡ m is the month (3: March, 4: April, c, 12: December). January and February
 * are counted as months 13 and 14 of the previous year.
 * ¡ j is the century (i.e.,
 * year
 * 100
 * ).
 * ¡ k is the year of the century (i.e., year % 100).
 * Note that the division in the formula performs an integer division. Write a program
 * that prompts the user to enter a year, month, and day of the month, and
 * displays the name of the day of the week. Here are some sample runs:
 */
package Chapter3;

import java.util.Scanner;

/**
 *
 * @author Phil
 */
public class Q21 {
    public static void main(String[] args)
    {
        int year, month, day;
        String output;
        
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter year: (e.g. 2012):");
        year = sc.nextInt();
        
        System.out.print("Enter month: 1-12:");
        month = sc.nextInt();
        
        System.out.print("Enter day of month: 1-31:");
        day = sc.nextInt();
        
        // jan and feb are counted as 13th and 14th month of previous year
        if (month == 1 || month == 2)
        {
            month += 12;
            year--;
        }
        
        // centuary
        int j = year / 100;
        
        // year
        int k = year % 100;
        
        
        int result = (day + ((26 * (month + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        
        switch (result)
        {
            case 0: 
                output = "Saturday";
                break;
            case 1: 
                output = "Sunday";
                break;
            case 2: 
                output = "Monday";
                break;
            case 3:
                output = "Tuesday";
                break;
            case 4: 
                output = "Wednesday";
                break;
            case 5: 
                output = "Thursday";
                break;
            case 6:
                output = "Friday";
                break;
            default:
                output = "I dont know how you did that!";
                break;
        }
        
        System.out.println("Day of the week is " + output);
          
                    
          
    }
}
