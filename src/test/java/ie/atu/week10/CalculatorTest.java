package ie.atu.week10;

public class CalculatorTest {
    Calculator newCalc;

    void testAdd()
    {
        newCalc = new Calculator();
        int result = newCalc.add(4,6);
    }
}
