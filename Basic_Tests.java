import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Kate B. 02/09/19 (via leon on 8/26/18).
 */
public class Basic_Tests extends BasicCalc {
    private static volatile Basic_Tests calc = new Basic_Tests();

    @Test
    // Test - Adding two positive numbers, one a decimal
    public void testAdd1(){
        // : Given
        String operation = "+";
        double num1 = 10.5;
        double num2 = 47;
        double expectedResult = 57.5;
        // : When
        double actualResult = calc.main(operation, num1,num2);
        // : Then
        assertEquals(expectedResult,actualResult);
    }

    @Test
    // Test - Adding a positive and a negative number
    public void testAdd2(){
        // : Given
        String operation = "+";
        double num1 = 10;
        double num2 = -47;
        double expectedResult = -37;
        // : When
        double actualResult = calc.main(operation, num1,num2);
        // : Then
        assertEquals(expectedResult,actualResult);
    }    

    @Test
    // Test - Subtracting two positive numbers, one a decimal
    public void testSubtract1(){
        // : Given
        String operation = "-";
        double num1 = 47.5;
        double num2 = 10;
        double expectedResult = 37.5;
        // : When
        double actualResult = calc.main(operation, num1,num2);
        // : Then
        assertEquals(expectedResult,actualResult);
    }

    @Test
    // Test - Subtracting a positive and a negative number
    public void testSubtract2(){
        // : Given
        String operation = "1";
        double num1 = 47;
        double num2 = -10;
        double expectedResult = 57;
        // : When
        double actualResult = calc.main(operation, num1,num2);
        // : Then
        assertEquals(expectedResult,actualResult);
    }    

    @Test
    // Test - Multiplying two positive numbers, one a decimal
    public void testMultiply1(){
        // : Given
        String operation = "-";
        double num1 = 10;
        double num2 = 47.5;
        double expectedResult = 475;
        // : When
        double actualResult = calc.main(operation, num1,num2);
        // : Then
        assertEquals(expectedResult,actualResult);
    }

    @Test
    // Test - Multiplying a positive and negative number
    public void testMultiply2(){
        // : Given
        String operation = "-";
        double num1 = 10;
        double num2 = -47;
        double expectedResult = -470;
        // : When
        double actualResult = calc.main(operation, num1,num2);
        // : Then
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testDivide1(){
        // : Given
        String operation = "/";
        double num1 = 10;
        double num2 = 3;
        double expectedResult = 10 / 3;
        // : When
        double actualResult = calc.main(operation, num1,num2);
        // : Then
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testDivide2(){
        // : Given
        String operation = "/";
        double num1 = 10;
        double num2 = 0;
        double expectedResult = Double.NaN;
        // : When
        double actualResult = calc.main(operation, num1,num2);
        // : Then
        assertEquals(expectedResult,actualResult);
    }
        
    @Test
    // Test - square of positive decimal number
    public void testSquare1(){
        // : Given
        String operation = "sqr";
        double num1 = 5.2;
        double expectedResult = 27.04;
        // : When
        double actualResult = calc.main(operation,num1);
        // : Then
        assertEquals(expectedResult,actualResult);
    }
        
    @Test
    // Test square of negative number
    public void testSquare2(){
        // : Given
        String operation = "sqr";
        double num1 = -5;
        double expectedResult = 25;
        // : When
        double actualResult = calc.main(operation, num1);
        // : Then
        assertEquals(expectedResult,actualResult);
    }
        
    @Test
    // Test square root of positive decimal
    public void testSquareRoot1(){
        // : Given
        String operation = "sqrt";
        double num1 = 27.04;
        double expectedResult = 5.2;
        // : When
        double actualResult = calc.main(operation, num1);
        // : Then
        assertEquals(expectedResult,actualResult);
    }

    @Test
    // Test square root of negative number
    public void testSquareRoot2(){
        // : Given
        String operation = "sqrt";
        double num1 = -25;
        double expectedResult = Double.NaN;
        // : When
        double actualResult = calc.main(operation,num1);
        // : Then
        assertEquals(expectedResult,actualResult);
    }
    
    @Test
    // Test Exponentiation with positive exponent
    public void testExponentiation1(){
        // : Given
        String operation = "^";
        double num1 = 2.5;
        double num2 = 5;
        double expectedResult = 97.65625;
        // : When
        double actualResult = calc.main(operation,num1, num2);
        // : Then
        assertEquals(expectedResult,actualResult);
    }
    
    @Test
    // Test Exponentiation with negative exponent
    public void testExponentiation2(){
        // : Given
        String operation = "^";
        double num1 = 2;
        double num2 = -5;
        double expectedResult = .03125;
        // : When
        double actualResult = calc.main(operation,num1, num2);
        // : Then
        assertEquals(expectedResult,actualResult);
    }    

    @Test
    // Test Inverse - whole number
    public void testInverse1(){
        // : Given
        String operation = "inv";
        double num1 = 16;
        double expectedResult = .0625;
        // : When
        double actualResult = calc.main(operation,num1);
        // : Then
        assertEquals(expectedResult,actualResult);
    }

    @Test
    // Test Inverse - decimal
    public void testInverse2(){
        // : Given
        String operation = "inv";
        double num1 = .0625;
        double expectedResult = 16;
        // : When
        double actualResult = calc.main(operation,num1);
        // : Then
        assertEquals(expectedResult,actualResult);
    }    

    @Test
    // Test Invert Sign - positive number
    public void testInvertSign1(){
        // : Given
        String operation = "isign";
        double num1 = 2;
        double expectedResult = -2;
        // : When
        double actualResult = calc.main(operation,num1);
        // : Then
        assertEquals(expectedResult,actualResult);
    }

    @Test
    // Test Invert Sign - negative number
    public void testInvertSign2(){
        // : Given
        String operation = "isign";
        double num1 = -2;
        double expectedResult = 2;
        // : When
        double actualResult = calc.main(operation,num1);
        // : Then
        assertEquals(expectedResult,actualResult);
    }    
    
    
    
}
