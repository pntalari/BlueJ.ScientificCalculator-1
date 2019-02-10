import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Kate B. 02/09/19 (via leon on 8/26/18).
 */
public class Scientific_Tests extends BasicCalculator {
    private static volatile BasicCalculator calc = new BasicCalculator();


    @Test
    // Test Sine - positive decimal
    public void testSine1(){
        // : Given
        double num1 = 60.3;
        double expectedResult = Math.sin(num1);
        // : When
        double actualResult = calc.sine(num1);
        // : Then
        assertEquals(expectedResult,actualResult);
    }

    @Test
    // Test Sine - negative number
    public void testSine2(){
        // : Given
        double num1 = -60;
        double expectedResult = Math.sin(num1);
        // : When
        double actualResult = calc.sine(num1);
        // : Then
        assertEquals(expectedResult,actualResult);
    }

    @Test
    // Test Cosine - positive decimal
    public void testCosine1(){
        // : Given
        double num1 = 60.3;
        double expectedResult = Math.cos(num1);
        // : When
        double actualResult = calc.cosine(num1);
        // : Then
        assertEquals(expectedResult,actualResult);
    }

    @Test
    // Test Cosine - negative number
    public void testCosine2(){
        // : Given
        double num1 = -60;
        double expectedResult = Math.cos(num1);
        // : When
        double actualResult = calc.cosine(num1);
        // : Then
        assertEquals(expectedResult,actualResult);
    }
            

    @Test
    // Test Cosine - positive decimal
    public void testCosine1(){
        // : Given
        double num1 = 60.3;
        double expectedResult = Math.cos(num1);
        // : When
        double actualResult = calc.cosine(num1);
        // : Then
        assertEquals(expectedResult,actualResult);
    }

    @Test
    // Test Cosine - negative number
    public void testCosine2(){
        // : Given
        double num1 = -60;
        double expectedResult = Math.cos(num1);
        // : When
        double actualResult = calc.cosine(num1);
        // : Then
        assertEquals(expectedResult,actualResult);
    }

    @Test
    // Test Tangent - positive decimal
    public void testTangent1(){
        // : Given
        double num1 = 60.3;
        double expectedResult = Math.tan(num1);
        // : When
        double actualResult = calc.cosine(num1);
        // : Then
        assertEquals(expectedResult,actualResult);
    }

    @Test
    // Test Tangent - negative number
    public void testTangent2(){
        // : Given
        double num1 = -60;
        double expectedResult = Math.tan(num1);
        // : When
        double actualResult = calc.cosine(num1);
        // : Then
        assertEquals(expectedResult,actualResult);
    }
                           
    @Test
    // Test inverse sine 
    public void testInverseSine1(){
        // : Given
        double num1 = 1;
        double expectedResult = 90;
        // : When
        double actualResult = calc.inverseSine(num1);
        // : Then
        assertEquals(expectedResult,actualResult);
    }

    // Need 2nd test for inverse sine 
    
    @Test
    // Test inverse cosine
    public void testInverseCosine(){
        // : Given
        double num1 = 1;
        double expectedResult = 0;
        // : When
        double actualResult = calc.inverseCosine(num1);
        // : Then
        assertEquals(expectedResult,actualResult);
    }
          
    // Need 2nd test for inverse cosine 

}