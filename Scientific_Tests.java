import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Kate B. 02/09/19 (via leon on 8/26/18).
 */
public class Scientific_Tests extends ScientificCalc {
    private static volatile ScientificCalc calc = new ScientificCalc();


    @Test
    // Test Sine - positive decimal
    public void testSine1(){
        // : Given
        double num1 = 60.3;
        double expectedResult = Math.sin(num1);
        // : When
        double actualResult = calc.sin(num1);
        // : Then
        assertEquals(expectedResult,actualResult, 0);
    }

    @Test
    // Test Sine - negative number
    public void testSine2(){
        // : Given
        double num1 = -60;
        double expectedResult = Math.sin(num1);
        // : When
        double actualResult = calc.sin(num1);
        // : Then
        assertEquals(expectedResult,actualResult, 0);
    }

    @Test
    // Test Cosine - positive decimal
    public void testCosine1(){
        // : Given
        double num1 = 60.3;
        double expectedResult = Math.cos(num1);
        // : When
        double actualResult = calc.cos(num1);
        // : Then
        assertEquals(expectedResult,actualResult, 0);
    }

    @Test
    // Test Cosine - negative number
    public void testCosine2(){
        // : Given
        double num1 = -60;
        double expectedResult = Math.cos(num1);
        // : When
        double actualResult = calc.cos(num1);
        // : Then
        assertEquals(expectedResult,actualResult, 0);
    }
        
    @Test
    // Test Tangent - positive decimal
    public void testTangent1(){
        // : Given
        double num1 = 60.3;
        double expectedResult = Math.tan(num1);
        // : When
        double actualResult = calc.tan(num1);
        // : Then
        assertEquals(expectedResult,actualResult, 0);
    }

    @Test
    // Test Tangent - negative number
    public void testTangent2(){
        // : Given
        double num1 = -60;
        double expectedResult = Math.tan(num1);
        // : When
        double actualResult = calc.tan(num1);
        // : Then
        assertEquals(expectedResult,actualResult, 0);
    }
                           
    @Test
    // Test inverse sine 
    public void testInverseSine1(){
        // : Given
        double num1 = 1;
        double expectedResult = 90;
        // : When
        double actualResult = calc.inverseSin(num1);
        // : Then
        assertEquals(expectedResult,actualResult, 0);
    }

    @Test
    // Test inverse sine NAN when >1
    public void testInverseSine2(){
        // : Given
        double num1 = 2;
        double expectedResult = Double.NaN;
        // : When
        double actualResult = calc.inverseSin(num1);
        // : Then
        assertEquals(expectedResult,actualResult, 0);
    }

    
    @Test
    // Test inverse cosine
    public void testInverseCosine1(){
        // : Given
        double num1 = 1;
        double expectedResult = 0;
        // : When
        double actualResult = calc.inverseCos(num1);
        // : Then
        assertEquals(expectedResult,actualResult, 0);
    }
          
    @Test
    // Test inverse cosine NAN when >1
    public void testInverseCosine2(){
        // : Given
        double num1 = 2;
        double expectedResult = Double.NaN;
        // : When
        double actualResult = calc.inverseCos(num1);
        // : Then
        assertEquals(expectedResult,actualResult, 0);
    } 

}