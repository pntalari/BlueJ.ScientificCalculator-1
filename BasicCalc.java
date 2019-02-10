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
    public static void main(String[] args)
    {
        double numberOne = 0;
        double numberTwo = 0;
        //String operator = "";
        double result= 0.0;
        Scanner scanObject = new Scanner(System.in);
        //String operation = "";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        numberOne = scan.nextDouble() ;
        System.out.println("Enter second number");
        numberTwo = scan.nextInt();
        System.out.println("What operation?");
        System.out.println("( + ) ( - ) ( * ) ( / ) ( ^ ) ( sqr ) ( sqrt )");
        //operation = scan.next();
        String operator = scanObject.next();//.charAt(0);

        
        // System.out.println(result);

        //operator = scan.next().charAt(0);
        String s = "";
        switch (operator) {
            case "+": result = numberOne + numberTwo;
            break;
            case "-": result = numberOne - numberTwo;  
            break;
            case "*": result = numberOne * numberTwo;  
            break;
            case "/": result = numberOne / numberTwo;  
            break;
            case "^": result = Math.pow (numberOne,numberTwo);
            break;
            case "sqrt": result = Math.sqrt(numberOne);
            break;
            //case "sqr" :result = (numberOne+ (numberTwo / numberOne)) / 2;
            //break;
            //case "isign" : result = numberOne * -1;
            //break;
        }System.out.println(numberOne+" "+operator+" "+numberTwo+" = "+result);
    }

}
// instance variables - replace the example below with your own

