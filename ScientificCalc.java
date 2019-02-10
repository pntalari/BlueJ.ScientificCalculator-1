import java.util.*;
import java.lang.Math;

/**
 * Write a description of class AdvancedCalc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScientificCalc extends Main
{

    /**
     * Constructor for objects of class ScientificCalc
     */
    public ScientificCalc()
    {

    }

    /* Take the user input to return the sin value */
    public double sin(double value)
    {
        double sinValue = 0;
       // double radians = Math.toRadians(value); 
        sinValue = Math.sin(value);
        return sinValue;
    }

    /* Take the user input to return the cos value */
    public double cos(double value)
    {
       // double radians = Math.toRadians(value); 
        double cosValue = Math.cos(value);
        return cosValue;
    }

    /* Take the user input to return the cos value */
    public double tan(double value)
    {
        //double radians = Math.toRadians(value); 
        double tanValue = Math.tan(value);
        return tanValue;
    }

    /* Take the user input to return the cos value */
    public double inverseSin(double value)
    {
       // double radians = Math.toRadians(value); 
        double iSinValue = Math.asin(value);
        return iSinValue;
    }

    /* Take the user input to return the cos value */
    public double inverseCos(double value)
    {
        //double radians = Math.toRadians(value); 
        double iCosValue = Math.acos(value);
        return iCosValue;
    }

    /* Take the user input to return the cos value */
    public double inverseTan(double value)
    {
       // double radians = Math.toRadians(value); 
        double iTanValue = Math.atan(value);
        return iTanValue;
    }

    /*Switch trig units mode (Degrees, Radians)
    switchUnitsMode() should rotate through the options
    switchUnitsMode(String mode) should set the trig units to the type given*/

    public void switchUnitsMode()
    {
        // return null;
    }

    public char switchUnitsMode(String mode)
    {
        char units= 'R';
        if (mode == "Degrees" || mode == "degrees")
        { 
            units = 'D';
        }
        else if (mode == "Radians" || mode == "radians")
        {
            units = 'R';
        }
        return units;
    }
}
 