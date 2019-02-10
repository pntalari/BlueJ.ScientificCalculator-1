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
        String units = "";
        String disMode = "";
        String finResult = "";
        double num1 = 0;
        double num2 = 0;
        double result = 0;

        System.out.println("Hello There, Welcome to my Calculator");
        Display disp = new Display();
        ScientificCalc sCalc = new ScientificCalc();
        disp.clearScreen();

        while (cont)
        {
            modeChoice = disp.getStringInput("Select mode, B:Basic or S:Scientific");

            if (modeChoice.equals("B")|| modeChoice.equals("b"))
            {
                num1 = disp.getIntegerInput("Enter a number:");
                num2 = disp.getIntegerInput("Enter a second number:");

                disp.getStringInput("");
                operation = disp.getStringInput("Choose the Operation to perform:+,-,*,/,^"); 
                disMode = disp.getStringInput("Choose the mode of result: Dec, Bin, Oct, Hex");

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
                    case "sqr": result = num1 * num1;
                    break;
                }
                finResult = sCalc.switchDisplayMode(disMode,result);
                disp.println("The result of %3.2f %s %3.2f is: %s \n", num1,operation,num2,finResult);
            }

            else if (modeChoice.equals("S")||modeChoice.equals("s"))
            {
                units = disp.getStringInput("Enter the trig units of mode: D for Degrees or R for Radians");

                num1 = disp.getIntegerInput("Enter a number:");
                disp.getStringInput("");

                operation = disp.getStringInput("Choose the Operation to perform: sin, cos, tan, asin, acos, atan");
                disMode = disp.getStringInput("Choose the mode of result: dec, bin, oct, hex");
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
                if (units.equals("R") || units.equals("r"))
                { 
                    result = sCalc.switchUnitsMode(units, num1);
                }
                finResult = sCalc.switchDisplayMode(disMode,result);
                disp.getStringInput("The result of %s on %3.2f is: %s \n", operation,num1,finResult);
            }

            else
            {
                disp.getStringInput("Please enter valid selection:");   
            }

        }
        disp.clearScreen();
    }
}
