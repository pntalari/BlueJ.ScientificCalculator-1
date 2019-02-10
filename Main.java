import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        boolean cont = true;
        String modeChoice = "";
        String operation = "";
        double num1 = 0;
        double num2 = 0;
        double result = 0;

        System.out.println("Hello There, Welcome to my Calculator");
        Display disp = new Display();
        disp.clearScreen();

        while (cont)
        {
            modeChoice = disp.getStringInput("Select mode, B:Basic or S:Scientific");

            if (modeChoice.equals("B")|| modeChoice.equals("b"))
            {
                num1 = disp.getIntegerInput("Enter a number:");
                num2 = disp.getIntegerInput("Enter a second number:");
                operation = disp.getStringInput("Enter the Operation to perform:");
                switch (operation) 
                {
                    case "+": result = num1 + num2;
                    break;
                    case "-": result = num1 - num2;
                    break;
                    case "*": result = num1 * num2;
                    break;
                    case "/": result = num1 / num2;
                    break;
                    case "^": result = Math.pow(num1,num2);
                    break;
                }
                disp.getStringInput("The result of %s on %f %f is:", operation,num1,num2,result);

            }
            else if (modeChoice.equals("S")||modeChoice.equals("s"))
            {
                ScientificCalc sCalc = new ScientificCalc();
                switch (operation)
                {
                    case "sin": result = sCalc.sin(num1);
                    break;
                    case "cos": result = sCalc.cos(num1);
                    break;
                    case "tan": result = sCalc.tan(num1);
                    break;
                    case "asin": result = sCalc.inverseSin(num1);
                    break;
                    case "acos": result = sCalc.inverseCos(num1);
                    break;
                    case "atan": result = sCalc.inverseTan(num1);
                    break;
                }
                disp.getStringInput("The result of %s on %f is:", operation,num2,result);
            }
            else
            {
                disp.getStringInput("Please enter valid selection:");   
            }
            disp.clearScreen();
        }
    }
}
