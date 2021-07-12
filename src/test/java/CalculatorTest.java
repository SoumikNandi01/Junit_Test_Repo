import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void start() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        int result = calculator.add(1, 2);
        assertEquals(3, result);
    }

    @Test
    public void testSubtract_SubtractFromGreater() {
        int result = calculator.subtract(10, 2);
        assertEquals(8, result);
    }

    @Test
    public void testSubtract_SubtractFromSmaller() {
        int result = calculator.subtract(2, 10);
        assertEquals(8, result);
    }

    @Test
    public void testMultiply() {
        int result = calculator.multiply(10, 2);
        assertEquals(20, result);
    }

    @Test
    public void testMultiply_WithZero() {
        int result = calculator.multiply(0, 1);
        assertEquals(0, result);
    }
}