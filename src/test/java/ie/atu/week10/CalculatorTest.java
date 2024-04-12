package ie.atu.week10;

public class CalculatorTest {
    Calculator newCalc;
    @Test
    void testAdd()
    {
        newCalc = new Calculator();
        assertEquals(10, newCalc.add(4,6));
    }
}
