import java.util.*;
import java.lang.Math;
/**
 * Write a description of class BasicCalc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BasicCalc
{
    public double add(double num1,double num2)
    {
        double addValue = num1 + num2;
        return addValue;
    }

    public double sub(double num1,double num2)
    {
        double subValue = num1 - num2;
        return subValue;
    }

    public double mult(double num1,double num2)
    {
        double multValue = num1 * num2;
        return multValue;
    }

    public double div(double num1,double num2)
    {
        double divValue = num1 / num2;
        return divValue;
    }

    public double powe(double num1,double num2)
    {
        double poweValue = Math.pow(num1,num2);
        return poweValue;
    }

    public double sqr(double num1)
    {
        double sqrValue = Math.pow(num1, 2);
        return sqrValue;
    }

    public double sqrt(double num1)
    {
        double sqrtValue = Math.sqrt(num1);
        return sqrtValue;
    }

    public double iSign(double num1)
    {
        double iSignValue = num1 * -1;
        return iSignValue;
    }
    
        public double inv(double num1)
    {
        double invValue = 1/num1;
        return invValue;
    }
}