import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testAddition() {
        assertEquals(4, Calculator.add(2, 2));
    }

    @Test
    public void testSubtraction() {
        assertEquals(0, Calculator.subtract(2, 2));
    }

    @Test
    public void testMultiplication() {
        assertEquals(4, Calculator.multiply(2, 2));
    }

    @Test
    public void testDivision() {
        assertEquals(2, Calculator.divide(4, 2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionByZero() {
        Calculator.divide(4, 0);
    }
}