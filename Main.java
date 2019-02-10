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
        BasicCalc bCalc = new BasicCalc();
        disp.clearScreen();

        while (cont)
        {
            modeChoice = disp.getStringInput("Select mode, B:Basic or S:Scientific");
            operation = operation.toLowerCase();
            

            if (modeChoice.equals("B")|| modeChoice.equals("b"))
            {
                operation = disp.getStringInput("Choose the Operation to perform:+, - , *, /, pow, sqr, sqrt, iSign, inv");
                //disMode = disp.getStringInput("Choose the mode of result: Dec, Bin, Oct, Hex");
                num1 = disp.getIntegerInput("Enter a number:");
                if (operation.equals("sqr")||operation.equals("sqrt")||operation.equals("isign")||operation.equals("inv"))
                {
                    switch(operation)
                    {
                        case "sqr": result = bCalc.sqr(num1);
                        break;
                        case "sqrt": result = bCalc.sqrt(num1);
                        break;
                        case "isign": result = bCalc.iSign(num1);
                        break;
                        case "inv": result = bCalc.inv(num1);
                        break;
                    }
                   // finResult = sCalc.switchDisplayMode(disMode,result);
                    disp.println("The result of %3.2f %s is: %s \n", num1,operation,result);
                }
                else if (operation.equals("+")||operation.equals("-")||operation.equals("*")||operation.equals("/")||operation.equals("pow"))
                {
                    num2 = disp.getIntegerInput("Enter a second number:");
                    disp.getStringInput("");
                    switch (operation) 
                    {
                        case "+": result = bCalc.add(num1,num2);
                        break;
                        case "-": result = bCalc.sub(num1,num2);
                        break;
                        case "*": result = bCalc.mult(num1,num2);
                        break;
                        case "/": result = bCalc.div(num1,num2);
                        break;
                        case "pow": result = bCalc.powe(num1,num2);
                        break;

                    }
                    //finResult = sCalc.switchDisplayMode(disMode,result);
                    disp.println("The result of %3.2f %s %3.2f is: %s \n", num1,operation,num2,result);
                }

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
