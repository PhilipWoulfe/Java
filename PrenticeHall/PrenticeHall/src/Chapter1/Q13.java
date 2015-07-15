/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter1;

/**
 *
 * @author Phil
 */
public class Q13 {
    public static void main(String[] args)
    {
        Line cr = new Line();
        
        cr.cramer(3.4, 50.2, 2.1, 0.55, 44.5, 5.9);
        
        double x = cr.getX();
        double y = cr.getY();
        
        System.out.println("x = " + x + "\ny = " + y);
    }
}
