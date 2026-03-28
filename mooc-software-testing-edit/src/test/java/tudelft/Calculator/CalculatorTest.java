package tudelft.Calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testSum() {
        Calculator calc = new Calculator();
        int result = calc.sum(5, 3);
        Assertions.assertEquals(8, result);
    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        int result = calc.subtract(10, 4);
        Assertions.assertEquals(6, result);
    }

    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();
        int result = calc.multiply(3, 4);
        Assertions.assertEquals(12, result);
    }

    @Test
    public void testDivideByZero() {
        Calculator calc = new Calculator();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(10, 0);
        });
    }
}