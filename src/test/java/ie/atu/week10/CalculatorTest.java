package ie.atu.week10;

import ie.atu.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator newCalc;
    @Test
    void testAdd()
    {
        newCalc = new Calculator();
        assertEquals(10, newCalc.add(4,6));
    }
    @Test
    void testSubtract()
    {
        newCalc = new Calculator();
        assertEquals(4, newCalc.subtract(9,5));
    }
    @Test
    void testDivide()
    {
        newCalc = new Calculator();
        assertEquals(10, newCalc.divide(30,3));
    }
    @Test
    void testMultiply()
    {
        newCalc = new Calculator();
        assertEquals(30, newCalc.multiply(10,3));
    }
}
