import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Display
{
    protected final Scanner scanner;
    protected final PrintStream out;

    public Display() 
    {
        this(System.in, System.out);
    }

    public Display(InputStream inputStream, OutputStream outputStream) 
    {
        this(new Scanner(inputStream), new PrintStream(outputStream));
    }

    public Display(Scanner scanner, PrintStream printStream) 
    {
        this.scanner = scanner;
        this.out = printStream;
    }

    /**
     * @param val  : text to display on console
     * @param args : optional arguments to send for string formatting
     */
    public void print(String val, Object... args) 
    {
        out.format(val,args);
        //Console.format(val, args);
    }

    /**
     * @param val  : text to display on console
     * @param args : optional arguments to send for string formatting
     */
    public void println(String val, Object... args) {
        out.format(val,args);
    }

    public void clearScreen() 
    {  
        println("\033[H\033[2J");  
        System.out.flush();  
    } 

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as String
     */
    public String getStringInput(String prompt, Object... args) {
        println(prompt,args);
        return scanner.nextLine();
    }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as integer
     */
    public Integer getIntegerInput(String prompt, Object... args) {
        println(prompt,args);
        return scanner.nextInt();
    }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as double
     */
    public Double getDoubleInput(String prompt, Object... args) {
        println(prompt,args);
        return scanner.nextDouble();
    }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as float
     */
    public Float getFloatInput(String prompt, Object... args) {
        println(prompt,args);
        return scanner.nextFloat();
    }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as long
     */
    public Long getLongInput(String prompt, Object... args) {
        println(prompt,args);
        return scanner.nextLong();
    }

    //User should enter mode = 'S' to switch to scientific mode operation
    /*Switch display mode (binary, octal, decimal, hexadecimal)
    switchDisplayMode() should rotate through the options
    switchDisplayMode(String mode) should set the display to the mode given
    */
    public void switchDisplayMode(String mode)
    {
        String calcMode = mode;
    }

    public double switchDisplayMode()
    {
        double res=0;
        return res;
    }

    /*Memory - Store up to one numeric value in memory for recall later (default to 0) *
    (M+ key) Add the currently displayed value to the value in memory (store in memory and update display) *
    (MC key) Reset memory *
    (MRC key) Recall the current value from memory to the display *
     */
    public double memoryOut()
    {
        double memRes = 0;
        return memRes;
    } 

}
