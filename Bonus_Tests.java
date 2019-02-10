import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Kate B. 02/09/19 (via leon on 8/26/18).
 */
public class Bonus_Tests extends BasicCalculator {
    private static volatile BasicCalculator calc = new BasicCalculator();


    @Test
    // Test Factorial
    public void testFactorial1(){
        // : Given
        double num1 = 5;
        double expectedResult = 120;
        // : When
        double actualResult = calc.factorial(num1);
        // : Then
        assertEquals(expectedResult,actualResult);
    }

    @Test
    // Test Factorial w negative number
    public void testFactorial2(){
        // : Given
        double num1 = -5;
        double expectedResult = -120;
        // : When
        double actualResult = calc.factorial(num1);
        // : Then
        assertEquals(expectedResult,actualResult);
    }
    
    
    @Test
    // Test Log
    public void testLog1(){
        // : Given
        double num1 = 1000;
        double expectedResult = 3;
        // : When
        double actualResult = calc.log(num1);
        // : Then
        assertEquals(expectedResult,actualResult);
    }

    @Test
    // Test Log w/ negative number
    public void testLog2(){
        // : Given
        double num1 = -10;
        String expectedResult = "err";
        // : When
        double actualResult = calc.log(num1);
        // : Then
        assertEquals(expectedResult,actualResult);
    }
   
    @Test
    // Test 10^x
    public void testTenPower1(){
        // : Given
        double num1 = 3;
        double expectedResult = 100;
        // : When
        double actualResult = calc.tenPower(num1);
        // : Then
        assertEquals(expectedResult,actualResult);
    }
   
    @Test
    // Test 10^x
    public void testTenPower2(){
        // : Given
        double num1 = -3;
        double expectedResult = .001;
        // : When
        double actualResult = calc.tenPower(num1);
        // : Then
        assertEquals(expectedResult,actualResult);
    }
    
    @Test
    // Test Ln
    public void testLn1(){
        // : Given
        double num1 = 10;
        double expectedResult = Math.log(num1);
        // : When
        double actualResult = calc.ln(num1);
        // : Then
        assertEquals(expectedResult,actualResult);
    } 
   
    @Test
    // Test Ln w/ negative number
    public void testLn2(){
        // : Given
        double num1 = -10;
        String expectedResult = "err";
        // : When
        double actualResult = calc.ln(num1);
        // : Then
        assertEquals(expectedResult,actualResult);
    }
        
    @Test
    // Test e^x
    public void testEtox(){
        // : Given
        double num1 = 10;
        double expectedResult = Math.exp(num1);
        // : When
        double actualResult = calc.eTox(num1);
        // : Then
        assertEquals(expectedResult,actualResult);
    }
   
    @Test
    // Test e^x w/ negative number
    public void testEtox(){
        // : Given
        double num1 = -10;
        String expectedResult = "err";
        // : When
        double actualResult = calc.eTox(num1);
        // : Then
        assertEquals(expectedResult,actualResult);
    }
            
    
}