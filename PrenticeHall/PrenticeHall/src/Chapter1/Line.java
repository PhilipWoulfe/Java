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
public class Line {
    private double x, y;
    
    public double getX()
    {
        return x;
    }
    
    public double getY()
    {
        return y;
    }
    
    
    // solve linear equation
    public void cramer(double a, double b, double c, double d, double e, double f)
    {
        x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        y = (( a * f) - (e * c) ) / ((a * d) - (b * c));        
    }
}
