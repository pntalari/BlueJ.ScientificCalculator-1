
/**
 * Write a description of class BonusCalc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BonusCalc
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class BonusCalc
     */
    public BonusCalc()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double factorial(double num1)
    {
        double result = 1;
        for (double i = 1; i<= Math.abs(num1) ;i++)
        {
            result = result * i;
        }
        
        if( num1 >=0) {
            return result;
        } else{ return result * -1;}
        
    }

    public double logTen(double num1)
    {
        double result = Math.log10(num1);
        return result;
    }
    
    public double tenX(double num1)
    {
        double result = Math.pow(10,num1);
        return result;
    }

    public double eTox(double num1)
    {
        double result = Math.exp(num1);
        return result;
    }

    public double ln(double num1)
    {
        double result = Math.log(num1);
        return result;
    }
}
