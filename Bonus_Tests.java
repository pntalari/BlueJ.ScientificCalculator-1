import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Kate B. 02/09/19 (via leon on 8/26/18).
 */
public class Bonus_Tests {
    private static volatile BonusCalc calc = new BonusCalc();


    @Test
    // Test Factorial
    public void testFactorial1(){
        // : Given
        double num1 = 5;
        double expectedResult = 120;
        // : When
        double actualResult = calc.factorial(num1);
        // : Then
        assertEquals(expectedResult,actualResult, 0);
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
        assertEquals(expectedResult,actualResult, 0);
    }
    
    
    @Test
    // Test Log10
    public void testLogTen1(){
        // : Given
        double num1 = 1000;
        double expectedResult = 3;
        // : When
        double actualResult = calc.logTen(num1);
        // : Then
        assertEquals(expectedResult,actualResult, 0);
    }

    @Test
    // Test Log w/ negative number
    public void testLogTen2(){
        // : Given
        double num1 = -10;
        double expectedResult = Double.NaN;
        // : When
        double actualResult = calc.logTen(num1);
        // : Then
        assertEquals(expectedResult,actualResult, 0);
    }
   
    @Test
    // Test 10^x
    public void testTenX1(){
        // : Given
        double num1 = 3;
        double expectedResult = 1000;
        // : When
        double actualResult = calc.tenX(num1);
        // : Then
        assertEquals(expectedResult,actualResult, 0);
    }
   
    @Test
    // Test 10^x
    public void testTenX2(){
        // : Given
        double num1 = -3;
        double expectedResult = .001;
        // : When
        double actualResult = calc.tenX(num1);
        // : Then
        assertEquals(expectedResult,actualResult, 0);
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
        assertEquals(expectedResult,actualResult, 0);
    } 
   
    @Test
    // Test Ln w/ negative number
    public void testLn2(){
        // : Given
        double num1 = -10;
        double expectedResult = Double.NaN;
        // : When
        double actualResult = calc.ln(num1);
        // : Then
        assertEquals(expectedResult,actualResult, 0);
    }
        
    @Test
    // Test e^x
    public void testEtox1(){
        // : Given
        double num1 = 10;
        double expectedResult = Math.exp(num1);
        // : When
        double actualResult = calc.eTox(num1);
        // : Then
        assertEquals(expectedResult,actualResult, 0);
    }
   
    @Test
    // Test e^x w/ negative number
    public void testEtox2(){
        // : Given
        double num1 = -10;
        double expectedResult = Math.exp(num1);
        // : When
        double actualResult = calc.eTox(num1);
        // : Then
        assertEquals(expectedResult,actualResult, 0);
    }
            
    
}