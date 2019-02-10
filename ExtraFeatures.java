
/**
 * Write a description of class ExtraFeatures here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExtraFeatures
{
    // instance variables - replace the example below with your own
    private double input1, input2, result;

    /**
     * Constructor for objects of class ExtraFeatures
     */
    public ExtraFeatures()
    {
        // initialise instance variables
        input1 = 0;
        input2 = 0;
    }

    /**
     * Set input1 to PI
     *
     * @param  none
     * @return none
     */
    public double usePi()
    {
        return input1 = Math.PI;
    }
    
        /**
     * Create random number between zero and user input
     *
     * @param  input1 = user input
     * @return random number between zero and the user input
     */
    public double randomNumber(double input1)
    {
        return result = Math.floor(Math.random() * input1);
    }
}
