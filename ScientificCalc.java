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

    //User should enter mode = 'S' to switch to scientific mode operation
    /*Switch display mode (binary, octal, decimal, hexadecimal)
    switchDisplayMode() should rotate through the options
    switchDisplayMode(String mode) should set the display to the mode given
     */
    public String switchDisplayMode(String mode, double result)
    {
        String disMode = mode;
        String convRes = "";
        switch (disMode)
        {
            case "oct": convRes = Integer.toOctalString((int)result);
            break;
            case "hex": convRes = Integer.toHexString((int)result);
            break;
            case "bin": convRes = Integer.toBinaryString((int)result);
            break; 
        }
        return convRes;
    }

    public void switchDisplayMode()
    {
       // return result;
    }

    /*Switch trig units mode (Degrees, Radians)
    switchUnitsMode() should rotate through the options
    switchUnitsMode(String mode) should set the trig units to the type given*/
    public void switchUnitsMode()
    {
        // return null;
    }

    public double switchUnitsMode(String units, double result)
    {
        double deg = 0;
        deg = result*Math.PI/180;
        return deg;
    }

    /* Take the user input to return the sin value */
    public double sin(double value)
    {
        double sinValue = 0;
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

}
 